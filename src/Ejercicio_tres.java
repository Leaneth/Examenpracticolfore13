import java.util.Scanner;

public class Ejercicio_tres {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double uno;
        double dos;
        double tres;


        System.out.println("ingresa el primer valor ");
        uno = entrada.nextDouble();
        System.out.println("ingresa segundo valor");
        dos = entrada.nextDouble();
        System.out.println("ingresa el tercer valor");
        tres = entrada.nextDouble();

        double suma;
        double resta;
        double multi;
        double divi;

        suma = uno + dos + tres;
        resta = uno - dos - tres;
        multi = uno * dos * tres;
        divi = (uno + dos) / tres;

        System.out.println("la suma es:" + suma);
        System.out.println("la resta es:" + resta);
        System.out.println("la multiplicacion es:" + multi);
        try {
            System.out.println("la division es:" + divi);

        } catch (    ArithmeticException e) {
            System.out.println("La división por cero no existe");
        }finally {
            System.out.println("Operacion Finalizada");
        }

    }
}