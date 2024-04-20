package clase.ejercicio;

public class Rectangulo extends Figura {
    private int base;
    private int altura;

    public Rectangulo(String tipo, int base, int altura) {
        super(tipo);
        this.setBase(base);
        this.setAltura(altura);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return this.base * this.altura;
    }
}

