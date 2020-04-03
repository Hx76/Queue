public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.offer('a');
        queue.offer('b');
        queue.offer('c');
        queue.offer('d');
        queue.poll();
        queue.offer('e');
        queue.offer('e');
        queue.poll();
        queue.poll();
        queue.offer('e');
        queue.printQueue();
        queue.poll();
        queue.poll();
    }
}
