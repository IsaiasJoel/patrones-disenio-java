package com.idsoftware;

import com.idsoftware.model.Conexion;

public class App {
    public static void main(String[] args) {
        /*(Patrón creacional) El patrón de diseño singleton permite tener una UNICA instancia de una clase para que sea utilizado
        * durante toda la aplicación. No se encarga de la creación de objetos en sí,
        * sino que se enfoca en la restricción en la creación de un objeto.
        *
        * VENTAJAS Y DESVENTAJAS
        * https://medium.com/dise%C3%B1o-de-software/singleton-el-patr%C3%B3n-del-mal-f3fdab0e16a2
        * */





        //Instanciación por constructor prohíbido por ser "private"
        Conexion c = Conexion.getInstance();
        c.conectar();
        c.desconectar();

        boolean rpta = c instanceof Conexion;
        System.out.println(rpta);
    }
}