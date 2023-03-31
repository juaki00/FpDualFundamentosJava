package Ej8;

public class Veintiuno {

    public int diferencia(int numero){
        if(numero > 21){
            numero = numero - 21;
        }
        else{
            numero = (21 - numero) * 2;
        }
        return numero;
    }
}
