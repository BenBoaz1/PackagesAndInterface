package bookpack ;
import java.lang.String;

class Book {
    private String title;
    private String author;
    private int pubDate;

    Book (String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;

    }

    void show () {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}

class Main {
    public static void main (String [] args) {
        Book books [] = new Book [5];
        books[0] = new Book("Java :  Beginner's guide ", "Schlidt" , 2014);
        books[1] = new Book("Java :  Beginner's guide 2", "Schlidt 2" , 2015);
        books[2] = new Book("Java :  Beginner's guide 3", "Schlidt 3" , 2016);
        books[3] = new Book("Java :  Beginner's guide 4", "Schlidt 4" , 2017);
        books[4] = new Book("Java :  Beginner's guide 5", "Schlidt 5" , 2018);

        for (int i = 0; i< books.length; i++){
            books[i].show();
        }
    }


}