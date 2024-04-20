package clase.ejercicio;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado("Cuadrado", 5);
        Circulo circulo = new Circulo("Circulo", 3.5);
        Rectangulo rectangulo = new Rectangulo("Rectangulo", 4, 6);
        Triangulo triangulo = new Triangulo("Triangulo", 7, 3);

        System.out.println("Área del " + cuadrado.getTipo() + ": " + cuadrado.area());
        System.out.println("Área del " + circulo.getTipo() + ": " + circulo.area());
        System.out.println("Área del " + rectangulo.getTipo() + ": " + rectangulo.area());
        System.out.println("Area del "+ triangulo.getTipo()+ ": "+ triangulo.area()); 
    }
    
}

