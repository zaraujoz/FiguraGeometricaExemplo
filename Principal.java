import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        Quadrado quadrado =new Quadrado();
        System.out.println("Digite um lado");
        Scanner leia= new Scanner(System.in);
        quadrado.setLado(leia.nextDouble());
        System.out.println(quadrado.getFigura());
        System.out.println(quadrado.getLado());
        System.out.println(quadrado.getPerimetro());
        
        Triangulo triangulo =new Triangulo();
        System.out.println("Digite o lado A");      
        triangulo.setLadoA(leia.nextDouble());
        System.out.println("Digite o lado B"); 
        triangulo.setLadoB(leia.nextDouble());
        System.out.println("Digite o lado C"); 
        triangulo.setLadoC(leia.nextDouble());
        System.out.println("Digite a Base"); 
        triangulo.setBase(leia.nextDouble());
        System.out.println("Digite a Altura"); 
        triangulo.setAltura(leia.nextDouble());
        System.out.println(triangulo.getFigura());
        System.out.println("A área é: ");
        System.out.println(triangulo.getArea());
        System.out.println("A Soma dos lados é: "); 
        System.out.println(triangulo.getPerimetro());
    }

}
