import java.util.Arrays;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava puzzle = new PuzzleJava();

        System.out.println("Task 1: ");
        System.out.println(puzzle.greaterThan10());

        System.out.println("Task 2: ");
        System.out.println(puzzle.names());

        System.out.println("Task 3: ");
        puzzle.alphabet();

        System.out.println("Task 4: ");
        System.out.println(puzzle.tenRandom());

        System.out.println("Task 5: ");
        puzzle.tenSorted();

        System.out.println("Task 6: ");
        puzzle.randString();

        System.out.println("Task 7: ");
        puzzle.tenStrings();
    }
}
