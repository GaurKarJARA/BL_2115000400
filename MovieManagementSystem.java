class Movie {
    String title, director;
    int year;
    double rating;
    Movie prev, next;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.prev = this.next = null;
    }
}

class MovieManagement {
    private Movie head, tail;

    public void addMovieAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
            return;
        }
        tail.next = newMovie;
        newMovie.prev = tail;
        tail = newMovie;
    }

    public void deleteMovieByTitle(String title) {
        Movie temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp == null) return;
        if (temp == head) head = head.next;
        if (temp == tail) tail = tail.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
    }

    public void displayMoviesForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MovieManagement mm = new MovieManagement();
        mm.addMovieAtEnd("GODFATHER", "unknown", 1999, 9.9);
        mm.addMovieAtEnd("Inception", "CHRISTOPHER", 2013, 10.0);
        mm.addMovieAtEnd("LUDO", "IDK", 2019, 8.0);
        mm.displayMoviesForward();
        
        mm.deleteMovieByTitle("LUDO");
        System.out.println("\nAfter deleting :");
        mm.displayMoviesForward();
    }
}