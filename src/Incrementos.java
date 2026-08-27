
import java.util.Scanner;

/**
 *
 * @Jose Fernando Losada Monje
 */
public class Incrementos {
    public static void main(String[] args) {
        // "a" toma el valor de 6 debido al "int b= ++a;" Preincremento al contrario 
        // de "c" y "d", en el cual "d" toma primero el valor de "c" por el postincremento "c++"
        int a = 5;
        int b = ++a;
        
        int c = 5;
        int d = c++;
        
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);
        System.out.println("d= "+d);
        
        System.out.println("");
        
        //Ejemplo en una Asignación 
        
        int x = 12;
        int y = ++x;
        
        int l = 14;
        int h = l++;
        
        System.out.println("En el ejemplo de asignacion x= "+x);
        System.out.println("En el ejemplo de asignacion y= "+y);
        System.out.println("En el ejemplo de asignacion l= "+l);
        System.out.println("En el ejemplo de asignacion h= "+h);
        
        System.out.println("");
        
        //Ejemplo en una operación
        
        int g = 15;
        int m = ++g + 20;
        
        int q = 13;
        int p = q++ + 20;
        
        System.out.println("En el ejemplo de operacion g= "+g);
        System.out.println("En el ejemplo de operacion m= "+m);
        System.out.println("En el ejemplo de operacion q= "+q);
        System.out.println("En el ejemplo de operacion p= "+p);
        
        System.out.println("");
        //Ejemplo de un ciclo for
        
        // Primer ciclo con preincremento
        int ciclo;
        Scanner sc =new Scanner (System.in);
        System.out.println("Hasta donde quieres que llegue el primer ciclo for con preincremento: ");
        ciclo= sc.nextInt(); 
        
        for (int i = 0; i<= ciclo;++i){
            System.out.println("Vuelta numero: "+i);
        }   
        // Segundo ciclo con postincremento    
        int ciclo2;
        System.out.println("Hasta donde quieres que llegue el segundo ciclo for con posincremento: ");
        ciclo2= sc.nextInt(); 
        
        for (int k = 0; k<= ciclo2;k++){
            System.out.println("Vuelta numero: "+k);
            
        }
        
    }
}

       
        

        
        
        
        
        
    
    

