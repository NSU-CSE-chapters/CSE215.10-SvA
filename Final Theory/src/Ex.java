public class Ex {

    public static void main(String[] args) {
        int ans;
        try {
            ans = 10/4;
            System.out.println("statement 1 ");
        }catch (ArithmeticException e){
            System.out.println("statement 2");
        }finally {
            System.out.println("statement 3");
        }

        System.out.println("statement 4");
    }
}
