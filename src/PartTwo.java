import java.util.Scanner;

public class PartTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userPick = InputHelper.getRangedInt(scan, "input an integer value between 1 and 100: ", 1,100);
    }
}
