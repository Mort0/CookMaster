class Postre extends Receta {
    private String nivelDulce;
    private boolean vegetariano;

    public Postre() {
        super();
    }

    public void setNivelDulce(String nivelDulce) {
        this.nivelDulce = nivelDulce;
    }

    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }

    public String getNivelDulce() { return nivelDulce; }
    public boolean isVegetariano() { return vegetariano; }

    @Override
    public String getTipo() {
        return "Postre";
    }

    @Override
    protected void mostrarAtributosEspecificos() {
        System.out.println("\nEtiquetas / Atributos adicionales:");
        System.out.println("  - Nivel de dulce: " + nivelDulce);
        System.out.println("  - Vegetariano: " + (vegetariano ? "Sí" : "No"));
    }
}
