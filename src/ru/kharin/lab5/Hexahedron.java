package ru.kharin.lab5;
//Класс куб(гексаэдр)
public class Hexahedron extends Polyhedron{
    private double diagonal,diagonalFace;
    
    public Hexahedron(double a){
        super(a);
        diagonal = Math.sqrt(3)*a;
        diagonalFace = Math.sqrt(2)*a;
        this.setName("Куб");
    }
    
    public double getdiagonal(){return diagonal;}
    public double getdiagonalFace(){return diagonalFace;}
    
    @Override
    public String toString(){
        return "id = " + this.getId() + ", " + this.getName() + " (" +
                a + "), Диагональ куба = " + diagonal +", Диагональ грани = " 
                + diagonalFace;
    }

    @Override
    public double area() {
        return 6*a*a;
    }

    @Override
    public double volume() {
        return a*a*a;
    }
}
