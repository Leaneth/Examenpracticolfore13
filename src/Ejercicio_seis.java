import java.util.Scanner;

public class Ejercicio_seis {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero ");
        int tabla;

        tabla= entrada.nextInt();

        System.out.println("Tabla de multiplicar del numero: " +tabla);
        int contador=1;
        while(contador<=20){

            System.out.println(tabla + "x" + contador + "=" + (tabla*contador));
            contador++;
        }entrada.close();
    }
}