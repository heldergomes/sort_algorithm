import javax.swing.*;

public class Screen {

    public Integer showHowManyValues(){
        return Integer.valueOf(JOptionPane.showInputDialog("How many values do you want ? "));
    }

    public void showResult(StringBuilder result) {
        Object[] options = {"OK"};
        JOptionPane.showOptionDialog(null, result, "Result ",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);
    }

    public String showOptionAlgorithm(){
        Object[] itens = { "Selection Sort", "Quick Sort"};
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Algorithm Options", "Choice one option: ",
                JOptionPane.INFORMATION_MESSAGE, null,
                itens, itens [0]);
        return String.valueOf(selectedValue);
    }

}
