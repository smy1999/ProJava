import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReferenceList {

    List<Pattern> rList;

    public ReferenceList(String path) throws FileNotFoundException {
        Scanner input = new Scanner(new File(path));
        rList = new ArrayList<>();
        int count = 1;
        while (input.hasNextLine()) {
            Pattern p = new Pattern(input.nextLine());
            p.setNumber(count++);
            rList.add(p);
        }

    }


}
