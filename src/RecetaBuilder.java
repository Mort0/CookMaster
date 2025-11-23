abstract class RecetaBuilder {
    protected Receta receta;

    public abstract RecetaBuilder crearNuevaReceta();
    public abstract RecetaBuilder setNombre(String nombre);
    public abstract RecetaBuilder setTiempoPreparacion(int tiempo);
    public abstract RecetaBuilder agregarIngrediente(String nombre, double cantidad, String unidad);
    public abstract RecetaBuilder agregarPaso(int numero, String descripcion);

    public Receta build() {
        return receta;
    }
}
