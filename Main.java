package co.edu.uniquindio.poo.collections.Generics;

public class Main {
    public static void main(String[] args) {
        CarritoCompras<Articulo> carrito = new CarritoCompras<>();

        carrito.agregarProducto(new Articulo("Laptop", 3500000.00));
        carrito.agregarProducto(new Articulo("Mouse", 85000.00));
        carrito.agregarProducto(new Articulo("Monitor", 750000.00));

        System.out.println("Precio total: $" + carrito.calcularPrecioTotal());
        System.out.println("Producto más costoso: " + carrito.obtenerProductoMayorPrecio().getPrecio());

        // PRUEBA DEL ITERADOR PROPIO
        System.out.println("\n--- Recorriendo productos con iterador ---");

        for (Articulo articulo : carrito) {
            System.out.println("Producto en carrito: " + articulo);
        }

    }
}