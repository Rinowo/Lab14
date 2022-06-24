package part1.practice.genericOneParameter;

public class PairTest {
    public static void main(String[] args) {
        String[] words = { "Mary", "had", "a", "little", "lamb" };

        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("Min = " + mm.getFirst());
        System.out.println("Max = " + mm.getSecond());
    }
}
