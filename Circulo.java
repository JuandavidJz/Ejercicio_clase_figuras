package clase.ejercicio;

public class Circulo extends Figura {
    private double radio;

    public Circulo(String tipo, double radio) {
        super(tipo);
        this.setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * this.radio * this.radio;
    }
}

