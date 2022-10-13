package data;

public class BookOnTape extends Thing {

    private String author; //the name of the author who wrote the book
    private String content; //main content of the book; ex: romatic, detective,...
    private String language; //english or vietnammise,...
    private int version; //version 01, version 02,.....

    public BookOnTape(String serialNumber, String name, double price,
            String author, String content, String language, int version) {
        super(serialNumber, name, price);
        this.author = author;
        this.content = content;
        this.language = language;
        this.version = version;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String getDescription() {
        String s = "Serial Number: " + serialNumber
                + "\nName: " + name
                + "\nPrice: " + price + " $"
                + "\nAuthor: " + author
                + "\nContent of video: " + content
                + "\nLanguage: " + language
                + "\nVersion: " + version;
        return s;
    }

    @Override
    public void showDescription() {
        System.out.println("INFOMATIONS OF BOOKSS:");
        System.out.println(getDescription());
    }
}
