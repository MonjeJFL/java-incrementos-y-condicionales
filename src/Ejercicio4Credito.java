import java.util.Scanner;



/**
 *
 * @Jose Fernando Losada Monje
 */
public class Ejercicio4Credito {
    public static void main(String[] args) {
        int pc,tm;
        double ing;
        String nombre,telefono,cedula;
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Ingrese su nombre completo: ");
        nombre=sc.nextLine();
        System.out.println("Ingrese su cedula: ");
        cedula=sc.next();
        System.out.println("Ingrese su numero de telefono: ");
        telefono=sc.next();
        
        System.out.println("");
        
        System.out.println("Ingrese su cantidad de ingresos mensuales: ");
        ing=sc.nextDouble();
        
        System.out.println("Ingrese su puntaje crediticio: ");
        pc=sc.nextInt();
        
        System.out.println("Ingrese la cantidad de tiempo en meses de su actual trabajo: ");
        tm=sc.nextInt();
        
        System.out.println("");
        System.out.println("El solicitante "+nombre+" con cedula de ciudadania "+cedula+" y numero de telefono "+telefono);
        
        if (ing>5000000 && pc>750 && tm>24){
            System.out.println("fue aprovado para su credito");
         }
        else if (ing>500000 && pc>750 && tm<24 || ing>500000 && pc<=750 && tm>24 || ing<=5000000 && pc>750 && tm>24){
                 System.out.println("fue aprovado para un credito condicionado");
         } else {
            System.out.println("fue rechazado para su credito");
        }
        }
}  
        
      
        
    
    

