/*Ejercicio 2: Hola Mundo
Implemente un programa que escriba un “Hola Mundo” por cada
hilo de ejecución que se cree (seis como mínimo) y que, además
indique desde qué hilo se imprime.
Luego que cada uno espere un tiempo proporcional a su identificador
Antes de imprimir el mensaje (Thread1 un segundo, Thread2 dos segundos etc…).
Lance los Threads mediante una clase Thread y luego mediante
interfaz Runnable.
¿Se observa alguna diferencia?

 */

 public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear e iniciar seis hilos
        for (int i = 1; i <= 6; i++) {
            new Hilo(i).start();
        }
        System.out.println("main thread Running...");
    }

    // Clase Hilo que extiende Thread
    static class Hilo extends Thread {
        private int id;

        public Hilo(int id) {
            this.id = id; // Asigna el identificador del hilo
        }

        public void run() {
            try {
                Thread.sleep(id * 1000); // Espera 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Imprime el mensaje después de la espera
            for (int i = 0; i < 5; i++) {
                System.out.println("Hilo " + id + ": Hola Mundo " + (i + 1));
            }
            System.out.println("Hilo " + id + " terminado.");
        }
    }
}