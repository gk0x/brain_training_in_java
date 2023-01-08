//[pl]Napisz program zamieniający łancuch znaków
//słowa "coding" na ciąg bajtów odpowiadający tym znakom.
//[eng] Write a program to replace the string of "coding" into a string of bytes
// corresponding to those characters.

public class TaskFive {
    public static void main(String[] args) {
        String inscription = "coding";
        System.out.println("Text: " + inscription);
        System.out.print("byte string: ");
        byte[]code = inscription.getBytes();
        for (byte n : code){
            System.out.print(n);
        }

    }
}
