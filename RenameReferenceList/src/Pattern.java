import java.util.LinkedList;
import java.util.List;

public class Pattern {

    private int number;
    private List<String> authorList;
    private String title;
    private char typeNumber;
    private String type;
    private Journal journal;
    private String otherData;

    public Pattern(String originalPattern) {
        originalPattern = originalPattern.replaceAll("\\s+", "");
        originalPattern = originalPattern.substring(3);
        String[] separatePattern = originalPattern.split("\\.");
        for (String s : separatePattern){
            System.out.println(s);
        }
        String authors = separatePattern[0];
        String[] separateAuthors = authors.split(",");
        authorList = new LinkedList<>();
        for (String author : separateAuthors) {
            authorList.add(author);
        }
        title = separatePattern[1].substring(0, separatePattern[1].length() - 3);
        typeNumber = separatePattern[1].charAt(separatePattern[1].length() - 2);
        if (typeNumber == 'J') {
            type = "Journal";
            journal = new Journal(separatePattern[2]);
            otherData = null;
        }
    }

    public int getNumber() {
        return this.number;
    }

    public List<String> getAuthorList() {
        return this.authorList;
    }

    public String getTitle() {
        return this.title;
    }

    public char getTypeNumber() {
        return this.typeNumber;
    }

    public String getType() {
        return this.type;
    }

    public Journal getJournal() {
        return this.journal;
    }

    public String getOtherData() {
        return this.otherData;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setAuthorList(List<String> authorList) {
        this.authorList = authorList;
    }

    public void setTitle(String title) {
        this.title = title;
    }
//  type几项互相更改bug
    public void setTypeNumber(char typeNumber) {
        this.typeNumber = typeNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setJournal(Journal journal) {
        this.journal = journal;
    }

    public void setOtherData(String otherData) {
        this.otherData = otherData;
    }

}