import java.util.ArrayList;
import java.util.List;

public class MergeSorter{
    private List<Integer> arr;

    MergeSorter(List<Integer> arr) {
        this.arr = arr;
    }

    List<Integer> sort() {
        if (arr.size() == 1) {
            return arr;
        }

        int mid = arr.size()/2;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i=0; i<mid; i++) {
            left.add(arr.get(i));
        }

        for(int i=mid; i<arr.size(); i++){
            right.add(arr.get(i));
        }

        MergeSorter leftSorter = new MergeSorter(left);
        MergeSorter rightSorter = new MergeSorter(right);
        List<Integer> leftSorted = leftSorter.sort();
        List<Integer> rightSorted = rightSorter.sort();

        int i=0;
        int j=0;

        List<Integer> mergedSorted = new ArrayList<>();
        while(i<leftSorted.size() && j<rightSorted.size()){
            if(leftSorted.get(i) < rightSorted.get(j)){
                mergedSorted.add(leftSorted.get(i));
                i++;
            }
            else {
                mergedSorted.add(rightSorted.get(j));
                j++;
            }
        }

        while(i<leftSorted.size()){
            mergedSorted.add(leftSorted.get(i));
            i++;
        }
        while(j<rightSorted.size()){
            mergedSorted.add(rightSorted.get(j));
            j++;
        }
        return mergedSorted;
    }
}

