package Ej11;

public class Ej11 {

    public String modificaString(String text){
        char ulti = text.charAt(text.length()-1);
        return ulti + text + ulti;
    }
}
