import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Screen screen = new Screen();
        int lenghtOfList = screen.showHowManyValues();
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < lenghtOfList; i++) {
            list.add(random.nextInt(1000));
        }

        String option = screen.showOptionAlgorithm();
        sb.append(" ---- LIST ---- \n");
        sb.append(list + "\n\n");

        switch (option){
            case "Selection Sort":
                sb.append(" ---- SELECTION SORTED LIST ---- \n");
                SelectionSort selectionSort = new SelectionSort();
                List<Integer> sortedlist = selectionSort.algorithm(list);
                sb.append(sortedlist + "\n\n");
                break;
            case "Quick Sort":
                sb.append(" ---- QUICK SORTED LIST ---- \n");
                QuickSort quickSort = new QuickSort();
                quickSort.algorithm(list, 0, list.size()-1);
                sb.append(list + "\n\n");

        }

        screen.showResult(sb);

    }

}
