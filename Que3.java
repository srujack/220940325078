public class Que3 {
    public static void main(String[] args) {
        Shape s;
        s=new Circle();
        s.draw();
        s.erase();
        System.out.println("***************************************");
        s=new Triangle();
        s.draw();
        s.erase();
        System.out.println("***************************************");
        s=new Square();
        s.draw();
        s.erase();

    }
}

class Shape{
    void draw(){
        System.out.println("this is draw of class shape");
    }
    void erase(){
        System.out.println("this is erase of class shape");
    }
}

class Circle extends  Shape{
    void draw(){
        System.out.println("this is draw of class circle");
    }
    void erase(){
        System.out.println("this is erase of class circle");
    }
}
class Triangle extends  Shape{
    void draw(){
        System.out.println("this is draw of class triangle");
    }
    void erase(){
        System.out.println("this is erase of class triangle");
    }
}
class Square extends  Shape{
    void draw(){
        System.out.println("this is draw of class square");
    }
    void erase(){
        System.out.println("this is erase of class square");
    }
}