package nsu.lab08;

public class Circle extends  GeometricObject {
    private  double radius;



    Circle(){
//        super();
        radius = 1.0;
        new GeometricObject("white", true);
    }

    Circle(double radius){
        super("black", true);
        this.radius = radius;
    }

}
