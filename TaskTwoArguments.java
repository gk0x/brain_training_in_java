
//[pl] Napisz program, który wyświetli na ekranie liczbę argumentów wywołania aplikacji oraz podane argumenty.
// Każdy argument powinien być wyświetlony w odrębnym wierszu
//[eng] Write a program that displays on the screen the number of arguments to call the application and the given arguments.
// Every argument should be displayed on a separate line
public class TaskTwoArguments {
    public static void main(String[] args) {
        System.out.println("liczba argumentów:" + args.length);
//
        for (int i = 0; i< args.length; i++){
            System.out.println(args[i]);

            //terminal: arg1 arg2

        }
    }
}
