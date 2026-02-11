package org.example;

public class Audiolibro extends Libro {
    private int duracionMinutos;

    public Audiolibro(String titulo, String autor, int duracionMinutos) {
        super(titulo, autor);
        this.duracionMinutos = duracionMinutos;
    }

    // --- GETTER Y SETTER PROPIO ---
    public int getDuracionMinutos() { return duracionMinutos; }
    public void setDuracionMinutos(int duracionMinutos) { this.duracionMinutos = duracionMinutos; }

    // --- TO STRING (Sobrescrito) ---
    @Override
    public String toString() {
        // Llamamos al toString de Libro y le pegamos el dato extra
        return super.toString() + ", Duración: " + duracionMinutos + " min";
    }
}