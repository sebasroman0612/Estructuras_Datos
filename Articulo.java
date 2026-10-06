package co.edu.uniquindio.poo.collections.Generics;

// Implementación concreta de un producto
class Articulo implements Producto {
    private String nombre;
    private double precio;

    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public String toString() {
        return nombre + " ($" + precio + ")";
    }
}
