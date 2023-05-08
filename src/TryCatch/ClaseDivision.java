package TryCatch;

public class ClaseDivision {

    public static void main(String[] args){
        
        try{
            
          double valor1, valor2, resultado;
        
            valor1 = 5;
            valor2 = 0;

            resultado = valor1 / valor2;

            System.out.println("division es igual a : " + resultado);
     
        } catch (Exception e){
            
            System.out.println("Error!!! " + e);
            
        } finally{
            
           System.out.println("Operacion concluida!!");
            
        }
           
    }  
    
}
