import java.util.Scanner;

public class Ejerccio_dos {
    public static void main(String[] args) {


        int opcion;
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingresa el tipo de cuenta 1 o 2 o 3");

        opcion = entrada.nextInt();


            switch (opcion) {
                case 1:
                    System.out.println("Cuenta Corriente ");
                    break;
                case 2:
                    System.out.println("Cuenta de ahorros ");
                    break;
                case 3:
                    System.out.println("Cuenta de Nómina  ");
                    break;
                default:
                    System.out.println("-------------------------------------------------");
                    System.out.println("-          OPCIÓN NO VALIDA...                  -");
                    System.out.println("-------------------------------------------------");

            }
           entrada.close();
        }
    }
