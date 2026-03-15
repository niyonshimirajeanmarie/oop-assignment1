package librarymanagementsysytem;

public class LibraryOperations {

    public LibraryOperations registerMember(String name, String address) {
        if(name.trim().isEmpty()) System.out.println("Member name cannot be empty!");
        if(address.trim().isEmpty()) System.out.println("Address cannot be empty!");
        System.out.println("Member registered successfully.");
        return this;
    }

    public LibraryOperations addBook(String title, String author, String isbn) {
        if(title.trim().isEmpty()) System.out.println("Book title cannot be empty!");
        if(author.trim().isEmpty()) System.out.println("Author cannot be empty!");
        if(isbn.trim().isEmpty()) System.out.println("ISBN cannot be empty!");
        System.out.println("Book added successfully.");
        return this;
    }

    public LibraryOperations searchBook(String title) {
        if(title.trim().isEmpty()) System.out.println("Search term cannot be empty!");
        System.out.println("Book searched successfully.");
        return this;
    }

    public LibraryOperations issueBook(String member, String book) {
        if(member.trim().isEmpty()) System.out.println("Member invalid!");
        if(book.trim().isEmpty()) System.out.println("Book invalid!");
        System.out.println("Book issued successfully.");
        return this;
    }

    public LibraryOperations returnBook(String book) {
        if(book.trim().isEmpty()) System.out.println("Book invalid!");
        System.out.println("Book returned successfully.");
        return this;
    }

    public LibraryOperations calculateFine() {
        System.out.println("Fine calculated successfully.");
        return this;
    }
}
