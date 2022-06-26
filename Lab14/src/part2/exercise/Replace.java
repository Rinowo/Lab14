package part2.exercise;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Replace {

    //String replace = input.replace("was", "is");

    public static String readFile() throws IOException {
        FileReader reader = new FileReader("ReplaceText.json");
        List<String> listString = Files.readAllLines((Path) reader);
        String replace = listString.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        replace = replace.replace("was", "is");
        return replace;
    }

    public static void main(String[] args) throws IOException {
        Replace replace1 = new Replace();
        readFile();
    }
}