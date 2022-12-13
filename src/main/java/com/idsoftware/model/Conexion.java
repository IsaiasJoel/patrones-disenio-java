package com.idsoftware.model;

public class Conexion {

    //Declaración
    private static Conexion instance;

    //Para evitar instancia mediante operador "new"
    private Conexion() {

    }

    //Para obtener la instancia unicamente por este metodo
    //Notese la palabra reservada "static" hace posible el acceso mediante Clase.metodo
    public static Conexion getInstance() {
        if(instance == null) {
            instance = new Conexion();
        }
        return instance;
    }

    //Método de prueba
    public void conectar() {
        System.out.println("Me conecté a la BD");
    }

    //Método de prueba
    public void desconectar() {
        System.out.println("Me desconecté de la BD");
    }
}
