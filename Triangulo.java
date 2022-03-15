public class Triangulo implements FiguraGeometrica {
    private double LadoA;
    private double LadoB;
    private double LadoC;
    private double Base;
    private double Altura;

    

    public double getLadoA() {
        return LadoA;
    }

    public void setLadoA(double ladoA) {
        LadoA = ladoA;
    }

    public double getLadoB() {
        return LadoB;
    }

    public void setLadoB(double ladoB) {
        LadoB = ladoB;
    }

    public double getLadoC() {
        return LadoC;
    }

    public void setLadoC(double ladoC) {
        LadoC = ladoC;
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double base) {
        Base = base;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return Base*Altura;
    }

    @Override
    public String getFigura() {
        // TODO Auto-generated method stub
        return "Triangulo";
    }

    @Override
    public double getPerimetro() {
        // TODO Auto-generated method stub
        return LadoA+LadoB+LadoC;
    }
    
}
