package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int opcion = sc.nextInt();
            System.out.println("1. Añadir usuario\n2.Buscar usuario\n3.Total ingresos\n0. Salir");
            switch (opcion) {
                case 0:
                    break;
                case 1:
                    String correo = sc.next();
                    Usuario usuario = new Usuario();
                    usuario.setIdentificador(correo);
                    CRUDCliente.clientes.add(usuario);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.printf("No existe dicha opción");
                    break;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Usuario usuario = new Usuario();
    }
}