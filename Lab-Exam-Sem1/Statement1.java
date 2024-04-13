class LibraryItem{
    String title;
    static int count = 0;
    int itemID;

    LibraryItem(String title){
        this.title = title;
        this.itemID = count;
        count++;
    }

    void displayInfo(){
        System.out.println("(" + title + " , " + itemID  + " )");
    }
}

class Book extends LibraryItem{
    String author;

    Book(String title, String author){
        super(title);
        this.author = author;
    }

    @Override
    void displayInfo(){
        System.out.println("(" + title + " , " + itemID  + " , " + author + " )");
    }

}


class DVD extends LibraryItem{
    String director;

    DVD(String title, String director){
        super(title);
        this.director = director;
    }

    @Override
    void displayInfo(){
        System.out.println("(" + title + " , " + itemID  + " , " + director + " )");
    }
}


public class Statement1{
    public static void main(String[] args) {
        Book book1 = new Book("Saundarya Lahari","Shankaracharya");
        DVD dvd1 = new DVD("Baahubali","SS Rajmouli");

        book1.displayInfo();
        dvd1.displayInfo();
    }
}