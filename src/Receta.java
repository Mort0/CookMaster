import java.util.*;
abstract class Receta {
    protected String nombre;
    protected int tiempoPreparacion;
    protected List<Ingrediente> ingredientes;
    protected List<Paso> pasos;

    public Receta() {
        this.ingredientes = new ArrayList<>();
        this.pasos = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public int getTiempoPreparacion() { return tiempoPreparacion; }
    public List<Ingrediente> getIngredientes() { return ingredientes; }
    public List<Paso> getPasos() { return pasos; }

    public abstract String getTipo();

    public void mostrarReceta() {
        System.out.println("\n=== Detalle de Receta ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + getTipo());
        System.out.println("Tiempo de preparación: " + tiempoPreparacion + " min");

        System.out.println("\nIngredientes (" + ingredientes.size() + "):");
        for (int i = 0; i < ingredientes.size(); i++) {
            System.out.println("  " + (i + 1) + ") " + ingredientes.get(i));
        }

        System.out.println("\nPasos (" + pasos.size() + "):");
        for (Paso paso : pasos) {
            System.out.println("  " + paso);
        }

        mostrarAtributosEspecificos();
    }

    protected abstract void mostrarAtributosEspecificos();
}
