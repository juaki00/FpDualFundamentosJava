package Ej6;

public class Triangulo {
    //float lado[] = new float[3];

    public Triangulo(float lado1, float lado2, float lado3){
        if(lado1 == lado2 && lado2 == lado3){
            System.out.println("El triangulo es equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("El triangulo es isosceles");
        }
        else{
            System.out.println("El triangulo es escaleno");
        }
    }
}
