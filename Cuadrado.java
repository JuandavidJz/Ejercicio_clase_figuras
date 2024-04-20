package clase.ejercicio;

public class Cuadrado {

    private int lado;
    public Cuadrado(String tipo, int lado){
        super(tipo);
        this.setLado(lado);
    }
    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return this.lado * this.lado;
    }

    
}
