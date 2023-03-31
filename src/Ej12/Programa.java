package Ej12;

public class Programa {

    public boolean iniciaConPrograma(String texto){
        texto = texto.toLowerCase();

        return texto.length()>7 && texto.substring(0,8).equals("programa");
    }
}
