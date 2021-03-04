public class Task_2 {
    public static void main(String[] args) {
        int initial = 10000;
        int totalCost = 0;

        double tenYear = 0;

        for (int i = 1; i <= 10; i++) {
            initial += (initial * 0.05);

        }

        System.out.println("the tuition in ten years $" + initial);

        for (int i = 1; i <= 4; i++) {
            initial += (initial * 0.05);
            totalCost += initial;
        }

        System.out.println("the total cost of four years’ worth of tuition after the tenth year:  $" + totalCost);
    }
}
