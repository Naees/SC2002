public interface Searchable {
    String getTitle();
    String getAuthor();
    String getGenre();
    boolean matches(String keyword);
}
