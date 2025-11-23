#  CookMaster - Sistema de Gestión de Recetas

Sistema de gestión de recetas culinarias desarrollado en Java que permite crear, organizar y consultar recetas de diferentes tipos (Postres, Platos Fuertes y Bebidas) mediante la implementación de patrones de diseño.

## 📋 Descripción

CookMaster es una aplicación que facilita la gestión de recetas gastronómicas, permitiendo almacenar información detallada de cada receta incluyendo ingredientes, pasos de preparación, tiempo estimado y atributos específicos según el tipo de receta.

## 🎯 Características Principales

- ✅ **Creación de recetas** con sintaxis fluida y expresiva
- ✅ **Tres tipos de recetas**: Postre, Plato Fuerte y Bebida
- ✅ **Gestión de ingredientes** con cantidades y unidades de medida
- ✅ **Pasos de preparación** numerados y descriptivos
- ✅ **Libro de recetas centralizado** con búsqueda por nombre
- ✅ **Atributos específicos** por tipo de receta:
  - **Postre**: nivel de dulce, vegetariano
  - **Plato Fuerte**: tipo de cocción, calorías
  - **Bebida**: con/sin alcohol, temperatura

## 🏗️ Patrones de Diseño Implementados

### Builder Pattern
Permite construir recetas complejas paso a paso de manera clara y flexible:

```java
Receta tiramisu = new PostreBuilder()
    .crearNuevaReceta()
    .setNombre("Tiramisú")
    .setTiempoPreparacion(40)
    .agregarIngrediente("Café", 200, "ml")
    .agregarIngrediente("Mascarpone", 250, "g")
    .agregarPaso(1, "Preparar el café fuerte y dejar enfriar.")
    .setNivelDulce("Medio")
    .setVegetariano(true)
    .build();
```

### Singleton Pattern
Garantiza una única instancia del libro de recetas:

```java
LibroDeRecetas libro = LibroDeRecetas.getInstancia();
libro.agregarReceta(tiramisu);
libro.listarRecetas();
```

## 🚀 Uso Rápido

```java
// 1. Obtener instancia del libro de recetas
LibroDeRecetas libro = LibroDeRecetas.getInstancia();

// 2. Crear una receta usando el Builder apropiado
Receta limonada = new BebidaBuilder()
    .crearNuevaReceta()
    .setNombre("Limonada Natural")
    .setTiempoPreparacion(10)
    .agregarIngrediente("Limones", 4, "unidades")
    .agregarIngrediente("Agua", 1, "litro")
    .setTemperatura("Fría")
    .setConAlcohol(false)
    .build();

// 3. Agregar al libro
libro.agregarReceta(limonada);

// 4. Consultar recetas
libro.listarRecetas();
Receta receta = libro.buscarPorNombre("Limonada Natural");
receta.mostrarReceta();
```

## 📁 Estructura del Proyecto

```
CookMaster/
│
├── Ingrediente.java          # Representa ingredientes con cantidad y unidad
├── Paso.java                 # Representa pasos de preparación
│
├── Receta.java               # Clase abstracta base
├── Postre.java               # Tipo de receta: Postre
├── PlatoFuerte.java          # Tipo de receta: Plato Fuerte
├── Bebida.java               # Tipo de receta: Bebida
│
├── RecetaBuilder.java        # Builder abstracto
├── PostreBuilder.java        # Builder para Postres
├── PlatoFuerteBuilder.java   # Builder para Platos Fuertes
├── BebidaBuilder.java        # Builder para Bebidas
│
├── LibroDeRecetas.java       # Singleton - Repositorio de recetas
└── CookMasterApp.java        # Aplicación principal (Main)
```

## 🛠️ Requisitos

- Java 8 o superior
- JDK instalado

## ▶️ Compilación y Ejecución

```bash
# Compilar
javac CookMasterApp.java

# Ejecutar
java CookMasterApp
```

## 📊 Diagrama de Clases

El sistema implementa una arquitectura basada en:
- **Jerarquía de herencia** para tipos de recetas
- **Patrón Builder** para construcción flexible de objetos complejos
- **Patrón Singleton** para gestión centralizada del repositorio
- **Composición** para ingredientes y pasos

## 🎓 Principios Aplicados

- ✅ **SOLID**: Single Responsibility, Open/Closed, Liskov Substitution, Dependency Inversion
- ✅ **DRY**: Reutilización de código en la clase base
- ✅ **Separation of Concerns**: Cada clase tiene una responsabilidad clara
- ✅ **Encapsulación**: Atributos privados con getters/setters apropiados

## 🔮 Posibles Extensiones

- Persistencia en base de datos o archivos
- Búsqueda avanzada y filtros
- Cálculo nutricional automático
- Escalado de porciones
- Sistema de valoraciones y comentarios
- Exportación a PDF o formato de impresión

## 👨‍💻 Autor

Desarrollado como proyecto académico para demostrar la aplicación de patrones de diseño en Java.

## 📝 Licencia

Este proyecto es de código abierto y está disponible para fines educativos.

---

⭐ Si este proyecto te fue útil, no olvides darle una estrella en GitHub
