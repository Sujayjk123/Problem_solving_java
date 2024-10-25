
 
enum BookStatus {
    AVAILABLE, CHECKED_OUT, RESERVED
}

class Book {
    static String libraryName;
    static int totalBooks;
    static String location;

    String title;
    String author;
    int publicationYear;
    BookStatus status;

    static {
        libraryName = "City Library";
        totalBooks = 1000; // Example total number of books
        location = "Downtown"; // Example library location
    }

    public Book(String title, String author, int publicationYear, BookStatus status) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.status = status;
    }
}


class Member {
    static int totalMembers;
    static String membershipType;

    String name;
    String memberId;
    int age;
    String contactNumber;

    static {
        totalMembers = 500; 
        membershipType = "Standard"; 
    }

    public Member(String name, String memberId, int age, String contactNumber) {
        this.name = name;
        this.memberId = memberId;
        this.age = age;
        this.contactNumber = contactNumber;
    }
}


class Librarian {
    static String position;
    static int maxBooksAllowed;

    String name;
    String employeeId;
    int experienceYears;
    String contactNumber;

    static {
        position = "Head Librarian"; 
        maxBooksAllowed = 5; 
    }

    public Librarian(String name, String employeeId, int experienceYears, String contactNumber) {
        this.name = name;
        this.employeeId = employeeId;
        this.experienceYears = experienceYears;
        this.contactNumber = contactNumber;
    }
}


class Transaction {
    static int totalTransactions;
    static String transactionType;

    String transactionId;
    String memberId;
    String bookTitle;
    String date;

    static {
        totalTransactions = 0; 
        transactionType = "Checkout"; 
    }

    public Transaction(String transactionId, String memberId, String bookTitle, String date) {
        this.transactionId = transactionId;
        this.memberId = memberId;
        this.bookTitle = bookTitle;
        this.date = date;
        totalTransactions++; 
    }
}


class LibraryEvent {
    static int totalEvents;

    String eventName;
    String eventDate;
    String organizer;
    String location;

    static {
        totalEvents = 0; 
    }

    public LibraryEvent(String eventName, String eventDate, String organizer, String location) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.organizer = organizer;
        this.location = location;
        totalEvents++; 
    }
}


public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, BookStatus.AVAILABLE);
        Member member1 = new Member("Alice Johnson", "M001", 30, "555-0123");
        Librarian librarian1 = new Librarian("John Smith", "E001", 10, "555-4567");
        Transaction transaction1 = new Transaction("T001", member1.memberId, book1.title, "2024-10-25");
        LibraryEvent event1 = new LibraryEvent("Book Fair", "2024-11-05", "Community Center", "City Library");

       
        System.out.println("Library Name: " + Book.libraryName);
        System.out.println("Total Books: " + Book.totalBooks);
        System.out.println("Book Title: " + book1.title + ", Author: " + book1.author + ", Status: " + book1.status);
        System.out.println("Member Name: " + member1.name + ", Member ID: " + member1.memberId);
        System.out.println("Librarian Name: " + librarian1.name + ", Employee ID: " + librarian1.employeeId);
        System.out.println("Transaction ID: " + transaction1.transactionId + ", Member ID: " + transaction1.memberId);
        System.out.println("Event Name: " + event1.eventName + ", Event Date: " + event1.eventDate);
    }
}


