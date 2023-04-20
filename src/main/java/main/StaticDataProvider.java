package main;

import org.testng.annotations.DataProvider;

import java.util.Iterator;
import java.util.List;

public class StaticDataProvider {
    @DataProvider(name = "dataProviderArray")
    public static Object[][] createData() {
        return new Object[][] {
                {0.0, 32.0},
                {10, 50.0},
                {20, 68}
        };
    }

    @DataProvider(name = "dataProviderIterator")
    public static Iterator<Object[]> createIterator() {
        List<Object[]> list= List.of(
                new Object[]{5, 41},
                new Object[]{15, 59},
                new Object[]{30, 86}
        );
        return list.iterator();
    }

}
