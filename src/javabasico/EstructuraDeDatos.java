
package javabasico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstructuraDeDatos {
    
    public void array(){
        String apellido = "Bernedo";
        Object[] datos = {"Diego", "Marta", "SENATI","Daniel",23,false,23.12,"ricardo","nelson"};
                
    //OBtener la cantidad de datos
      int cantidad = datos.length;
        System.out.println("Cantidad de datos en mi array: "+ cantidad);
        
        
        for(int i = 0;i <= cantidad-1; i++){
            System.out.println(datos[i]);
            
           if(datos[i] == (Object)false){
               System.out.println("Se encontro la palabra: "+ datos[i]);
           }
       }
        
    }
        public void list(){
            List<String> nombre = new ArrayList<>();
            nombre.add("Marco");
            nombre.add("Pedro");
            nombre.add("Pablo");
                        
            List<String> nombresNuevos = new ArrayList<>();
            nombresNuevos.add("Marco");
            nombresNuevos.add("Pedro");
            nombresNuevos.add("Pablo");
            
            //addall
            nombre.addAll(nombresNuevos);
            //Cantidad de datos
            int cantidad = nombre.size();
            System.out.println("Cantidad de datos: "+ cantidad);
            
            //obtener un dato
            
            System.out.println("El dato: "+ nombre.get(0));
            
            //for
            
            for (int i = 0; i < cantidad; i++) {
            System.out.println(nombre.get(i));
        }
            
        //remover
        nombre.remove("Diego");
        
        //Encontrar un dato
        nombre.contains("Pablo"); //boolean
        
        //El indice de un dato
        nombre.indexOf("Pablo"); //int
        
        //Ordenar una lista.
        Collections.sort(nombre);
            
        //Revertir una lista
        Collections.reverse(nombre);
        
        //reemplazar un dato.
        nombre.set(1,"Jose Luis");
        
            System.out.println("--------------------------------------");
        for(String item: nombre){
            System.out.println("Eldato es: "+ item);
            
        }
        //limpiar una lista.
        nombre.clear();
        }
        
        public void map(){
            Map<String, Integer> edades = new HashMap<>();
            edades.put("Marta ", 45);
            edades.put("Diego ", 30);
            edades.put("Elias ", 24);
            edades.put("Ada ", 12);
            
            //Remover Data
            edades.remove("Elias");
            
            //Cantidad de datos
            edades.size();
            
            for(String item: edades.keySet()){
              //  System.out.println("Clave: "+ item + "Valor: "+ edades.get(item));

                int edad = edades.get(item);
                
            if (edad >= 18) {
            System.out.println("Clave: " + item + ", Valor: " + edad + ", es mayor de edad");
        } else {
            System.out.println("Clave: " + item + ", Valor: " + edad + ", es menor de edad");
        }
                
            }
        }
}
