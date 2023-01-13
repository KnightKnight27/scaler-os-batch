public class NumberPrinter implements Runnable{

    private int numberToPrint;
    NumberPrinter(int number){
        this.numberToPrint = number;
    }
    @Override
    public void run(){
        System.out.println(this.numberToPrint + " " + Thread.currentThread().getName());
    }
}
