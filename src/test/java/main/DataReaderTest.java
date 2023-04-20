package main;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DataReaderTest {
    static final String TEST_FILE = "file.txt";

    @Test(groups = "base_flow", priority = 1)
    public void testRead() {
        DataReader reader = new DataReader();
        String actual = reader.read(TEST_FILE);
        String expected = "0 10.1 20 a7b 36.6 45 -25 -300 7 5n.9 -888.1 -1 777";
        assertEquals(actual, expected);
    }
}

