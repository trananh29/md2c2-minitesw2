public class ProgammingBook extends Book{
    private String language;

    private String framework;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public ProgammingBook() {
    }

    public ProgammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public ProgammingBook(String bookCode, String name, float price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }
}
