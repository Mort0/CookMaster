class BebidaBuilder extends RecetaBuilder {

    @Override
    public BebidaBuilder crearNuevaReceta() {
        receta = new Bebida();
        return this;
    }

    @Override
    public BebidaBuilder setNombre(String nombre) {
        receta.nombre = nombre;
        return this;
    }

    @Override
    public BebidaBuilder setTiempoPreparacion(int tiempo) {
        receta.tiempoPreparacion = tiempo;
        return this;
    }

    @Override
    public BebidaBuilder agregarIngrediente(String nombre, double cantidad, String unidad) {
        receta.ingredientes.add(new Ingrediente(nombre, cantidad, unidad));
        return this;
    }

    @Override
    public BebidaBuilder agregarPaso(int numero, String descripcion) {
        receta.pasos.add(new Paso(numero, descripcion));
        return this;
    }

    public BebidaBuilder setConAlcohol(boolean conAlcohol) {
        ((Bebida)receta).setConAlcohol(conAlcohol);
        return this;
    }

    public BebidaBuilder setTemperatura(String temperatura) {
        ((Bebida)receta).setTemperatura(temperatura);
        return this;
    }
}