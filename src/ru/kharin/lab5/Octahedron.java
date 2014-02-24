package ru.kharin.lab5;
//Класс октаэдр
public class Octahedron extends Polyhedron{
    private double perimeter,perimeterFace;//периметр всей фигуры и периметр грани
    
    public Octahedron(double a){
        super(a);
        perimeter = 12*a;
        perimeterFace = 3*a;
        this.setName("Октаэдр");
    }
    
    public double getPerimeter(){return perimeter;}
    public double getPerimeterFace(){return perimeterFace;}
    
    @Override
    public String toString(){
        return this.getTime() + ";" +"id = " + this.getId() + ", " + this.getName() + " (" +
                this.getA() + "), Периметр = " + perimeter +", Периметр грани = " 
                + perimeterFace;
    }
    @Override
    public double area() {
        return 2*Math.sqrt(3)*a*a;
    }

    @Override
    public double volume() {
        return (Math.sqrt(2)/3)*a*a*a;
    }
}
