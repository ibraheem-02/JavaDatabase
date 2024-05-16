 public class DataBase {
    private String universityName;
    private String instituteName;
    private int consoleWidth = 80;

    public DataBase(String universityName, String instituteName) {
        this.universityName = universityName;
        this.instituteName = instituteName;
    }

    public String getCenteredUniversityName() {
        return centerText(universityName, consoleWidth);
    }

    public String getCenteredInstituteName() {
        return centerText(instituteName, consoleWidth);
    }

    private String centerText(String text, int width) {
        int padding = (width - text.length()) / 2;
        return " ".repeat(padding) + text;
    }
}
