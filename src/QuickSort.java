import java.util.List;

public class QuickSort {

    public void algorithm(List<Integer> list, int minor, int bigger) {

        if (minor < bigger) {

            int pivot = partition(list, minor, bigger);
            algorithm(list, minor, pivot-1);
            algorithm(list, pivot+1, bigger);

        }

    }

    private int partition(List<Integer> list, int minor, int bigger) {
        int pivot = list.get(bigger);
        int i = minor-1;
        for (int j = minor; j < list.size(); j++){
            if (list.get(j) < pivot && j < bigger){
                i++;
                list.add(i, list.remove(j));
            }
        }
        list.add(i+1, list.remove(bigger));
        return i+1;
    }
}
