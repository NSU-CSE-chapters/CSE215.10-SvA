package com.cse215;

public class MyRectangle2D {
    double x;
    double y;

    double height;
    double width;

    public MyRectangle2D() {
        this.x = 0;
        this.y = 0;
        this.height = 1;
        this.width = 1;
    }

    public MyRectangle2D(double x, double y, double height, double width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public  double getArea(){
        return height*width;
    }

    public  double getPerimeter(){
        return 2*(height+width);
    }

    public boolean contains(double x, double y){
        return true;
    }
    public boolean contains(MyRectangle2D r){
        return  true;
    }

    public  boolean overlaps(MyRectangle2D r){
        return  true;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
