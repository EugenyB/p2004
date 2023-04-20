package main;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        DataReader reader = new DataReader();
        String s = reader.read("file.txt");
        System.out.println(s);

        DataParser parser = new DataParser();
        List<Double> list = parser.parseData(s);
        System.out.println(list);
    }
}
