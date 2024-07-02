// Base class
class VideoTape {
    String title;
    int length;
    boolean available;

    VideoTape(String title, int length, boolean available) {
        this.title = title;
        this.length = length;
        this.available = available;
    }

    void show() {
        System.out.println("Title: " + title);
        System.out.println("Length: " + length + " minutes");
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
}

// Derived class for Movie
class Movie extends VideoTape {
    String director;
    double rating;

    Movie(String title, int length, boolean available, String director, double rating) {
        super(title, length, available);
        this.director = director;
        this.rating = rating;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Director: " + director);
        System.out.println("Rating: " + rating);
    }
}

// Derived class for MusicVideo
class MusicVideo extends VideoTape {
    String artist;
    String category;

    MusicVideo(String title, int length, boolean available, String artist, String category) {
        super(title, length, available);
        this.artist = artist;
        this.category = category;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Artist: " + artist);
        System.out.println("Category: " + category);
    }
}

// Main class to test the hierarchy
public class VideoTapeHierarchy {
    public static void main(String[] args) {
        // Create instances of Movie and MusicVideo
        Movie movie = new Movie("Inception", 148, true, "Christopher Nolan", 8.8);
        MusicVideo musicVideo = new MusicVideo("Thriller", 14, false, "Michael Jackson", "Pop");

        // Display information of each object
        System.out.println("Movie Information:");
        movie.show();

        System.out.println("\nMusic Video Information:");
        musicVideo.show();
    }
}
