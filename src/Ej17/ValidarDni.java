package Ej17;

public class ValidarDni {

    public ValidarDni(String dni){
        if(dni.length() != 9 )
            System.out.println("Formato del DNI incorrecto");
        else{
            try{
                int dninumero = Integer.parseInt(dni.substring(0,8));
                char dniletra = dni.charAt(8);

                if(ValidarDni.validar(dninumero,dniletra))
                    System.out.println("La letra del DNI es correcta");
                else
                    System.out.println("La letra del DNI es incorrecta");
            }
            catch (NumberFormatException nfe){
                System.out.println("Formato del DNI incorrecto");
            }
        }
    }

    private static boolean validar(int n, char l){

        char letraValida = ' ';
        l = Character.toUpperCase(l);

        switch (n%23){
            case 0: letraValida = 'T'; break;
            case 1: letraValida = 'R'; break;
            case 2: letraValida = 'W'; break;
            case 3: letraValida = 'A'; break;
            case 4: letraValida = 'G'; break;
            case 5: letraValida = 'M'; break;
            case 6: letraValida = 'Y'; break;
            case 7: letraValida = 'F'; break;
            case 8: letraValida = 'P'; break;
            case 9: letraValida = 'D'; break;
            case 10:  letraValida = 'X'; break;
            case 11:  letraValida = 'B'; break;
            case 12:  letraValida = 'N'; break;
            case 13:  letraValida = 'J'; break;
            case 14:  letraValida = 'Z'; break;
            case 15:  letraValida = 'S'; break;
            case 16:  letraValida = 'Q'; break;
            case 17:  letraValida = 'V'; break;
            case 18:  letraValida = 'H'; break;
            case 19:  letraValida = 'L'; break;
            case 20:  letraValida = 'C'; break;
            case 21:  letraValida = 'K'; break;
            case 22:  letraValida = 'E'; break;
        }
        return l == letraValida;
    }
}
