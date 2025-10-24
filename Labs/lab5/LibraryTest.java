public class LibraryTest {
    public static void main(String[] args) {
        Library<Book> library = new Library<>();
        
        // Test Case 1: Adding Books to the Library
        System.out.println("Test Case 1: Adding Books to the Library");
        Book book1 = new Book("1984", "George Orwell", "Fiction", 1949);
        Book book2 = new Book("A Brief History of Time", "Stephen Hawking", "Science", 1988);
        library.addItem(book1);
        library.addItem(book2);
        System.out.println("Library contains " + library.size() + " books.\n");
        
        // Test Case 2: Filtering Books by Genre
        System.out.println("Test Case 2: Filtering Books by Genre");
        System.out.println("Input: Genre: \"Fiction\"");
        System.out.println("Expected Output:");
        library.filterByGenre("Fiction").forEach(System.out::println);
        System.out.println();
        
        // Test Case 3: Filtering Books by Author
        System.out.println("Test Case 3: Filtering Books by Author");
        System.out.println("Input: Author: \"Stephen Hawking\"");
        System.out.println("Expected Output:");
        library.filterByAuthor("Stephen Hawking").forEach(System.out::println);
        System.out.println();
        
        // Test Case 4: Searching Books by Keyword
        System.out.println("Test Case 4: Searching Books by Keyword");
        System.out.println("Input: Keyword: \"Time\"");
        System.out.println("Expected Output:");
        library.searchByKeyword("Time").forEach(System.out::println);
        System.out.println();
        
        // Test Case 5: Add book and Sort by Title
        System.out.println("Test Case 5: Add book and Sort by Title");
        Book book3 = new Book("A Beautiful Mind", "Sylvia Nasar", "Biography", 1998);
        library.addItem(book3);
        library.sortByTitle();
        System.out.println("Sorted Order by Title:");
        library.displayAllBooks();
        System.out.println();
        
        // Test Case 6: Providing Recommendations
        System.out.println("Test Case 6: Providing Recommendations");
        System.out.println("Input: Category: \"Science\"");
        System.out.println("Expected Output:");
        System.out.println("Recommendation: " + library.getRecommendation("Science"));
        System.out.println();
        
        // Test Case 7: Borrower Operations
        System.out.println("Test Case 7: Borrower Operations");
        Borrower alice = new Borrower("Alice");
        alice.borrowBook(book1);
        System.out.println("Borrower details:");
        System.out.println(alice);
        System.out.println();
        
        // Test Case 8: Returning a Book
        System.out.println("Test Case 8: Returning a Book");
        alice.returnBook(book1);
        System.out.println("Borrower details:");
        System.out.println(alice);
    }
}
