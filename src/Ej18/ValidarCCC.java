package Ej18;

import java.math.BigInteger;

public class ValidarCCC {

    public ValidarCCC(BigInteger ccc){
        String numeroCadena = ccc.toString();
        int digito1 =  Integer.parseInt(numeroCadena.substring(8,9));
        int digito2 =  Integer.parseInt(numeroCadena.substring(9,10));

        if(digito1 == ValidarCCC.validarPrimerDigito(ccc) && digito2 == ValidarCCC.validarSegundoDigito(ccc)){
            System.out.println("Digitos de control correctos");
        }else{
            System.out.println("Digitos de control incorrectos");
        }

    }

    private static int validarPrimerDigito(BigInteger ccc){

        String numeroCadena = ccc.toString();

        int a = Integer.parseInt(numeroCadena.substring(0,1)) * 4 +
                Integer.parseInt(numeroCadena.substring(1,2)) * 8 +
                Integer.parseInt(numeroCadena.substring(2,3)) * 5 +
                Integer.parseInt(numeroCadena.substring(3,4)) * 10;

        int b = Integer.parseInt(numeroCadena.substring(4,5)) * 9 +
                Integer.parseInt(numeroCadena.substring(5,6)) * 7 +
                Integer.parseInt(numeroCadena.substring(6,7)) * 3 +
                Integer.parseInt(numeroCadena.substring(7,8)) * 6;

        int c = (a + b) % 11;

        int res = 11 - c;

        if(res == 11) {
            res = 0;
        }
        if(res == 10) {
            res = 1;
        }


//        if(c == 0 || c == 1){
//            res = c;
//        }

        return res;
    }

    private static int validarSegundoDigito(BigInteger ccc){

        String numeroCadena = ccc.toString();

        int d = Integer.parseInt(numeroCadena.substring(10,11)) +
                Integer.parseInt(numeroCadena.substring(11,12)) * 2 +
                Integer.parseInt(numeroCadena.substring(12,13)) * 4 +
                Integer.parseInt(numeroCadena.substring(13,14)) * 8 +
                Integer.parseInt(numeroCadena.substring(14,15)) * 5 +
                Integer.parseInt(numeroCadena.substring(15,16)) * 10 +
                Integer.parseInt(numeroCadena.substring(16,17)) * 9 +
                Integer.parseInt(numeroCadena.substring(17,18)) * 7 +
                Integer.parseInt(numeroCadena.substring(18,19)) * 3 +
                Integer.parseInt(numeroCadena.substring(19,20)) * 6;

        int e = d % 11;

        int res = 11 - e;

        if(res == 11) {
            res = 0;
        }
        if(res == 10) {
            res = 1;
        }
//        if(e == 0 || e == 1){
//            res = e;
//        }

        return res;
    }

}
