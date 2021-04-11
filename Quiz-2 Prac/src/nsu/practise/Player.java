package nsu.practise;

public class Player {
    private String name;
    int jerseyNo;
    private int age;
    boolean wicketKeeper;
    private int totalRun;
    private int totalWicket;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Player(String name, int jerseyNo, int age, boolean wicketKeeper, int totalRun, int totalWicket) {
        this.name = name;
        this.jerseyNo = jerseyNo;
        this.age = age;
        this.wicketKeeper = wicketKeeper;
        this.totalRun = totalRun;
        this.totalWicket = totalWicket;
    }

    public void setTotalRun(int totalRun) {
        this.totalRun = totalRun;
    }

    public void setTotalWicket(int totalWicket) {
        this.totalWicket = totalWicket;
    }

    public String getName() {
        return name;
    }

    public int getJerseyNo() {
        return jerseyNo;
    }

    public int getAge() {
        return age;
    }

    public boolean isWicketKeeper() {
        return wicketKeeper;
    }

    public int getTotalRun() {
        return totalRun;
    }

    public int getTotalWicket() {
        return totalWicket;
    }
}
