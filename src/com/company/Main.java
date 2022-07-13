package com.company;

import static java.lang.Math.sqrt;

//1. Реализовать интерфейс «Фигура». Интерфейс содержит сигнатуры трех методов.
// Первый метод возвращает периметр фигуры типом int.
// Второй метод возвращает площадь фигуры типом int. Третий метод возвращает имя фигуры типом String.
//2. Создать три (квадрат, прямоугольник, правильный шестиугольник) класса, которые реализуют интерфейс фигура.
//3. В классах должен быть конструктор, который на вход принимает все необходимые параметры (стороны, имя и т.д.)
//4. Создать Main класс, в котором в методе public static void main(String[] args) {}
// создать все три класса и вывести на печать результаты выполнения методов.
interface Figure {
    int perimeter();
    int area();
    String name();
}

class Square implements Figure {
    int length;
    String name;

    Square(int l, String n) {
        this.length = l;
        this.name = n;
    }
    //@Override
    public int perimeter() {
        return(length * 4);
    }
    public int area() {
        return(length * length);
    }
    public String name() {
        return(name);
    }
}
class Rectangle implements Figure {
    int length;
    int width;
    String name;

    Rectangle(int l, int w, String n) {
        this.length = l;
        this.width = w;
        this.name = n;
    }
    //@Override
    public int perimeter() {
        return((length + width) * 2);
    }
    public int area() {
        return(length * width);
    }
    public String name() {
        return(name);
    }
}

class Hexagon implements Figure {
    int length;
    String name;

    Hexagon(int l, String n) {
        this.length = l;
        this.name = n;
    }
    //@Override
    public int perimeter() {
        return(length * 6);
    }
    public int area() {
        return(int)(3*sqrt(3)*length*length); //приведение к int, т.к. таковы требования
    }
    public String name() {
        return(name);
    }
}

public class Main {
    public static void main(String[] args) {

        Square square = new Square(2,"Антон");
        Rectangle rectangle = new Rectangle(2,3,"Борис");
        Hexagon hexagon = new Hexagon(2,"Анатолий");

        System.out.println("Периметр квадрата: " + square.perimeter());
        System.out.println("Площадь квадрата: " + square.area());
        System.out.println("Имя квадрата: " + square.name());

        System.out.println("\nПериметр прямоугольника: " + rectangle.perimeter());
        System.out.println("Площадь прямоугольника: " + rectangle.area());
        System.out.println("Имя прямоугольника: " + rectangle.name());

        System.out.println("\nПериметр шестиугольника: " + hexagon.perimeter());
        System.out.println("Площадь шестиугольника: " + hexagon.area());
        System.out.println("Имя шестиугольника: " + hexagon.name());
    }
}