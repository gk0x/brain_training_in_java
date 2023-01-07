//Napisz program, który utworzy łańcuch znaków wypełniony cyframi układu szesnastkowego
//Write a program that creates a string filled with hexadecimal digits

public class TaskOneHexString {
    public static void main(String[] args) {
        String hexString = "";
        for (int i = 0; i < 16; i++) {
            hexString += Character.forDigit(i, 16);
        }
        hexString = hexString.toUpperCase();
        System.out.println("the hexadecimal digits: " + hexString);
    }
    }

