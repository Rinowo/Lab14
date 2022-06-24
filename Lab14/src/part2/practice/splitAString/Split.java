package part2.practice.splitAString;

import java.util.regex.Pattern;

public class Split {
    public static void main(String[] args) {
        String[] x = Pattern.compile("ian").split(
                "The darwinian devonian explodian chicken");
        for (int i = 0; i < x.length; i++) {
            System.out.println(i + " \"" + x[i] + "\"");
        }
    }
}
