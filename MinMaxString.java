import java.util.Scanner;

public class MinMaxString {
    public static void main(String[] args) {
        int n = 10;
        Scanner sc = new Scanner(System.in);
        String max = "", min = "", str = "";
        for (int i = 0; i < n; i++) {
            System.out.print("> ");
            if (sc.hasNextLine()) {
                str = sc.nextLine();
                if (0 == i) {
                    min = str;
                }
                if (str.length() > max.length()) {
                    max = str;
                } else if (str.length() < min.length()) {
                    min = str;
                }
            }
        }
        System.out.println("Max string = " + max + ", length = " + max.length());
        System.out.println("Min string = " + min + ", length = " + min.length());
    }
}