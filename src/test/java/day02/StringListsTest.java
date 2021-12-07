package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    @Test
    void shortestWordsTest() {
        StringLists stringLists = new StringLists();
        assertEquals(Arrays.asList("aa", "bb", "dd"), stringLists.shortestWords(Arrays.asList("aaa", "aa", "bb", "cccc", "dd")));
    }

}