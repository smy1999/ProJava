import java.util.LinkedList;
import java.util.List;

public class Pattern {

    private int number;
    private List<String> authorList;
    private String title;
    private char typeNumber;
    private String type;
    private String journal;
    private String otherData;

    public void Pattern(String originalPattern) {
        originalPattern = originalPattern.replaceAll("\\s+", "");
        String[] separatePattern = originalPattern.split(".");
        String authors = separatePattern[0];
        String[] separateAuthors = authors.split(",");
        authorList = new LinkedList<>();
        for (String author : separateAuthors) {
            authorList.add(author);
        }
    }

}