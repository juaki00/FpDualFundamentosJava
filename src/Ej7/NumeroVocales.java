package Ej7;

public class NumeroVocales {

    public NumeroVocales(String texto){
        int cont = 0;
        for (int i = 0; i < texto.length(); i++) {
            if(esVocal(texto.charAt(i))){
                cont++;
            }
        }
        System.out.print("El texto " + texto + " tiene " + cont + " vocales");
    }

    private boolean esVocal(char c){
        c = Character.toLowerCase(c);
        boolean esVocal= false;
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
