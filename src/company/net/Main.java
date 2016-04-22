package company.net;

public class Main {

    public static void main(String[] args) {
	Bird b=new Bird();

        System.out.println("My weight is: "+b.weight);
        System.out.println("My max speed is: "+b.maxSpeed);
        System.out.println("My wings length is: "+b.wings);
        System.out.println("My maximum flight height is: "+b.mfh);

        b.eat();
        b.fly();
        b.walk();
        b.eggs();
    }
}
