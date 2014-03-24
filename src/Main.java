import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MysteryColorAnalyzer mysteryColorAnalyzer = new MysteryColorAnalyzerImpl();
        List<Color> mysteryColors = new ArrayList<Color>(Arrays.asList(Color.WHITE, Color.BLACK, Color.RED, Color.YELLOW, Color.WHITE));

        System.out.println("The colors are:");
        for (Color color : mysteryColors) {
            System.out.print(color + " ");
        }
        System.out.println("\n");
        System.out.println("Distinct colors:" + mysteryColorAnalyzer.numberOfDistinctColors(mysteryColors));
        for (Color color : Color.values()) {
            int colorCount = mysteryColorAnalyzer.colorOccurrence(mysteryColors, color);
            if (colorCount > 0) {
                System.out.println(color + ": " + colorCount);
            }
        }
    }
}
