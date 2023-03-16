package stacks_n_queues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5) ;
        queue.insert(12);
        queue.insert(13);
        queue.insert(14);
        queue.insert(15);
        queue.insert(16);

        queue.display();

        System.out.println(queue.remove());
        queue.display();

    }
}
