import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Journal {

    private String originalData;
    private String name;
    private int year;
    private int issue;
    private List<Integer> page;

    public Journal(String data) {
        originalData = data;
        String[] datas = data.split(",");
        name = datas[0];
        year = Integer.valueOf(datas[1].substring(0, 4));
        issue = Integer.valueOf(datas[1].split("\\(")[1].split("\\)")[0]);
        page = initPage(datas[1].split(":")[1]);
    }

    private List<Integer> initPage(String pages) {
        List<Integer> l = new ArrayList<>();
        String[] separatePage = pages.split(",");
        for (String s : separatePage) {
            if (s.charAt(1) == '-') {
                for (int i = s.charAt(0) - 48; i <= s.charAt(2) - 48; i++) {
                    l.add(i);
                }
            } else {
                l.add(Integer.valueOf(s));
            }
        }
        return l;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }

    public void setPage(List<Integer> page) {
        this.page = page;
    }

    public String getOriginalData() {
        return this.originalData;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public int getIssue() {
        return this.issue;
    }

    public List<Integer> getPage() {
        return this.page;
    }

    public void printPage() {
        System.out.print(page.get(0));
        for (int i = 1; i < page.size(); i++) {
            System.out.print(", " + page.get(i));
        }
        System.out.println();
    }

    public String toString() {
        String ans = name + " " + year + "(" + issue + ") " + "page : ";
        ans += page.get(0);
        for (int i = 1; i < page.size(); i++) {
            ans += ", " + page.get(i);
        }
        return ans;
    }

}
