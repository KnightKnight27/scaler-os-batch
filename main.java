import java.util.concurrent.ThreadLocalRandom;

public class main {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        helloWorldPrinter.run();
        Thread t = new Thread(helloWorldPrinter);
        t.start();
    }
}
// SOP
// 1) MAKE A CLASS AND MAKE IT IMPLEMENT RUNNABLE INTERFAC
// 2) Implement the run method ( Over ride the run method)
// 3) Create object of that class
// 4) Create new thread and pass this object to new thread
// 5) USE thread.start()