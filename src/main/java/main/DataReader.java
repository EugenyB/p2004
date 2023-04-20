package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class DataReader {
    public String read(String filename) {
        String data = null;
        Path path = Paths.get(filename);
        if (Files.exists(path) && !Files.isDirectory(path) && Files.isReadable(path)) {
            try(BufferedReader reader = Files.newBufferedReader(path)) {
                StringBuilder builder = new StringBuilder();
//                data = Files.lines(path).reduce((s1, s2) -> s1 + " " +s2).orElse("empty");
                data = reader.lines().collect(Collectors.joining(" "));
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }
}
