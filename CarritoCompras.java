package co.edu.uniquindio.poo.collections.Generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator; // Importante importar Iterator
import java.util.List;
import java.util.NoSuchElementException;


public class CarritoCompras<T extends Producto> implements Iterable<T> {

    private List<T> items;

    public CarritoCompras() {
        this.items = new ArrayList<>();
    }

    public void agregarProducto(T producto) {
        items.add(producto);
    }

    public T obtenerProductoMayorPrecio() {
        if (items.isEmpty()) return null;
        return items.stream().max(Comparator.comparing(Producto::getPrecio)).orElse(null);
    }

    public double calcularPrecioTotal() {
        return items.stream().mapToDouble(Producto::getPrecio).sum();
    }

    // 2. Sobrescriura del metodo iterator()
    @Override
    public Iterator<T> iterator() {
        return new CarritoIterator();
    }

    // 3. Iterador propio como una clase interna privada
    private class CarritoIterator implements Iterator<T> {
        private int indiceActual = 0; // Puntero para identificar posición

        @Override
        public boolean hasNext() {
            // Verifica si aún hay elementos por recorrer
            return indiceActual < items.size();
        }

        @Override
        public T next() {
            // Retorna el elemento actual y avanza el puntero
            if (!hasNext()) {
                throw new NoSuchElementException("No hay más productos en el carrito.");
            }
            return items.get(indiceActual++);
        }
    }
}
