package nsu.quiz2;

public class Cellphone {
    private  double call_duration;
    public  static  int numberOfCalls;

    public Cellphone() {
    }

    public  Cellphone(double call_duration){
        this.call_duration = call_duration;
    }

    public double getCall_duration() {
        return call_duration;
    }

    public void setCall_duration(double call_duration) {
        this.call_duration = call_duration;
    }

    public static int getNumberOfCalls() {
        return numberOfCalls;
    }

   public  void makeCall(){
        numberOfCalls++;
   }
   public  void endCall(){
       System.out.println("the call is end");
   }
}
