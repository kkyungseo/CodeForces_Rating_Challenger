// CodeForces_71A_Way Too Long Words

import java.util.Scanner;

public class Force71A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            String word = sc.nextLine();

            if (word.length() > 10) {
                System.out.print(word.charAt(0));
                System.out.print(word.length() - 2);
                System.out.println(word.charAt(word.length() - 1));
            } else {
                System.out.println(word);
            }
        }

    }
}
