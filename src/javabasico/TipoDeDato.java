
package javabasico;


public class TipoDeDato {
            
        public void dato(){
            int myInteger = 10;
            String myString = "Hola";
            double myDouble = 0;
            boolean esVerdad = true;
            Object Cualquiera = 5;
            
            System.out.println("Int es de tipo: " + ((Object)myInteger).getClass().getSimpleName());
            System.out.println("String es de tipo: " + ((Object)myString).getClass().getSimpleName());
            System.out.println("Double es de tipo: " + ((Object)myDouble).getClass().getSimpleName());
            System.out.println("Boolean es de tipo: " + ((Object)esVerdad).getClass().getSimpleName());
            System.out.println("Objet es de tipo: " + ((Object)Cualquiera).getClass().getSimpleName());
            
        }

}
