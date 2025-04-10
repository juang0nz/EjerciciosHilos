public class Ejercicio1 {
    public static void main(String[] args) {
        new HiloCero("0").start();  // Inicia el hilo que imprime "0"
        new HiloUno("1").start();   // Inicia el hilo que imprime "1"
        System.out.println("main thread finished.");
    }

    // Creo HiloCero 
    static class HiloCero extends Thread {
        public HiloCero(String str) {
            super(str); 
        }

        public void run() {
            for (int i = 0; i < 1000; i++)
                System.out.println(i+1 + ": " + getName ());
               // System.out.println("0"); 
            System.out.println("Thread " + getName() + " finished.");
        }
    }

    
    // Creo HiloUno
    static class HiloUno extends Thread {
        public HiloUno(String str) {
            super(str);
        }

        public void run() {
            for (int i = 0; i < 1000; i++)
                System.out.println(i+1 + ": " + getName ());
                //System.out.println("1"); 
            System.out.println("Thread " + getName() + " finished.");
        }
    }
}
