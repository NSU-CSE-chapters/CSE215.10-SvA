package nsu.lab10;

public class Main {

    public static void main(String[] args) {
            Fruit fruit = new Fruit() {
                @Override
                public void foo() {
                    System.out.println("hey foo");
                }

                @Override
                public void eat() {
                    System.out.println("hey eat");
                }
            };
            fruit.eat();
            fruit.foo();

    }
}

 interface Fruit{

    int n=0;
    public void foo();
    public void eat();
}

interface Harvest{
    public void anna();
    public void banna();
}

class Apple implements  Fruit,Harvest{
    @Override
    public void foo() {
        System.out.println("foo called");
    }

    @Override
    public void eat() {
        System.out.println("eat method called");
    }

    @Override
    public void anna() {
        System.out.println("a called");
    }

    @Override
    public void banna() {
        System.out.println("b called");
    }
}