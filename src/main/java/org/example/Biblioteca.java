package org.example;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    // AGREGACIÓN: La biblioteca "tiene" una lista de libros
    private ArrayList<Libro> listaLibros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.listaLibros = new ArrayList<>();
    }

    public void agregarRecurso(Libro recurso) {
        listaLibros.add(recurso);
    }

    public void mostrarCatalogo() {
        System.out.println("--- Catálogo de: " + nombre + " ---");
        for (Libro l : listaLibros) {
            System.out.println(l); // Polimorfismo en acción
        }
    }
}
