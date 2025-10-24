import java.util.*;
import java.util.stream.Collectors;

public class Library<T extends Searchable>{
    private List<T> items;
    private Set<String> genres;
    private Map<String, List<T>> authorMap;

    public Library() {
        this.items = new ArrayList<>();
        this.genres = new HashSet<>();
        this.authorMap = new HashMap<>();
    }

    public void addItem(T item) {
        items.add(item);
        if (item instanceof Book book) {
            genres.add(book.getGenre());
            authorMap.computeIfAbsent(book.getAuthor(), k -> new ArrayList<>()).add(item);
        }
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public List<T> retrieveItem(T item) {
        return Collections.unmodifiableList(items);
    }

    public List<Book> filterByAuthor(String author) {
        return items.stream()
        .filter(item -> item instanceof Book book && book.getAuthor().equalsIgnoreCase(author))
        .map(item -> (Book) item)
        .collect(Collectors.toList());
    }

    public List<Book> filterByGenre(String genre) {
        return items.stream()
        .filter(item -> item instanceof Book book && book.getGenre().equalsIgnoreCase(genre))
        .map(item -> (Book) item)
        .collect(Collectors.toList());
    }

    public void displayAllBooks() {
        for (T item : items) {
            System.out.println(item);
        }
    }

    public List<T> searchByKeyword(String keyword) {
        return items.stream().filter(item -> item.matches(keyword)).collect(Collectors.toList());
    }

    public void sortByTitle() {
        items.sort((a, b) -> a.getTitle().compareTo(b.getTitle()));
    }

    public String getRecommendation(String genre) {
        List<Book> books = filterByGenre(genre);
        if (books.isEmpty()) {
            return "No recommendations available for " + genre;
        }
        Book book = books.get(0);
        return String.format("Try '%s' by %s.", book.getTitle(), book.getAuthor());
    }

    public int size() {
        return items.size();
    }

    public String recommendBook(String category) {
        return switch (category.toLowerCase()) {
            case "fiction" -> "Try '1984' by George Orwell.";
            case "science" -> "Try 'A Brief History of Time' by Stephen Hawking.";
            case "biography" -> "Try 'A Beautiful Mind' by Sylvia Nasar.";
            case "fantasy" -> "Try 'The Hobbit' by J.R.R. Tolkien.";
            case "mystery" -> "Try 'Sherlock Holmes' by Arthur Conan Doyle.";
            default -> "No recommendations available for " + category;
        };
    }
}
