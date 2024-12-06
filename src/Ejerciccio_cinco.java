import java.util.Scanner;

public class Ejerciccio_cinco {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int compra;
        int descuentouno;
        int descuentodos;


        System.out.println("Señor usuario por favor digite el valor de su compra ");
        compra = entrada.nextInt();


        if (compra >= 1000) {
            descuentouno = compra - ((compra * 20) / 100);
            System.out.println("la compra tiene un descuento del 20 % su total es :" + descuentouno);
        } else if (compra >= 500 && compra < 1000) {
            descuentodos = compra - ((compra * 10) / 100);
            System.out.println("la compra tiene un descuento del 10 % su total es :" + descuentodos);

        } else if(compra < 500){
            System.out.println("la compra no aplica descuento su total es :" + compra);
        }
    }
}
