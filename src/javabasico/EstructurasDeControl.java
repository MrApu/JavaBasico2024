package javabasico;


public class EstructurasDeControl {
//constructor
    public EstructurasDeControl(int edad) {
        this.edad=edad;
    }
    
        private int edad;
        
        
        
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
        
    public void estructura(){
    
         
         if(this.edad >= 18){
             System.out.println("Es mayor de edad");
    }else if(edad >= 45){
             System.out.println("Es adulto");
    }else{
             System.out.println("Es menor de edad");
    }
        
    }
    
       public void tablaMultiplicar(int d){
        for(int i = 1;i <= 10; i++){
            System.out.println(i +" x "+d+" = "+ i*d);
        }
    }
}
