import java.util.Scanner;
/**
 *
 * @Jose Fernando Losada Monje
 */
public class Ejercicio5Aerolinea {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
       int vuelos;
       
        System.out.println("Posee membresia (Si/No): ");
        String membresia=sc.next();
        System.out.println("Cual es su cantidad de vuelos realizados: ");
        vuelos=sc.nextInt();
        
        if (vuelos>=50 && vuelos<=70 && membresia.equalsIgnoreCase("Si")){
            System.out.println("Su categoria es Oro");
            
        }if (vuelos>70 && membresia.equalsIgnoreCase("Si")){
                System.out.println("Su categoria es Oro con acceso VIP");
            }
        else if (vuelos<50 && vuelos>=20 && membresia.equalsIgnoreCase("Si")){
            System.out.println("Su categoria es Plata");
        }
        else if (vuelos<20 || membresia.equalsIgnoreCase("No")){
            System.out.println("Su categoria es Basica");
        } 
    }   
}      
        
        
        
    

