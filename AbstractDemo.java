abstract class Shape{
    Shape(){
        System.out.println("Constructor called if we want to create object but we can't create object of abstract class but we can also caled constructor of abstract class because abstract class is made for inherit so if class can be inherit then their Constructor can be invoked");
    }
    abstract int calculateArea();
    abstract int calculatePerimeter();

    final void TestForFinal(){
        System.out.println("If method is final then they can be extends but can't be overide");
    }
}

class Rectangle extends Shape{
   private int length;
   private int breadth;
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int calculateArea(){
        return this.length * this.breadth;
    }

    public int calculatePerimeter(){
        return 2 * (this.length + this.breadth);
    }

}

public class AbstractDemo {
    public static void main(String[] args) {
        Rectangle rectangle  = new Rectangle(5,10);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        rectangle.TestForFinal();
    }
}
