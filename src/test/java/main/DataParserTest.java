package main;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class DataParserTest {
    @Test(groups = "base_flow", priority = 2)
    public void testParseData() {
        DataParser parser = new DataParser();
        List<Double> actual = parser.parseData("0 10.1 20 a7b 36.6 45 -25 -300 7 5n.9 -888.1 -1 777");
        List<Double> expected = List.of(0d, 10.1d, 20d, 36.6d, 45d, -25d, -300d, 7d, -888.1, -1d, 777d);
        assertEquals(actual, expected);
    }
}
