package librarymanagementsysytem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Member Name: ");
        String memberName = sc.nextLine();

        System.out.print("Enter Member Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Book Title: ");
        String bookTitle = sc.nextLine();

        System.out.print("Enter Book Author: ");
        String bookAuthor = sc.nextLine();

        System.out.print("Enter Book ISBN: ");
        String isbn = sc.nextLine();

        LibraryOperations lib = new LibraryOperations();

        lib.registerMember(memberName, address)
                .addBook(bookTitle, bookAuthor, isbn)
                .searchBook(bookTitle)
                .issueBook(memberName, bookTitle)
                .returnBook(bookTitle)
                .calculateFine();
    }
}