public class Task_3 {
    public static void main(String[] args) {

        int perLine = 10;
        int count = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 5 == 0 || i % 6 == 0) {
                if (i % 5 == 0 && i % 6 == 0) {
                    continue;
                }
                System.out.print(i + " ");
                count++;
                if (count % perLine == 0) {
                    System.out.println();
                }
            }
        }
    }
}
