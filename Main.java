package clase.ejercicio;

public class Main {
    public static void main(String[] args) {
        Cuadrado cu = new Cuadrado("Cuadrado", 5);
        Circulo ci = new Circulo("Circulo", 3.5);
        Rectangulo rec = new Rectangulo("Rectangulo", 4, 6);
        Triangulo tri = new Triangulo("Triangulo", 7, 3);

        System.out.println("Los Lados del " + cu.getTipo() + " son: " + cu.getLado());
        System.out.println("El Radio del " + ci.getTipo() + " es: " + ci.getRadio());
        System.out.println("El " + rec.getTipo() + " Tiene una base de " + rec.getBase()+ " Y su altura es "+ rec.getAltura());
        System.out.println("El "+ tri.getTipo()+ " Tiene una base de "+ tri.getBase()+ " Y su altura es "+ tri.getAltura()); 
    }
    
}

