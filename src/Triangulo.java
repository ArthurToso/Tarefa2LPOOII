public class Triangulo {

    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        if(base < 0 || altura < 0){
            throw new RuntimeException("Base e altura nao podem ser negativos");
        }
        this.base = base;
        this.altura = altura;
    }

    public double area(){
        return (base * altura) / 2;
    }
}
