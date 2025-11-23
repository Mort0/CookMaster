class PlatoFuerteBuilder extends RecetaBuilder {

    @Override
    public PlatoFuerteBuilder crearNuevaReceta() {
        receta = new PlatoFuerte();
        return this;
    }

    @Override
    public PlatoFuerteBuilder setNombre(String nombre) {
        receta.nombre = nombre;
        return this;
    }

    @Override
    public PlatoFuerteBuilder setTiempoPreparacion(int tiempo) {
        receta.tiempoPreparacion = tiempo;
        return this;
    }

    @Override
    public PlatoFuerteBuilder agregarIngrediente(String nombre, double cantidad, String unidad) {
        receta.ingredientes.add(new Ingrediente(nombre, cantidad, unidad));
        return this;
    }

    @Override
    public PlatoFuerteBuilder agregarPaso(int numero, String descripcion) {
        receta.pasos.add(new Paso(numero, descripcion));
        return this;
    }

    public PlatoFuerteBuilder setTipoCoccion(String tipo) {
        ((PlatoFuerte)receta).setTipoCoccion(tipo);
        return this;
    }

    public PlatoFuerteBuilder setCalorias(int calorias) {
        ((PlatoFuerte)receta).setCalorias(calorias);
        return this;
    }
}
