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
        sb.append(" ---- LIST ---- \n");
        list.stream().forEach(value -> sb.append(value + "\n"));
        sb.append("\n");

        SelectionSort selectionSort = new SelectionSort();
        List<Integer> sortedlist = selectionSort.algorithm(list);

        sb.append(" ---- SELECTION SORTED LIST ---- \n");
        sortedlist.stream().forEach(value -> sb.append(value + "\n"));
        sb.append("\n");

        screen.showResult(sb);

    }
}
