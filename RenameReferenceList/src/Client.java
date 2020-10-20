import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input reference list path :");
        ReferenceList r = new ReferenceList(input.nextLine());
        System.out.println(r.getPath());
    }
}
