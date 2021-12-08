package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

    @Test
    void encryptTest() {
        Caesar caesar = new Caesar(1);
        assertEquals("bcdefghijklmnopqrstuvwxyza", caesar.encrypts("abcdefghijklmnopqrstuvwxyz"));
        assertEquals("xpsljoh", caesar.encrypts("working"));
    }

}