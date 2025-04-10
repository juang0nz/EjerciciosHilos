public class ThreadEjemplo2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println(i + " " + Thread.currentThread().getName());
            System.out.println("Thread " + 
                Thread.currentThread().getName() + "Finished");
        
    }
    
}

class Main {
    public static void main(String[] args) {
        new Thread (new ThreadEjemplo2 (), "Pepe").start();
        new Thread (new ThreadEjemplo2 (), "Juan").start();
        System.out.println("Main thread finished.");
    }
}