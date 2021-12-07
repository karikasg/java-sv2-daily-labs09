package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringLists {

    public List<String> shortestWords(List<String> words) {
        int min = minLength(words);
        List<String> shortest = new ArrayList<>();
        for (String word : words) {
            if (word.length() == min) {
                shortest.add(word);
            }
        }

        return shortest;
    }

    public int minLength(List<String> words) {
        int min = 999;
        for (String word : words) {
            if (word.length() < min) {
                min = word.length();
            }
        }
        return min;
    }
}
