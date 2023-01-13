import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String args[]){
        // IMPLEMENT MERGE SORT USING MULTITHREADING
        List<Integer> arr = List.of(10,6,1,2,8,11);
        MergeSorter mergeSorter = new MergeSorter(arr);
        List<Integer> result = mergeSorter.sort();
        for(Integer it:result){
            System.out.print(it+" ");
        }
    }
}

// Assignment is Read About futures in java
// Also Create a Adder / Subtractor using multithreading
// Also please replicate number printer / and executor service example .

//2 5
// t1
//t1.record