package src;
import java.util.Scanner;

public class Cuadrado {
    
   
    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        int lado1;
        System.out.println("Ingrese un lado y calcularemos el area y perimetro de un cuadrado;");
        lado1=ent.nextInt();
        Cuadrado c1=new Cuadrado(lado1);
        System.out.println("El area del cuadrado es: "+c1.getArea());
        System.out.println("El perimetro del cuadrado es: "+c1.getPerimetro());
        
    }
    private int lado1;
    private int area;
    private int perimetro;
    public Cuadrado(int lado1){
        this.lado1=lado1;
        

}

   public int getArea(){
    area=this.lado1*this.lado1;
    return area;
   }

   public int getPerimetro(){
    perimetro=4*this.lado1;
       return perimetro;
   }

}