package Ej3;

public class NumeroInstancias {
    private static int contadorInstancias=0;

    public NumeroInstancias(){
        contadorInstancias++;
    }

    public int cuantasInstancias(){
        return this.contadorInstancias;
    }
}
