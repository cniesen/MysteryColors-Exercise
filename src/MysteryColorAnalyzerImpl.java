import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MysteryColorAnalyzerImpl implements MysteryColorAnalyzer {

    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors) {
        Map<Color, Integer> colorMap = convertToMap(mysteryColors);
        return colorMap.size();
    }

    @Override
    public int colorOccurrence(List<Color> mysteryColors, Color color) {
        Map<Color, Integer> colorMap = convertToMap(mysteryColors);

        if (colorMap.containsKey(color)) {
            return colorMap.get(color);
        } else {
            return 0;
        }
    }

    private Map<Color, Integer> convertToMap(List<Color> mysteryColors) {
        Map<Color, Integer> colorMap = new HashMap<Color, Integer>();

        for (Color mysteryColor : mysteryColors) {
            if (colorMap.containsKey(mysteryColor)) {
                colorMap.put(mysteryColor, colorMap.get(mysteryColor) + 1);
            } else {
                colorMap.put(mysteryColor, 1);
            }
        }

        return colorMap;
    }
}