package Ej15;

public class Sumatorio {

    public Sumatorio(String... numeros){
        int suma = 0, indice = 1;

        for(String numero: numeros){
             try {
                 suma += Integer.parseInt(numero);
             }
             catch (NumberFormatException nfe){
                 System.out.println("El parámetro numero " + indice + " no es numérico");
             }
             indice++;
        }

        System.out.println("La suma de los parametros es " + suma);
    }
}
