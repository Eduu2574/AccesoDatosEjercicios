package org.example;

public class Anunciante extends Cliente{
    private int numAnuncios;

    public Anunciante(int numAnuncios) {
        this.numAnuncios = numAnuncios;
    }

    public Anunciante(String identificador, String contrasena, double descuentos, int numAnuncios) {
        super(identificador, contrasena, descuentos);
        this.numAnuncios = numAnuncios;
    }

    public int getNumAnuncios() {
        return numAnuncios;
    }

    public void setNumAnuncios(int numAnuncios) {
        this.numAnuncios = numAnuncios;
    }
}
