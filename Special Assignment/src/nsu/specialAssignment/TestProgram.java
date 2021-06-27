package nsu.specialAssignment;

public class TestProgram {
    public static void main(String[] args) {
        // array of fruit object
        Fruit[] fruits = new Fruit[10];
        Apple[] apples = new Apple[5];
        Mango[] mangos = new Mango[5];

        for (int i = 0; i < apples.length; i++) {
            apples[i] = new Apple();
            mangos[i] = new Mango();
        }

        //set the properties of apple object
        apples[0].setColor("red");
        apples[0].setSeed(true);
        apples[0].setVarieties(2);
        fruits[0] = apples[0];

        apples[1].setColor("red");
        apples[1].setSeed(false);
        apples[1].setVarieties(1);
        fruits[1] = apples[1];


        apples[2].setColor("blue");
        apples[2].setSeed(true);
        apples[2].setVarieties(3);
        fruits[2] = apples[2];


        apples[3].setColor("red");
        apples[2].setSeed(true);
        apples[3].setVarieties(4);
        fruits[3] = apples[3];


        apples[4].setColor("red");
        apples[4].setSeed(false);
        apples[4].setVarieties(1);
        fruits[4] = apples[4];
        // print toString
        System.out.println(fruits[0].toString());
        System.out.println(fruits[1].toString());
        System.out.println(fruits[2].toString());
        System.out.println(fruits[3].toString());
        System.out.println(fruits[4].toString());


        //set the properties of mango object
        mangos[0].setColor("green");
        mangos[0].setPropagation(1);
        fruits[5] = mangos[0];

        mangos[1].setColor("yellow");
        mangos[1].setPropagation(2);
        fruits[6] = mangos[1];

        mangos[2].setColor("yellow");
        mangos[2].setPropagation(1);
        fruits[7] = mangos[2];

        mangos[3].setColor("teal");
        mangos[3].setPropagation(3);
        fruits[8] = mangos[3];

        mangos[4].setColor("green");
        mangos[4].setPropagation(2);
        fruits[9] = mangos[4];

        // print toString
        System.out.println(fruits[5].toString());
        System.out.println(fruits[6].toString());
        System.out.println(fruits[7].toString());
        System.out.println(fruits[8].toString());
        System.out.println(fruits[9].toString());


    }
}
