package nsu.specialAssignment;

public class TestProgram {

    public static void main(String[] args) {
        Fish[] fish = {
                new Goldfish(true, "Yes"),
                new Comet(true, "Yes"),
                new Goldfish(true, "No"),
                new Comet(false, "No"),
                new Goldfish(false, "Yes")
        };
        for (int i = 0; i < fish.length - 1; i++) {
            if (fish[i] instanceof Fish) {
                if (fish[i].equals(fish[i + 1])) {
                    System.out.println("Equals");
                    System.out.println(((Fish) fish[i]).howToSwim());


                } else
                    System.out.println("Not equals");

            }
        }
    }


}
