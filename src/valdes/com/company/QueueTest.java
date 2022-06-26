package valdes.com.company;


class QueueTest {

    public static void main(String[] args) throws InterruptedException {
        testQueueWithTwoStacks();
    }

    private static void testQueueWithTwoStacks() throws InterruptedException {
        Queue queue = new Queue();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            queue.enQueue(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(queue.deQueue());
        }
    }
}