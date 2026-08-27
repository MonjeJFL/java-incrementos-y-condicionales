import java.util.Scanner;

/**
 *
 * @Jose Fernando Losada Monje
 */
public class Ejercicio1Descuentos {
    public static void main(String[] args) {
        double vc;
        Scanner sc= new Scanner (System.in);
        System.out.println("Escribe el valor de la compra");
        vc= sc.nextDouble();
        
        /*Primera condicion sin descuento:
        vc= valor compra
        vfsd= valor final sin descuento        
        */
        
        if (vc<100000){
            double vfsd;
            vfsd=vc;
            System.out.println("Debido a que el valor de la compra es menor de $100.000 no obtiene descuento");
            System.out.println("Total a pagar: $"+vfsd);
        }
        /* Secunda condicion con descuento del 10%
        vfcdu= valor final con descuento uno
        vfcduu= valor del descuento realizado uno      
        */
            else if (100000<=vc && vc<=300000){
            double vfcdu,vfcduu;
            vfcduu=vc*(0.10);
            vfcdu=vc-vfcduu;
            System.out.println("El valor de su compra es mayor de $100.000 y menor de $300.000, recibe un descuento de 10%");
            System.out.println("valor de la compra sin descuento: $"+vc);
            System.out.println("Valor descontado del total a pagar: $"+vfcduu);
            System.out.println("valor de la compra con el descuento: $"+vfcdu);
        }
        /* Tercera condicion con descuento del 15%
        vfcdd= valor final con descuento dos
        vfcdd= valor final del descuento realizado dos            
        */
            else if (300001<=vc && vc<=500000){
            double vfcdd, vfcddd;
            vfcddd=vc*(0.15);
            vfcdd=vc-vfcddd;
            System.out.println("El valor de su compra es mayor de $300.001 y menor de $500.000, recibe un descuento de 15%");
            System.out.println("valor de la compra sin descuento: $"+vc);
            System.out.println("Valor descontado del total a pagar: $"+vfcddd);
            System.out.println("valor de la compra con el descuento: $"+vfcdd);
        }
        /* Cuarta condicion con descuento del 20%
        vfcdt= valor fianl con descuento tres
        vfcdtt= valor final del descuento realizado tres            
        */
            else if (vc>500000){
            double vfcdt,vfcdtt;
            vfcdtt=vc*(0.20);
            vfcdt=vc-vfcdtt;
            System.out.println("El valor de su compra es mayor de $500.000, recibe un descuento de 20%");
            System.out.println("valor de la compra sin descuento: $"+vc);
            System.out.println("Valor descontado del total a pagar: $"+vfcdtt);
            System.out.println("valor de la compra con el descuento: $"+vfcdt);
        }
      }
    }