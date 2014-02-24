package ru.kharin.lab5;
//Класс тетраэдр
public class Tetrahedron extends Polyhedron{
    private double height,areaFace;
    
    public Tetrahedron(double a){
        super(a);
        height = (Math.sqrt(6)/3)*a;
        areaFace = (Math.sqrt(3)/4)*a*a;
        this.setName("Тетраэдр");
    }
    
    public double getHeight(){return height;}
    public double getAreaFace(){return areaFace;}
    
    @Override
    public String toString(){
        return this.getTime() + ";" + "id = " + this.getId() + ", " + this.getName() + " (" +
                this.getA() + "), Высота = " + height +", Площадь грани = " + areaFace;
    }

    @Override
    public double area() {
        return Math.sqrt(3)*a*a;
    }

    @Override
    public double volume() {
        return (Math.sqrt(2)/12)*a*a*a;
    }
    
}
