
//[pl] Napisz program,demonstrujący działanie metod: isDigit(), isLetter(),
//isLetterorDigit(), isLowerCase(), isSpaceChar(), isUpperCase(), isWhiteSpace() dla
//zestawu znaków:<br>
//a)"A\240b3&4\040"<br>
//b)"Łoś 0+\t" <br>
//c)"#\"\304\\\3444\b\n <br>
//[eng]Write a program demonstrating how the methods work:isDigit(), isLetter(),
//isLetterorDigit(), isLowerCase(), isSpaceChar(), isUpperCase(), isWhiteSpace() for character set:<br>
//a)"A\240b3&4\040"<br>

public class TaskThree {
    public static void main(String[] args) {
        String str = "A\240b3&4\040";
        System.out.println("znaki: " + str);
        char[] characters = str.toCharArray();
        System.out.println(characters[0] + ":");

        System.out.println("isDigit: " + Character.isDigit(characters[0]));
        System.out.println("isLetter: " + Character.isLetter(characters[0]));
        System.out.println("isLetterOrDigit: " + Character.isLetterOrDigit(characters[0]));
        System.out.println("isLowerCase: " + Character.isLowerCase(characters[0]));
        System.out.println("isSpaceChar: " + Character.isSpaceChar(characters[0]));
        System.out.println("isUpperCase: " + Character.isUpperCase(characters[0]));
        System.out.println("isWhiteSpace:" + Character.isWhitespace(characters[0]));
        System.out.println("");


        System.out.println(characters[1] + ":");

        System.out.println("isDigit: " + Character.isDigit(characters[1]));
        System.out.println("isLetter: " + Character.isLetter(characters[1]));
        System.out.println("isLetterOrDigit: " + Character.isLetterOrDigit(characters[1]));
        System.out.println("isSpaceChar: " + Character.isSpaceChar(characters[1]));
        System.out.println("isLowerCase: " + Character.isLowerCase(characters[1]));
        System.out.println("isUpperCase: " + Character.isUpperCase(characters[1]));
        System.out.println("isWhiteSpace:" + Character.isWhitespace(characters[1]));
        System.out.println("");


        System.out.println(characters[2] + ":");

        System.out.println("isDigit: " + Character.isDigit(characters[2]));
        System.out.println("isLetter: " + Character.isLetter(characters[2]));
        System.out.println("isLetterOrDigit: " + Character.isLetterOrDigit(characters[2]));
        System.out.println("isSpaceChar: " + Character.isSpaceChar(characters[2]));
        System.out.println("isLowerCase: " + Character.isLowerCase(characters[2]));
        System.out.println("isUpperCase: " + Character.isUpperCase(characters[2]));
        System.out.println("isWhiteSpace:" + Character.isWhitespace(characters[2]));
        System.out.println("");


        System.out.println(characters[3] + ":");

        System.out.println("isDigit: " + Character.isDigit(characters[3]));
        System.out.println("isLetter: " + Character.isLetter(characters[3]));
        System.out.println("isLetterOrDigit: " + Character.isLetterOrDigit(characters[3]));
        System.out.println("isSpaceChar: " + Character.isSpaceChar(characters[3]));
        System.out.println("isLowerCase: " + Character.isLowerCase(characters[3]));
        System.out.println("isUpperCase: " + Character.isUpperCase(characters[3]));
        System.out.println("isWhiteSpace:" + Character.isWhitespace(characters[3]));
        System.out.println("");


        System.out.println(characters[4] + ":");

        System.out.println("isDigit: " + Character.isDigit(characters[4]));
        System.out.println("isLetter: " + Character.isLetter(characters[4]));
        System.out.println("isLetterOrDigit: " + Character.isLetterOrDigit(characters[4]));
        System.out.println("isSpaceChar: " + Character.isSpaceChar(characters[4]));
        System.out.println("isLowerCase: " + Character.isLowerCase(characters[4]));
        System.out.println("isUpperCase: " + Character.isUpperCase(characters[4]));
        System.out.println("isWhiteSpace:" + Character.isWhitespace(characters[4]));
        System.out.println("");


        System.out.println(characters[5] + ":");

        System.out.println("isDigit: " + Character.isDigit(characters[5]));
        System.out.println("isLetter: " + Character.isLetter(characters[5]));
        System.out.println("isLetterOrDigit: " + Character.isLetterOrDigit(characters[5]));
        System.out.println("isSpaceChar: " + Character.isSpaceChar(characters[5]));
        System.out.println("isLowerCase: " + Character.isLowerCase(characters[5]));
        System.out.println("isUpperCase: " + Character.isUpperCase(characters[5]));
        System.out.println("isWhiteSpace:" + Character.isWhitespace(characters[5]));
        System.out.println("");


        System.out.println(characters[6] + ":");

        System.out.println("isDigit: " + Character.isDigit(characters[6]));
        System.out.println("isLetter: " + Character.isLetter(characters[6]));
        System.out.println("isLetterOrDigit: " + Character.isLetterOrDigit(characters[6]));
        System.out.println("isSpaceChar: " + Character.isSpaceChar(characters[6]));
        System.out.println("isLowerCase: " + Character.isLowerCase(characters[6]));
        System.out.println("isUpperCase: " + Character.isUpperCase(characters[6]));
        System.out.println("isWhiteSpace:" + Character.isWhitespace(characters[6]));
        System.out.println("");
    }
}
