package br.com.igorfersantos.persistence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IOFilePersistence implements FilePersistence {

    private final String currentDir = System.getProperty("user.dir");
    private final String storedDir = "/managedFiles/IO/";
    private final String fileName;

    public IOFilePersistence(String fileName) throws IOException {
        this.fileName = fileName;
        var file = new File(currentDir + storedDir);
        if (!file.exists() && !file.mkdirs()) throw new IOException("Error while creating files");
        clearFile();
    }

    @Override
    public String write(String data) {
        try (var fileWriter = new FileWriter(currentDir + storedDir + fileName, true);
             var bufferedWriter = new BufferedWriter(fileWriter);
             var printWriter = new PrintWriter(bufferedWriter)
        ) {
            printWriter.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    @Override
    public boolean remove(String sentence) {
        var contentList = toListString();
        if (contentList.stream().noneMatch(line -> line.contains(sentence))) return false;

        clearFile();
        contentList.stream().filter(line -> !line.contains(sentence)).forEach(this::write);
        return true;
    }

    @Override
    public String replace(String oldContent, String newContent) {
        var contentList = toListString();
        if (contentList.stream().noneMatch(line -> line.contains(oldContent))) return "";
        clearFile();
        contentList.stream().map(line -> line.contains(oldContent) ? newContent : line).forEach(this::write);
        return newContent;
    }

    private List<String> toListString() {
        var content = findAll();
        return new ArrayList<>(
                Stream.of(content.split(System.lineSeparator())).toList()
        );
    }

    @Override
    public String findAll() {
        var content = new StringBuilder();
        try (var reader = new BufferedReader(new FileReader(currentDir + storedDir + fileName))) {
            String line;
            do {
                line = reader.readLine();
                if (line != null) content.append(line).append(System.lineSeparator());
            } while (line != null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    @Override
    public String findBy(final String sentence) {
        var found = "";
        try (var reader = new BufferedReader(new FileReader(currentDir + storedDir + fileName))) {
            var line = reader.readLine();
            while (line != null) {
                if (line.contains(sentence)) {
                    found = line;
                    break;
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return found;
    }

    private void clearFile() {
        try (OutputStream outputStream = new FileOutputStream(currentDir + storedDir + fileName)) {
            System.out.printf("Starting a new file at %s\n", currentDir + storedDir + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
