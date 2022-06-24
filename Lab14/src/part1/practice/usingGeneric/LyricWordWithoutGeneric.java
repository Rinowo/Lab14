package part1.practice.usingGeneric;

import java.util.ArrayList;
import java.util.List;

public class LyricWordWithoutGeneric {
    private static final Word[] addLyric = {
            new Word("you",1), new Word("say",2), new Word("it",3),
            new Word("best",4),new Word("when",5),new Word("you",6),
            new Word("say",7), new Word("nothing",8), new Word("at",9),
            new Word("all",10)
    };

    public static void main(String[] args) {
        //Create a list that's implemented by ArrayList
        List<Word> lyric = new ArrayList<>();

        //Add all String in string array to list
        for (Word w :
                addLyric) {
            lyric.add(w);
        }

        //Show all elements of word
        for (Word w :
                lyric) {
            System.out.println(w.getValue()+ ", " + w.getPosition());
        }
    }
}
