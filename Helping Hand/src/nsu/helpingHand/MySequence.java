package nsu.helpingHand;

public class MySequence extends Sequence {


    @Override
    public int Term(int n) {
        return 0;
    }

    @Override
    public void tostring(int n) {
        int n1 = 0, n2 = 1, n3, i;
        System.out.print(n1 + " " + n2);


        for (i = 2; i < n; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}

