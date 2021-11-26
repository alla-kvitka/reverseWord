import java.util.Scanner;

public class Main {
    public static final ReverseCharacters reverseCharacters = new ReverseCharacters();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        System.out.println(reverseCharacters.reverseStringData(data));
    }
}