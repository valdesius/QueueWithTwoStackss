package valdes.com.company;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Queue queue = new Queue<>();
        queue.enQueue(33);
        queue.enQueue(6);
        queue.enQueue(9);


        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());

    }
}