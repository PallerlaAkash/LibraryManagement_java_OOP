import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        // Sample data
        lib.addBook(new Book(1, "THE LEGENDS OF HANUMAN", "Sarwat Chaddha"));
        lib.addBook(new Book(2, "MAHAVATAR NARSIMHA", "Jayapurna Das"));
        lib.addUser(new User(101, "ABC"));
        lib.addUser(new User(102, "DEF"));

        int choice;
        do {
            System.out.println("\n1. Display Books\n2. Display Users\n3. Issue Book\n4. Return Book\n5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    lib.displayBooks();
                    break;
                case 2:
                    lib.displayUsers();
                    break;
                case 3:
                    System.out.print("Enter User ID: ");
                    int uid = sc.nextInt();
                    System.out.print("Enter Book ID: ");
                    int bid = sc.nextInt();
                    lib.issueBook(uid, bid);
                    break;
                case 4:
                    System.out.print("Enter User ID: ");
                    uid = sc.nextInt();
                    System.out.print("Enter Book ID: ");
                    bid = sc.nextInt();
                    lib.returnBook(uid, bid);
                    break;
            }
        } while (choice != 5);

        sc.close();
    }
}
