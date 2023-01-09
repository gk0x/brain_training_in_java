
//[pl] Napisz program zamieniający ciąg bajtów {115,122,121,102,114} na łańcuch znaków odpowiadający tym liczbom
//[eng] Write a program that converts the byte string {115,122,121,102,114} into a string corresponding to these numbers

import java.util.Arrays;

public class TaskSix {
    public static void main(String[] args) {

        byte[] bytes = {115,122,121,102,114};
        System.out.println(Arrays.toString(bytes));

        String s = new String(bytes);
        System.out.println(s);
    }
}
