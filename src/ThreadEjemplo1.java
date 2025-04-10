
public class ThreadEjemplo1 extends Thread  {
    public ThreadEjemplo1 (String str){
        super(str);
    }


public void run (){
    for (int i = 0; i<10; i++)
        System.out.println(i + " " + getName ());
    System.out.println("Thread" +
              getName() + "finished." );
}
public static void main(String[] args) {
    new ThreadEjemplo1("Pepe").start();
    new ThreadEjemplo1("Juan").start();
    System.out.println("main thread finished.");
}

}