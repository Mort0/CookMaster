class PostreBuilder extends RecetaBuilder {

    @Override
    public PostreBuilder crearNuevaReceta() {
        receta = new Postre();
        return this;
    }

    @Override
    public PostreBuilder setNombre(String nombre) {
        receta.nombre = nombre;
        return this;
    }

    @Override
    public PostreBuilder setTiempoPreparacion(int tiempo) {
        receta.tiempoPreparacion = tiempo;
        return this;
    }

    @Override
    public PostreBuilder agregarIngrediente(String nombre, double cantidad, String unidad) {
        receta.ingredientes.add(new Ingrediente(nombre, cantidad, unidad));
        return this;
    }

    @Override
    public PostreBuilder agregarPaso(int numero, String descripcion) {
        receta.pasos.add(new Paso(numero, descripcion));
        return this;
    }

    public PostreBuilder setNivelDulce(String nivel) {
        ((Postre)receta).setNivelDulce(nivel);
        return this;
    }

    public PostreBuilder setVegetariano(boolean vegetariano) {
        ((Postre)receta).setVegetariano(vegetariano);
        return this;
    }
}
