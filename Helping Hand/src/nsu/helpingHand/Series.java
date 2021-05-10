package nsu.helpingHand;

public class Series extends Sequence {


    public int sum(int n) {
        int total = 0;

        for (int i = 1; i <= Term(n); i++) {
            total += i;
        }

        return total;
    }

    @Override
    public int Term(int n) {
        return n;
    }

    @Override
    public void tostring(int n) {
        System.out.println("total sum = " + sum(n));

    }
}
