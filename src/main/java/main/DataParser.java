package main;

import java.util.ArrayList;
import java.util.List;

public class DataParser {
    public List<Double> parseData(String data) {
        List<Double> result = new ArrayList<>();
        for (String s : data.split(" ")) {
            try {
                double v = Double.parseDouble(s);
                result.add(v);
            } catch (NumberFormatException ignored) {}
        }
        return result;
    }
}
