package org.example;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos la biblioteca
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca Central");

        // 2. Creamos los objetos (Instanciación)
        Libro l1 = new Libro("Cien años de soledad", "García Márquez");
        Audiolibro a1 = new Audiolibro("1984", "George Orwell", 600);

        // 3. Los conectamos (Agregación)
        miBiblioteca.agregarRecurso(l1);
        miBiblioteca.agregarRecurso(a1);

        // 4. Mostramos el resultado
        miBiblioteca.mostrarCatalogo();
    }
}