package vl01.random;

public class CircularArray {

    private int[] array;
    private int size;

    private int front;
    private int end;

    public CircularArray(int sizess) {
        this.size = sizess;
        array = new int[size];

        front = 0;
        end = 0;
    }

    public void enqueue(int i) {
        //TODO detect overflow
        array[end % size] = i;
        end++;
    }

    public int deqeue() {
        int temp = array[front % size];
        front++;
        return temp;
    }
}
