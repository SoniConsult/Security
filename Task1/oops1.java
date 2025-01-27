class Book {
    private String title;
    private String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class LibraryMember {
    private String name;
    private int memberId;

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    // Display Member Information
    public void displayMemberInfo() {
        System.out.println("Member: " + name + ", Member ID: " + memberId);
    }
}

public class oops1 {
    public static void main(String[] args) {
        Book book1 = new Book("1123", "Soni Rathore", "123456789");
        LibraryMember member1 = new LibraryMember("Anee", 1001);
        book1.displayBookInfo();
        member1.displayMemberInfo();
    }
}
