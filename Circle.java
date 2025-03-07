// Circle.java

import java.lang.*;
class Circle extends Shape{
    public Circle(double radius){
        super(radius,0,0,0);
    }


    @Override
    public double calculateArea() {
        return  3.14 * (dim_one * dim_one);
    }

    @Override
    public double calculatePerimeter() {
        return  2 * 3.14 *(dim_one);
    }
}