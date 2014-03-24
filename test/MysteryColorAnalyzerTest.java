import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MysteryColorAnalyzerTest {

    MysteryColorAnalyzer mysteryColorAnalyzer;
    List<Color> mysteryColors;

    @Before
    public void setUp() {
        mysteryColorAnalyzer = new MysteryColorAnalyzerImpl();
        mysteryColors = new ArrayList<Color>();
    }

    @Test
    public void test_noColors_numberOfDistinctColors() {
        assertEquals(0, mysteryColorAnalyzer.numberOfDistinctColors(mysteryColors));
    }

    @Test
    public void test_noColors_colorOccurrence() {
        assertEquals(0, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.RED));
        assertEquals(0, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.GREEN));
        assertEquals(0, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.BLUE));
        assertEquals(0, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.YELLOW));
        assertEquals(0, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.ORANGE));
        assertEquals(0, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.PURPLE));
        assertEquals(0, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.WHITE));
        assertEquals(0, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.BLACK));
    }

    @Test
    public void test_primaryColors_numberOfDistinctColors() {
        setPrimaryColors(mysteryColors);

        assertEquals(3, mysteryColorAnalyzer.numberOfDistinctColors(mysteryColors));
    }

    @Test
    public void test_primaryColors_colorOccurrence() {
        setPrimaryColors(mysteryColors);

        assertEquals(1, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.RED));
        assertEquals(1, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.GREEN));
        assertEquals(1, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.BLUE));
        assertEquals(0, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.YELLOW));
        assertEquals(0, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.ORANGE));
        assertEquals(0, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.PURPLE));
        assertEquals(0, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.WHITE));
        assertEquals(0, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.BLACK));
    }

    private void setPrimaryColors(List<Color> mysteryColors) {
        mysteryColors.add(Color.RED);
        mysteryColors.add(Color.GREEN);
        mysteryColors.add(Color.BLUE);
    }

    @Test
    public void test_ColorMixture_numberOfDistinctColors() {
        setColorMixtures(mysteryColors);

        assertEquals(6, mysteryColorAnalyzer.numberOfDistinctColors(mysteryColors));
    }

    @Test
    public void test_ColorMixture_colorOccurrence() {
        setColorMixtures(mysteryColors);

        assertEquals(4, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.RED));
        assertEquals(2, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.GREEN));
        assertEquals(4, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.BLUE));
        assertEquals(0, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.YELLOW));
        assertEquals(1, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.ORANGE));
        assertEquals(2, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.PURPLE));
        assertEquals(0, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.WHITE));
        assertEquals(1, mysteryColorAnalyzer.colorOccurrence(mysteryColors, Color.BLACK));
    }

    private void setColorMixtures(List<Color> mysteryColors) {
        mysteryColors.add(Color.RED);
        mysteryColors.add(Color.RED);
        mysteryColors.add(Color.GREEN);
        mysteryColors.add(Color.PURPLE);
        mysteryColors.add(Color.BLUE);
        mysteryColors.add(Color.RED);
        mysteryColors.add(Color.BLUE);
        mysteryColors.add(Color.RED);
        mysteryColors.add(Color.BLUE);
        mysteryColors.add(Color.BLUE);
        mysteryColors.add(Color.BLACK);
        mysteryColors.add(Color.PURPLE);
        mysteryColors.add(Color.ORANGE);
        mysteryColors.add(Color.GREEN);
    }
}