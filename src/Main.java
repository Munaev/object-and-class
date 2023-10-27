public class Main {
    public static void main(String[] args) {
        Author author = new Author("Толстой", "Николай");
        Author author1 = new Author("Тостой1", "Николай1");

        Book book = new Book("Преступление и наказание", author, 1843);
        Book book1 = new Book("Преступление и наказание1", author1, 1843);

        book1.setYear(1222);
    }
}