package ru.kharin.lab5;
//Класс икосаэдр
public class Icosahedron extends Polyhedron {
    private double radInsSphere; //радиус вписанной сферы
    private double radSphere;//радиус описанной сферы
    
    public Icosahedron(double a){
        super(a);
        this.setName("Икосаэдр");
        radInsSphere = (3+Math.sqrt(5))*a/(4*Math.sqrt(3));
        radSphere = (Math.sqrt((5+Math.sqrt(5))/8))*a;
    }
    
    public double getRadInsSphere(){return radInsSphere;}
    public double getRadSphere(){return radSphere;}
    
    @Override
    public String toString(){
        return this.getTime() + ";" +"id = " + this.getId() + ", " + this.getName() + " (" +
                this.getA() + "), Радиус вписанной сферы = " + radInsSphere +
                ", Радиус описанной сферы = "  + radSphere;
    }

    @Override
    public double area() {
        return Math.sqrt(3)*5*a*a;
    }

    @Override
    public double volume() {
        return 5*(3+Math.sqrt(5)/12)*a*a*a;
    }
}
