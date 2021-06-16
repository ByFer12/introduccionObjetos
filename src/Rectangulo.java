package src;
import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner ent =new Scanner(System.in);
        double lado1,lado2;
        System.out.println("Ingrese un lado:");
        lado1=ent.nextDouble();
        System.out.println("Ingrese otro lado:");
        lado2=ent.nextDouble();
        Rectangulo rec=new Rectangulo(lado1, lado2);
        System.out.println("El area es de: "+rec.getArea());
        System.out.println("El perimetro es de: "+rec.getPerimetro());
        
        
    }
    private double lado1;
    private double lado2;
    private double area;
    private double perimetro;
        
    public Rectangulo(double lado1, double lado2){
        this.lado1=lado1;
        this.lado2=lado2;
        if(lado1==lado2){
            System.out.println("Los lados son iguales");
        }

    }



    public double getArea(){
        area=lado1*lado2;
        return area;
    }

    public double getPerimetro(){
        perimetro=2*(lado1+lado2);
        return perimetro;
    }
    
}

