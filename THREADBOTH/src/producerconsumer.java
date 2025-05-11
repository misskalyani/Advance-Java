//	c) Write a program to solve producer consumer problem in which a producer produces a value and consumer consume the value before producer generate the next value. (Hint: use thread synchronization)


class SharedData 
{
     int data;
    boolean available = false;

     synchronized public void produce(int data) 
     {
        while (available)
        {
            try 
            {
                wait();
            } catch (Exception e) 
            { }
        }
        this.data = data;
        available = true;
        notify();
    }

    synchronized public int consume() 
    {
        while (!available) 
        {
            try 
            {
                wait();
            }catch (Exception e) 
            { }
        }
        available = false;
        notify();
        return data;
    }
}

class Producer extends Thread
{
    private SharedData sharedData;

    public Producer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedData.produce(i);
            System.out.println("Produced: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedData sharedData;

    public Consumer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            int data = sharedData.consume();
            System.out.println("Consumed: " + data);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
class Main {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        Producer producer = new Producer(sharedData);
        Consumer consumer = new Consumer(sharedData);

        producer.start();
        consumer.start();
    }
}
