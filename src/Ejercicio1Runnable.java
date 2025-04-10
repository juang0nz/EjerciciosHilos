public class Ejercicio1Runnable {
    public static void main(String[] args) {
        // Crear una instancia de la clase que implementa Runnable
        Runnable hiloCero = new HiloCero();
        Runnable hiloUno = new HiloUno();

        // Iniciar los hilos utilizando la clase Thread y pasando la instancia de Runnable
        new Thread(hiloCero).start();  // Inicia el hilo que imprime "0"
        new Thread(hiloUno).start();   // Inicia el hilo que imprime "1"

        // Mensaje del hilo principal
        System.out.println("main thread finished.");
    }

    // Clase que implementa Runnable para el hilo que imprime "0"
    static class HiloCero implements Runnable {
        public void run() {
            for (int i = 0; i < 1000; i++)
                System.out.println(i + 1 + ": 0");
            System.out.println("Thread HiloCero finished.");
        }
    }

    // Clase que implementa Runnable para el hilo que imprime "1"
    static class HiloUno implements Runnable {
        public void run() {
            for (int i = 0; i < 1000; i++)
                System.out.println(i + 1 + ": 1");
            System.out.println("Thread HiloUno finished.");
        }
    }
}
