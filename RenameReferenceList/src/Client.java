import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input reference list path :");
        ReferenceList r = new ReferenceList(input.nextLine());

    }
}
