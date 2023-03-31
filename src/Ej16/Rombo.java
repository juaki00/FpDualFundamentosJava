package Ej16;

public class Rombo {

    public Rombo(int n){

        for (int i = 0; i < n; i++) { //primera mitad del rombo

            for (int j = 0; j < n-i; j++) { //espacios en blanco
                System.out.print(" ");
            }

            for (int j = 0; j < (i*2)+1; j++) { //astericos
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = n-2; i >= 0; i--) { //segunda mitad del rombo

            for (int j = 0; j < n-i; j++) { //espacios en blanco
                System.out.print(" ");
            }

            for (int j = 0; j <= (i*2); j++) { //astericos
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
