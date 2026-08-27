import java.util.Scanner;

/**
 *
 * @Jose Fernando Losada Monje
 */
public class Ejercicio2AccesoConjunto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tiene tarjeta de acceso (Si/No): ");
        String tienetarjeta = sc.next();

        if (tienetarjeta.equalsIgnoreCase("Si")) {
            System.out.println("La tarjeta sigue activa (Si/No): ");
            String tarjetaactiva = sc.next();

            if (tarjetaactiva.equalsIgnoreCase("Si")) {
                System.out.println("Tiene deudas (Si/No): ");
                String tarjetadeudas = sc.next();

                if (tarjetadeudas.equalsIgnoreCase("No")) {
                    System.out.println("Acceso Permitido");
                } else {
                    System.out.println("Acceso Restringido por deudas");
                }

            } else {
                System.out.println("Acceso Restringido por tarjeta inactiva");
            }

        } else {
            System.out.println("Acceso restringido ausencia de tarjeta");
        }
    }
}
 
    

 
