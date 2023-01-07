//[pl] Napisz program, który w formie tabeli przedstawi dowód praw De Morgana
//[eng]Write a program that presents a proof of De Morgan's laws in the form of a table

public class TaskThree {
    public static void main(String[] args) {
       //De Morgan's first law states that the complement of the union
        // of two sets A and B is equal to the intersection of the complement of
        // the sets A and B
        //!(a && b) == !a || !b
        boolean a = true;
        boolean b = false;
        // create a formatted table:
        System.out.println(
                "a---b---!a---!b---(a&&b)---!(a&&b)---(!a||!b)---!(a||b)---!a&&!b---");

        System.out.println("------------------------------------------------------------------------");

        //Second law states that the complement of the
        // intersection of two sets is the same as the union of their complements.
        //!(!a || !b) == a && b

    }
}
