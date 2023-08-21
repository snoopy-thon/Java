package practice;
// 연습문제 7-23번
import java.awt.*;

import static java.lang.Math.PI;

abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }

    abstract double calcArea();

    Point getPosition(){
        return p;
    }

    void setPosition(Point p){
        this.p = p;
    }
}

class Point{
    int x;
    int y;

    Point(){
        this(0,0);
    }

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "["+x+","+y+"]";
    }
}

class Circle2 extends Shape{
    double r;
    Circle2(double r){
        this.r = r;
    }
    double calcArea() {
        return r*r*PI;
    }
}

class Rectangle extends Shape{
    double width;
    double height;
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    double calcArea() {
        return width * height;
    }
    boolean isSquare() {
        return (width == height ? true : false);
    }
}
public class Ex7_23 {

    static double sumArea(Shape[] arr){
        return arr[0].calcArea() + arr[1].calcArea() + arr[2].calcArea();
    }

    public static void main(String[] args) {
        Shape[] arr = {new Circle2(5.0), new Rectangle(3,4), new Circle2(1)};
        System.out.println("면적의 합 : " + sumArea(arr));
    }
}
