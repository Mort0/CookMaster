import java.util.*;

public class CookMasterApp {
    public static void main(String[] args) {
        System.out.println("=== CookMaster - Sistema de Recetas ===\n");

        LibroDeRecetas libro = LibroDeRecetas.getInstancia();

        System.out.println("Creando receta de tipo: POSTRE");
        Receta tiramisu = new PostreBuilder()
                .crearNuevaReceta()
                .setNombre("Tiramisú")
                .setTiempoPreparacion(40)
                .agregarIngrediente("Café", 200, "ml")
                .agregarIngrediente("Mascarpone", 250, "g")
                .agregarIngrediente("Huevos", 3, "unidades")
                .agregarIngrediente("Azúcar", 80, "g")
                .agregarPaso(1, "Preparar el café fuerte y dejar enfriar.")
                .agregarPaso(2, "Separar yemas y claras. Batir las yemas con el azúcar hasta obtener una mezcla pálida.")
                .agregarPaso(3, "Mezclar el queso mascarpone con las yemas azucaradas hasta integrar.")
                .agregarPaso(4, "Humedecer los bizcochos en café y formar capas alternando con la crema de mascarpone.")
                .agregarPaso(5, "Refrigerar al menos 3 horas y espolvorear cacao antes de servir.")
                .setNivelDulce("Medio")
                .setVegetariano(true)
                .build();

        libro.agregarReceta(tiramisu);


        System.out.println("\nCreando receta de tipo: BEBIDA");
        Receta limonada = new BebidaBuilder()
                .crearNuevaReceta()
                .setNombre("Limonada Natural")
                .setTiempoPreparacion(10)
                .agregarIngrediente("Limones", 4, "unidades")
                .agregarIngrediente("Agua", 1, "litro")
                .agregarIngrediente("Azúcar", 100, "g")
                .agregarIngrediente("Hielo", 200, "g")
                .agregarPaso(1, "Exprimir los limones para obtener el jugo.")
                .agregarPaso(2, "Mezclar el jugo de limón con agua fría.")
                .agregarPaso(3, "Añadir azúcar al gusto y revolver hasta disolver completamente.")
                .agregarPaso(4, "Servir con hielo y decorar con rodajas de limón.")
                .setConAlcohol(false)
                .setTemperatura("Fría")
                .build();

        libro.agregarReceta(limonada);


        libro.listarRecetas();


        tiramisu.mostrarReceta();


        System.out.println("\n=== Verificación de Singleton ===");
        LibroDeRecetas libro2 = LibroDeRecetas.getInstancia();
        System.out.println("¿Misma instancia? " + (libro == libro2));
        System.out.println("Total de recetas en libro2: " + libro2.obtenerTodasLasRecetas().size());
    }
}
