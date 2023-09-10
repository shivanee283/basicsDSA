package queues;

public class Main {
    public static void main(String[] args) {
        QueueFunc myQueueFunc = new QueueFunc(1);

        //enqueue element
        myQueueFunc.enqueue(2);
        myQueueFunc.enqueue(3);
        myQueueFunc.enqueue(4);
        myQueueFunc.enqueue(5);
        myQueueFunc.enqueue(6);

        //printing queue
        myQueueFunc.printQueue();

        //dequeue element
        myQueueFunc.dequeue();

        //printing queue
        myQueueFunc.printQueue();
    }
}
