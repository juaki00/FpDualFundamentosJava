package Ej4;

public class Buscanumeros {

    /**
     *
     * @param s
     */
    public void imprimeNumeros(String s){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                System.out.print(s.charAt(i));
            }
        }


    }
}
