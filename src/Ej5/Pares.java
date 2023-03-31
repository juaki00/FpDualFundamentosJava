package Ej5;

public class Pares {

    public Pares(String... parametros){
        for(String par: parametros){
            if(par.length()%2==0){
                System.out.println(par + " tiene un numero par de caracteres.");
            }
            else{
                System.out.println(par + " tiene un numero impar de caracteres");
            }
        }
    }
}
