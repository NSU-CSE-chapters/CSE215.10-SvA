public class Task_5 {
    public static void main(String[] args) {
        int[] count = new int[10];
        for (int i = 1; i <= 100; i++) {
            int rand =(int) (Math.random()*10);
            count[rand]++;

        }

        for (int i = 0; i < count.length; i++) {
            if (count[i]!=0){
                System.out.print(i+" occurs "+count[i]+" ");
                if (count[i]>1){
                    System.out.println("times");
                }else System.out.println("time");
            }
        }
    }
}
