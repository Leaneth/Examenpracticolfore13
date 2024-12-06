import java.util.Scanner;

public class Ejercicio_siete {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                double nota;
                double suma = 0.0;
                int contador = 0;


                do{
                    System.out.println("Ingresar la nota: ");
                    nota= scanner.nextDouble();

                    if(nota != -1){
                        suma += nota;
                        contador++;
                        double promedio = suma / contador;
                        System.out.println("El promedio de las notas es: "+promedio);
                    }

                }while(nota != -1);

            }
        }
