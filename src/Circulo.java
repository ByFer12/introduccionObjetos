package src;

import java.util.Scanner;

public class Circulo {

    Scanner ent= new Scanner(System.in);
    public static void main(String[] args) {
        Scanner ent= new Scanner(System.in);
     double radio;
     System.out.println("Ingrese <el radio");
     radio=ent.nextInt();
     Circulo cir1=new Circulo(radio);
     System.out.println("El area es: "+cir1.getArea());
     System.out.println("El perimetro es: "+cir1.getPerimetri());
        
    }   
    private double radio1;
    private double area;
    private double perimetro;
    public Circulo(double radio1 ){
        this.radio1=radio1;
}

    public double getArea(){
        area=Math.PI*radio1*radio1;
            return area;

}

public double getPerimetri(){
    perimetro=2*Math.PI*radio1;
        return perimetro;

}

}
