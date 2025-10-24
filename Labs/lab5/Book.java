public class Book implements Searchable, Comparable<Book> {
    private String title;
    private String author;
    private String genre;
    private int publicationYear;

    public Book(String title, String author, String genre, int publicationYear) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public boolean matches(String keyword) {
        return title.toLowerCase().contains(keyword.toLowerCase()) ||
               author.toLowerCase().contains(keyword.toLowerCase()) ||
               genre.toLowerCase().contains(keyword.toLowerCase());
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return String.format("{\"title\": \"%s\", \"author\": \"%s\", \"genre\": \"%s\", \"publicationYear\": %d}", 
                             title, author, genre, publicationYear);
    }
}
