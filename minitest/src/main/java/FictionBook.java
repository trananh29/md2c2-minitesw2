public class FictionBook extends Book{
    private String catelogy;

    public String getCatelogy() {
        return catelogy;
    }

    public void setCatelogy(String catelogy) {
        this.catelogy = catelogy;
    }

    public FictionBook() {
    }

    public FictionBook(String catelogy) {
        this.catelogy = catelogy;
    }

    public FictionBook(String bookCode, String name, float price, String author, String catelogy) {
        super(bookCode, name, price, author);
        this.catelogy = catelogy;
    }
}
