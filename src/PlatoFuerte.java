class PlatoFuerte extends Receta {
    private String tipoCoccion;
    private int calorias;

    public PlatoFuerte() {
        super();
    }

    public void setTipoCoccion(String tipoCoccion) {
        this.tipoCoccion = tipoCoccion;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public String getTipoCoccion() { return tipoCoccion; }
    public int getCalorias() { return calorias; }

    @Override
    public String getTipo() {
        return "PlatoFuerte";
    }

    @Override
    protected void mostrarAtributosEspecificos() {
        System.out.println("\nEtiquetas / Atributos adicionales:");
        System.out.println("  - Tipo de cocción: " + tipoCoccion);
        System.out.println("  - Calorías: " + calorias + " kcal");
    }
}
