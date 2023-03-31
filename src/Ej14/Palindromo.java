package Ej14;

public class Palindromo {

    public boolean esPalindromo(String text){

        text = text.toLowerCase();
        text = text.replaceAll(" ", "");

        StringBuilder textAux = new StringBuilder(text);
        textAux.reverse();

        return text.equals(textAux.toString());
    }
}
