//[pl] Ciąg bitów 111110000011110000111000110010 reprezentuje pewną liczbę zmienno-przecinkową pojedynczej
// precyzji.Jaką wartość dziesiętną ma ta liczba? Napisz program wyznaczający tę wartość.<br>
//[eng]The bit string 111110000011110000111000110010 represents some single precision floating point number.
//What is the decimal value of this number? Write a program to evaluate this value.<br>

public class TaskEight {
    public static void main(String[] args) {

        String bin = "111110000011110000111000110010";
        int n = Integer.parseInt(bin,2);
        System.out.println("int: " + n);
        float x = Float.intBitsToFloat(n);
        System.out.println("float: " + x);

    }
}
