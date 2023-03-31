package Ej19;

import javax.swing.text.DefaultEditorKit;
import java.math.BigInteger;

public class ValidarIban {

    public ValidarIban(String iban){
        if(iban.length() != 24 ||
           ValidarIban.convertirLetrasPorNumeros(iban.charAt(0)) == null ||
           ValidarIban.convertirLetrasPorNumeros(iban.charAt(1)) == null)
                System.out.println("Iban incorrecto");
        else{
            //paso1
            String primeros = iban.substring(0,4);
            String ultimos = iban.substring(4,24);
            String paso1 = ultimos + primeros;

            //paso2
            String paso2 = paso1.replaceAll(Character.toString(paso1.charAt(20)),
                                            ValidarIban.convertirLetrasPorNumeros(paso1.charAt(20)));
            paso2 = paso2.replaceAll(Character.toString(paso2.charAt(22)),
                                     ValidarIban.convertirLetrasPorNumeros(paso2.charAt(22)));

            //paso3
            try {
                BigInteger paso3 = new BigInteger(paso2);
                BigInteger numMod = new BigInteger("97");
                int digitos = paso3.mod(numMod).intValue();

                digitos = 98 - digitos;
                String digitosStr;
                if(digitos < 10)
                    digitosStr = "0"+digitos;
                else
                    digitosStr = "" + digitos;

                //resultado
                iban = iban.substring(0,2) + digitosStr + iban.substring(4,24);

                System.out.println("Iban generado: " + iban);
            }
            catch (NumberFormatException nfe){
                System.out.println("Iban incorrecto");
            }


        }
    }


    public static String convertirLetrasPorNumeros(char caracter){
        caracter = Character.toUpperCase(caracter);
        String resul = "";
        switch (caracter){
            case 'A': resul = "10"; break;
            case 'B': resul = "11"; break;
            case 'C': resul = "12"; break;
            case 'D': resul = "13"; break;
            case 'E': resul = "14"; break;
            case 'F': resul = "15"; break;
            case 'G': resul = "16"; break;
            case 'H': resul = "17"; break;
            case 'I': resul = "18"; break;
            case 'J': resul = "19"; break;
            case 'K': resul = "20"; break;
            case 'L': resul = "21"; break;
            case 'M': resul = "22"; break;
            case 'N': resul = "23"; break;
            case 'O': resul = "24"; break;
            case 'P': resul = "25"; break;
            case 'Q': resul = "26"; break;
            case 'R': resul = "27"; break;
            case 'S': resul = "28"; break;
            case 'T': resul = "29"; break;
            case 'U': resul = "30"; break;
            case 'V': resul = "31"; break;
            case 'W': resul = "32"; break;
            case 'X': resul = "33"; break;
            case 'Y': resul = "34"; break;
            case 'Z': resul = "35"; break;
            default: resul = null ; break;
        }

        return resul;
    }
}
