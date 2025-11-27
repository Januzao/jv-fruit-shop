package core.basesyntax.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCsvFileImpl implements ReadCsvFile {
    @Override
    public List<String> readCsvFile(String fileName) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line.replace(",", " "));
            }
        } catch (IOException e) {
            throw new RuntimeException("Cannot open file: " + fileName, e);
        }
        return lines;
    }
}
