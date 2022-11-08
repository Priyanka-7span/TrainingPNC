package oops.polymorphism;

class Cricketer {
    String nameOfCricketer;
    int bestOdiScore;
    double runRate;
    int numberOfWickets;

    public Cricketer(String nameOfCricketer, int numberOfWickets) {
        this.nameOfCricketer = nameOfCricketer;
        this.numberOfWickets = numberOfWickets;
    }

    public Cricketer(String nameOfCricketer, int bestOdiScore, double runRate) {
        this.nameOfCricketer = nameOfCricketer;
        this.bestOdiScore = bestOdiScore;
        this.runRate = runRate;
    }

    public void skills (String nameOfCricketer, int bestOdiScore, double runRate){
        System.out.println(this.nameOfCricketer + " " + " has average run rate is :" + " " + this.runRate);
        System.out.println(this.nameOfCricketer + " " + "has best ODI Score is :" + " " + this.bestOdiScore);
    }
    public void skills (String nameOfCricketer, int numberOfWickets){
        System.out.println(this.nameOfCricketer +" "+ "has taken number of wickets :" + " " + this.numberOfWickets);
    }
}

public class Inc {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer("Sachin",300,100.25);
        Cricketer c2 = new Cricketer("MS Dhoni",250, 150.45);
        Cricketer c3 = new Cricketer("Irfan Pathan",345);

        c1.skills(c1.nameOfCricketer, c1.bestOdiScore, c1.runRate);
        c2.skills(c2.nameOfCricketer, c2.bestOdiScore, c2.runRate);
        c3.skills(c3.nameOfCricketer, c3.numberOfWickets);
    }
}
