
package javabasico;

public class OperadoresLogicos {
    
    public void operador(){
       boolean esVerdadero = true;
       boolean esFalso = false;
       
       //operador AND (&&)
       boolean resultado = esVerdadero && esFalso;
        System.out.println("Resultado AND: " + resultado);
        
       // operador or (||)
       boolean resultado1 = esVerdadero || esFalso;
        System.out.println("Resultado OR: " + resultado1);
        //operador NOT !esVerdadero = F
        boolean resultado3 = !esVerdadero;
        System.out.println("Resultado NOT: " + resultado3);
    }
    
    
    
}
