import java.util.Scanner;
class Library{
    int book_cap;
    Scanner buffer = new Scanner(System.in);
    private String[] Availbooks;
    private String[] IssuedBooks;

    public Library(){
        Availbooks = new String[book_cap];
        IssuedBooks = new String[book_cap];
        for(int i = 0; i < book_cap; i++) {
            Availbooks[i] = "";
            IssuedBooks[i] = "";
        }
    }

    public void setAvailbooks() {
        for(int i = 0; i < book_cap; i++){
            System.out.print("Enter book name: ");
            Availbooks[i] = buffer.nextLine();
        }
    }
}

public class LibraryImplementation {
    public static void main(String[] args) {
        Library lib = new Library();
        System.out.println("Enter number of books: ");
        Scanner scan = new Scanner(System.in);
        lib.book_cap = scan.nextInt();

        lib.setAvailbooks();

    }
}
