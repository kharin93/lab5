package ru.kharin.lab5;
//Класс многогранник
public abstract class Polyhedron implements Area,Volume{
    private String name;      
    protected double a; //Длина ребра      
    private int id;      
    private static int nextId = 1; 

    {  id = nextId++; }
    
    public void setId(int id){ this.id = id; }
    public void reduceNextId(){ nextId--; }
    
    public Polyhedron(double a){
        this.a = a;
    }
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
    
    public String print(){
        return "id = " + id + ", " + name + " (" + a + "), Площадь = " + area() +", Объем = " + volume();
    }
    public int getId(){ return id; }
    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }
    public double getA(){ return a; }
}
