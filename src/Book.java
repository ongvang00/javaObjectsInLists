public class Book {
    private String bookTitle;
    private int pageNumbers;
    private int publicationYear;

    //constructor


    public Book(String bookTitle, int pageNumbers, int publicationYear) {
        this.bookTitle = bookTitle;
        this.pageNumbers = pageNumbers;
        this.publicationYear = publicationYear;
    }

    //getter & setters

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public void setPageNumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return bookTitle + "\n" + pageNumbers + " pages, " + publicationYear;
    }

    public String getName() {
        return bookTitle;
    }
}
