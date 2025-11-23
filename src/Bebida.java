class Bebida extends Receta {
    private boolean conAlcohol;
    private String temperatura;

    public Bebida() {
        super();
    }

    public void setConAlcohol(boolean conAlcohol) {
        this.conAlcohol = conAlcohol;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isConAlcohol() { return conAlcohol; }
    public String getTemperatura() { return temperatura; }

    @Override
    public String getTipo() {
        return "Bebida";
    }

    @Override
    protected void mostrarAtributosEspecificos() {
        System.out.println("\nEtiquetas / Atributos adicionales:");
        System.out.println("  - Con alcohol: " + (conAlcohol ? "Sí" : "No"));
        System.out.println("  - Temperatura: " + temperatura);
    }
}
