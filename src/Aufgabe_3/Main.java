package Aufgabe_3;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);

        //Puffer testen
        System.out.println("Test des Ringbuffers:");
        var buffer = new RingBuffer<Integer>(2);
        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);

        System.out.printf("%d ", buffer.dequeue());
        System.out.printf("%d ", buffer.dequeue());
        System.out.printf("%d %n", buffer.dequeue());


        //Testen des Deque
        System.out.println("Test des Deque:");
        LinkedDeque<Integer> deque = new LinkedDeque<>();
        System.out.println("== PushLeft(1), PushLeft(2), PushRight(3), PushRight(4) ==");
        deque.pushLeft(1);   // [1]
        deque.pushLeft(2);   // [2, 1]
        deque.pushRight(3);  // [2, 1, 3]
        deque.pushRight(4);  // [2, 1, 3, 4]
        System.out.println("size: " + deque.size());

    }
}
