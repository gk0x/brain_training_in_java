//[pl] Napisz program zamieniający łańcuch cyfr szesnastkowych na odpowiadający mu łańcuch znaków ASCII <br>
//[eng] Write a program that converts a string of hexadecimal digits to the corresponding ASCII string
public class TaskSeven {
    public static void main(String[] args) {
        String hex = "737A796672";
        System.out.println(hex + "  >  ");
        byte[] tmp = new byte[hex.length() / 2];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = Byte.parseByte(hex.substring(2 * i, 2 * i + 2), 16);
        }
        System.out.println(new String(tmp));


    }
}
