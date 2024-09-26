
package javabasico;

import java.util.Scanner;


public class JavaBasico {

    public void principal(){
        System.out.println("Bienvenido Java Básico");
        System.out.println("1. Operadores Logicos");
        System.out.println("2. Tipo de datos");
        System.out.println("3. Estructuras de control");
        System.out.println("4. Excepciones");
        System.out.println("5. Estructuras de datos");
        
        System.out.println("Elige Una opcion: ");
        Scanner sc = new Scanner (System.in);
        int data = sc.nextInt();
        
        switch (data) {
            case 1 -> {
                OperadoresLogicos ol = new OperadoresLogicos();
                ol.operador();
            }
            case 2 -> {
                TipoDeDato td = new TipoDeDato();
                td.dato();
            }
            case 3 -> {
                EstructurasDeControl ec = new EstructurasDeControl(80);
                //ec.setEdad(18);
                ec.tablaMultiplicar(7);
                
            }
            case 4 -> {
                Excepciones ex = new Excepciones();
                ex.manejoError();
                break;
                
            }
            
            case 5 -> {
                EstructuraDeDatos ed = new EstructuraDeDatos();
                //ed.array();
                //ed.list();
                ed.map();
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        //Practica prac = new Practica();
        //prac.menu();
        JavaBasico jb = new JavaBasico();
        jb.principal();
        
    }
    
}
