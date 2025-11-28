package core.basesyntax.service.impl;

import core.basesyntax.service.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class FileWriterImpl implements FileWriter {
    private static final String RESOURCES_PATH = Paths
            .get(System.getProperty("user.dir"), "src", "main", "resources").toString();

    @Override
    public void write(String resultReporting, String fileName) {
        String fullPath = Paths.get(RESOURCES_PATH, fileName).toString();

        try (BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(fullPath))) {
            writer.write(resultReporting);
        } catch (IOException e) {
            throw new RuntimeException("Cannot write to file: " + fullPath, e);
        }
    }
}
