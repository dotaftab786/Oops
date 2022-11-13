class Parent{
    Parent(){
        System.out.println("Parent");
    }

    Parent(int x){
        System.out.println("parent para "+ x);
    }
}

class Child extends Parent{
    Child(){
        System.out.println("child");
    }
    Child(int x){
        super(x);
        System.out.println("Child para");
    }

}

public class InheritenceDemo {
    public static void main(String[] args) {
        Child child = new Child(5);
        
    }
} 
