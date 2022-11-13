class Rectangle {
    int length;
    int breadth;
    int x = 5;
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int area(){
        return this.length * this.breadth;
    }
}

class Cuboid extends Rectangle{
    int height;
    int x = 10;
    public Cuboid(int length, int breadth,int height){
        super(length, breadth);
        this.height = height;
        // System.out.println(x);
        System.out.println(super.x);

    }
    @Override
    public int area(){
       // return this.length * this.breadth * this.height;
       return super.area() * this.height;
    }
}
public class CuboidDemo {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(10, 20, 30);
        int ans = cuboid.area();
        System.out.println(ans);
    }
}
