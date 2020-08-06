import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    List<Integer> algorithm(List<Integer> list){

        List<Integer> sortedList = new ArrayList<>();
        int lenghtList = list.size();
        for (int i = 0; i < lenghtList; i++){
            int smaller = list.get(0);
            int index_smaller = 0;
            for (int j = 0; j < list.size(); j++){
                if (list.get(j) < smaller){
                    smaller = list.get(j);
                    index_smaller = j;
                }
            }
            sortedList.add(smaller);
            list.remove(index_smaller);
        }
        return sortedList;
    }

}
