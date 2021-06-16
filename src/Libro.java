package src;

public class Libro {
    public static void main(String[] args) {
        Libro l1= new Libro("La divina comedia",121,true);
        l1.préstamo();
        l1.devolución();
        
    }
    private String nombre;
    private int id;
    private boolean estado;

    public Libro(String nombre, int id,boolean estado){
        this.nombre=nombre;
        this.id=id;
        this.estado=estado;
    }


    public void préstamo(){
        estado=false;
        if(estado){
            System.out.println("No se prestó un libro");
        }else{
        System.out.println("Prestaste");
    }

    }
    public void devolución(){
        estado=true;
        if(estado){
            System.out.println("Se ha devuelto el libro:");
            
        }else{
            System.out.println("No se ha devuelto el libro ");
        }


    } 
    public void mostrarInformacion(){

        
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
