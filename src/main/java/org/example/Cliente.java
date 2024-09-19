package org.example;

public abstract class Cliente {
    private String identificador;
    private String contrasena;
    private double descuentos;
    public Cliente(String identificador, String contrasena, double descuentos) {
        this.identificador = identificador;
        this.contrasena = contrasena;
        this.descuentos = descuentos;
    }

    public Cliente() {
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }
}
