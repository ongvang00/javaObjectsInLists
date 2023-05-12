public class CounterMain {
    public static void main(String[] args) {
        Counter counter1 = new Counter(30);
        System.out.println("starting value: " + counter1.getValue());

        counter1.increase();
        System.out.println("Increase by one: " + counter1.getValue());

        counter1.decrease();
        System.out.println("Decrease by one: " + counter1.getValue());

        counter1.increaseBy(10);
        System.out.println("Increase by ten: " + counter1.getValue());

        counter1.decreaseBy(2);
        System.out.println("Decrease by two: " + counter1.getValue());


    }
}

