import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class homework2 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число а: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();
        in.close();
        System.out.println("a ** b = : " + pow(a, b));

        try {
            File input = new File("input.txt");
            File output = new File("output.txt");

            if (!input.exists() || !output.exists())
                input.createNewFile();
            output.createNewFile();
        } catch (IOException e) {
            System.out.println("ERROR" + e);

        }

        PrintWriter out = new PrintWriter("output.txt");
        String num = Integer.toString(pow(a, b));
        out.println(num);
        out.close();

    }

    public static int pow(int a, int b) {
        return (int) Math.pow(a, b);

    }

}
