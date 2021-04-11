package nsu.practise;

public class Main {

    public static void main(String[] args) {

    }
    public  static  double average(int[] numArray){
        double avg;
        double sum = 0;

        for (int i = 0; i < numArray.length; i++) {
            sum+=numArray[i];
        }

        avg = sum/numArray.length;
        return avg;
    }


}
