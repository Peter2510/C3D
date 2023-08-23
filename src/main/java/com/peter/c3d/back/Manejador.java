/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.peter.c3d.back;

import com.peter.c3d.front.Front;

/**
 *
 * @author GORDILLOG
 */
public class Manejador {
    public static int contadorEtiqueta = 0;
    
    
    
    public static void validar(String arg1, String arg2, int operacion, String tmp){
        switch (operacion) {
            case 1:
                Front.out.append(tmp +" = " + arg1 + " + " + arg2 +" ;\n" );
                System.out.println(tmp +" = " + arg1 + " + " + arg2 +" ;\n");
             break;
            case 2:
                Front.out.append(tmp +" = " + arg1 + " - " + arg2 +" ;\n" );
                System.out.println(tmp +" = " + arg1 + " - " + arg2 +" ;\n");
             break;
            case 3:
                Front.out.append(tmp +" = " + arg1 + " * " + arg2 +" ;\n" );
                System.out.println(tmp +" = " + arg1 + " * " + arg2 +" ;\n");
             break;
            case 4:
                Front.out.append(tmp +" = " + arg1 + " / " + arg2 +" ;\n" );
                System.out.println(tmp +" = " + arg1 + " / " + arg2 +" ;\n");
             break;
            case 5:
                Front.out.append(tmp +" = " + arg1 +" ;\n");
                System.out.println(tmp +" = " + arg1 +" ;\n");
             break;          

        }
    }
    
    public static String generarTemp(){
        return "temp"+contadorEtiqueta++;
    }
    
    public static String asignacion(String id){
        return id +" = temp" +(contadorEtiqueta-1);
    }
    
    public static void asignar(String id){
        Front.out.append(asignacion(id)+"\n");
    }
    
    public static int getContador(){
        return contadorEtiqueta;
    }
}
