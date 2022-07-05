package vl01.random;

public class Main {

    public static void main(String[] args) {

        CircularArray circularArray = new CircularArray(3);
        circularArray.enqueue(1);
        circularArray.enqueue(2);
        circularArray.enqueue(3);
        circularArray.enqueue(4);
        circularArray.enqueue(5);

        System.out.println(circularArray.deqeue());
        System.out.println(circularArray.deqeue());
        System.out.println(circularArray.deqeue());

    }

}
