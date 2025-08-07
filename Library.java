import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void issueBook(int userId, int bookId) {
        User user = getUserById(userId);
        Book book = getBookById(bookId);

        if (user != null && book != null && !book.isIssued) {
            user.borrowBook(book);
            book.isIssued = true;
            System.out.println("Book issued to " + user.name);
        } else {
            System.out.println("Cannot issue book.");
        }
    }

    public void returnBook(int userId, int bookId) {
        User user = getUserById(userId);
        Book book = getBookById(bookId);

        if (user != null && book != null && book.isIssued) {
            user.returnBook(book);
            book.isIssued = false;
            System.out.println("Book returned by " + user.name);
        } else {
            System.out.println("Cannot return book.");
        }
    }

    public Book getBookById(int id) {
        for (Book b : books) {
            if (b.id == id) return b;
        }
        return null;
    }

    public User getUserById(int id) {
        for (User u : users) {
            if (u.id == id) return u;
        }
        return null;
    }

    public void displayBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void displayUsers() {
        for (User u : users) {
            System.out.println(u);
        }
    }
}
