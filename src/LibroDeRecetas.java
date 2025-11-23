import java.util.*;
class LibroDeRecetas {
    private static LibroDeRecetas instancia;
    private List<Receta> recetas;

    private LibroDeRecetas() {
        recetas = new ArrayList<>();
    }

    public static LibroDeRecetas getInstancia() {
        if (instancia == null) {
            instancia = new LibroDeRecetas();
        }
        return instancia;
    }

    public void agregarReceta(Receta receta) {
        recetas.add(receta);
        System.out.println("➜ Receta creada: " + receta.getNombre());
        System.out.println("➜ Ingredientes añadidos: " + receta.getIngredientes().size());
        System.out.println("➜ Pasos añadidos: " + receta.getPasos().size());
        System.out.println("Receta guardada en el Libro de Recetas.");
    }

    public List<Receta> obtenerTodasLasRecetas() {
        return new ArrayList<>(recetas);
    }

    public Receta buscarPorNombre(String nombre) {
        for (Receta receta : recetas) {
            if (receta.getNombre().equalsIgnoreCase(nombre)) {
                return receta;
            }
        }
        return null;
    }

    public void listarRecetas() {
        System.out.println("\n" + "=".repeat(45));
        System.out.println("Listado de recetas registradas:");
        for (int i = 0; i < recetas.size(); i++) {
            Receta r = recetas.get(i);
            System.out.println((i + 1) + ". " + r.getNombre() + " (" + r.getTipo() +
                    ") - Tiempo: " + r.getTiempoPreparacion() + " min");
        }
        System.out.println("=".repeat(45));
        System.out.println("\nDetalles del Libro de Recetas:");
        System.out.println("Total recetas almacenadas: " + recetas.size());
        System.out.println("Instancia del libro: OK (Singleton activo)");
    }
}