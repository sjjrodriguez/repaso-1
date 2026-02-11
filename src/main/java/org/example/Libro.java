package org.example;

public class Libro {
    private String titulo;
    private String autor;


    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;

    }

    // --- GETTERS Y SETTERS ---
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }



    // --- TO STRING ---
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor;
    }
}