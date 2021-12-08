package day03;

import org.w3c.dom.ls.LSOutput;

public class Caesar extends Encryption{
    private int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypts(String input) {
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < input.length() ; i++) {
            temp.append((char)(((input.charAt(i) + offset - 97) % 26) + 97));
            //temp.append((char)(input.charAt(i) + offset));
        }
        return temp.toString();
    }

    public static void main(String[] args) {
        Caesar caesar = new Caesar(13);
        System.out.println(caesar.encrypts(caesar.encrypts("abcdefghi")));
    }
}
