import java.util.Scanner;

/**
 *
 * @Jose Fernando Losada Monje
 */
public class Ejercicio3Transporte {
    public static void main(String[] args) {
        double cal, cv;
        Scanner sc=new Scanner (System.in);
        System.out.println("Cual es su Calificacion: ");
        cal=sc.nextDouble();
        System.out.println("Cual es su cantidad de viajes: ");
        cv=sc.nextDouble();
        System.out.println("Cual es su disponibilidad (Disponible/Ocupado): ");
        String disp=sc.next();
        //condicion en la que todas son correctas
        if (cal>=48 && cv>=500 && disp.equalsIgnoreCase("Disponible")){
            System.out.println("Usted fue asignado como conductor premium");
        }
        //condicion en la que minimamente 2 son correctas usando el "ó" que se escribe como "||"
        else if (cal>=48 && cv>=500 && disp.equalsIgnoreCase("Ocupado")||cal<48 && cv>500 && disp.equalsIgnoreCase("Disponible")||cal>=48 && cv<500 && disp.equalsIgnoreCase("Disponible")){
             System.out.println("Usted fue asignado como conductor standar");
        }
        //condicion en la cual ninguna es correcta
        else{ 
            System.out.println("No fue aprovado como conductor");
        }
        
    }
    
}
