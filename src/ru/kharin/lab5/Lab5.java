package ru.kharin.lab5;

import java.io.*;
import java.util.*;

public class Lab5 {
    private static List<Polyhedron> list;
    private static void init(){
        // создание и заполнение списка
        list=new ArrayList<Polyhedron>();
        list.add(new Tetrahedron(6));
        list.add(new Hexahedron(2));
        list.add(new Octahedron(7));
        list.add(new Hexahedron(1));
        list.add(new Hexahedron(6));
        list.add(new Tetrahedron(5));
        list.add(new Tetrahedron(9));
        list.add(new Octahedron(5));
        list.add(new Icosahedron(5));
        list.add(new Icosahedron(4));
    }
    private static void sortmenu(){
            System.out.println();
            System.out.println("Выберите тип сортировки (выйти - другое число):");
            System.out.println("--------------------------------------------------");
            System.out.println("1 - по возраcтанию id");
            System.out.println("2 - по убыванию id");
            System.out.println("3 - по возраcтанию имени");
            System.out.println("4 - по убыванию имени");
            System.out.println("5 - по возрастанию длины ребра");
            System.out.println("6 - по убыванию длины ребра");
            System.out.println("--------------------------------------------------");
    }
    private static void mainmenu(){
            System.out.println();
            System.out.println("Выберите действие (выйти - другое число):");
            System.out.println("--------------------------------------------------");
            System.out.println("1 - показать список");
            System.out.println("2 - отсортировать список");
            System.out.println("3 - добавить элемент");
            System.out.println("4 - удалить эемент");
            System.out.println("5 - показать работу интерфейсов(площадь и объем)");
            System.out.println("--------------------------------------------------");
    }
    public static void main(String[] args) throws IOException {
        init();
        
        //  подготовка к вводу
        boolean repeat = true;
        Scanner sc = new Scanner(System.in);//Создаем объекс класса Scaner для работы с различными данными
        for(;repeat;){ // начинаем бесконечный цикл
            mainmenu();
            int mode = sc.nextInt();  // читаем номер команды
            switch(mode){
                case 1: {//Печать списка 
                    Collections.sort(list,new SortMode(false, 0));
                    for (Polyhedron p: list)  System.out.println(p); 
                } break;
                case 2:{//Сортировка списка
                    sortmenu();
                    int sortMode = sc.nextInt(); // читаем строку из буфера ввода
                    if(sortMode > 0 && sortMode < 7){
                        boolean sortUp = (sortMode % 2 == 0);
                        sortMode /= 2; 
                        Collections.sort(list,new SortMode(sortUp, sortMode));
                        for (Polyhedron p: list)  System.out.println(p);
                        System.out.print("Сортировка завершена");
                    }
                    else System.out.print("Сортировка не выполнена");
                }break;
                case 3:{ //Добавление элемента
                    System.out.print("Введите длину ребра: ");
                    int a = sc.nextInt();
                    System.out.print("Тип фигуры(1 - икосаэдр, 2 - куб, "
                            + "3 - октаэдр, другая - тетраэдр)?: ");
                    int c, b = sc.nextInt();
                    do{
                        System.out.print("На какую позицию добавлять(от 1 до " + (list.size()+1) + ")?: ");
                        c = sc.nextInt()-1;}
                    while(c < 0 || c > list.size());
                    Polyhedron pp;
                    switch(b){//создаем нужный элемент
                        case 1: pp =  new Icosahedron(a); break;
                        case 2: pp =  new Hexahedron(a); break;
                        case 3: pp =  new Octahedron(a); break;
                        default: pp =  new Tetrahedron(a); break;
                    }
                    //Корректируем ИД всех элементов выше добавляемого
                    for (Polyhedron p: list) if(p.getId() > c) p.setId(p.getId()+1);
                    pp.setId(c+1);  //Устанавливаем ИД добавляемого эл-та
                    list.add(c,pp); //добаыляем элемент в список                   
                }break;
                case 4:{//Удаление элемента
                    int c;
                    do{
                        System.out.print("Какую позицию удалить(от 1 до " + list.size() + ")?: ");
                        c = sc.nextInt()-1;}
                    while(c < 0 || c >= list.size());
                    list.get(c).reduceNextId();
                    int a = list.get(c).getId();
                    //Корректируем ИД всех элементов выше удаляемого
                    for (Polyhedron p: list) if(p.getId() > a) p.setId(p.getId()-1);
                    list.remove(c);//удаляем элемент из списка
                }break;
                case 5:{//Отобразить работу интерфейсов
                    for (Polyhedron p: list)  System.out.println(p.print()); 
                }break; 
                default: repeat = false;
            }  
        }
    }
}
