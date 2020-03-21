import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class compareBooks {

    public static class Book {

        private String title;
        private String author;
        private double pages;
        private double lastPageRead;

        Book(String title, String author, int pages, int
                lastPageRead) {
            this.title = title;
            this.author = author;
            this.pages = pages;
            this.lastPageRead = lastPageRead;

        }
        public String getTitle() {
            return title;
        }
        public String getAuthor() {
            return author;
        }
        public double getPages() {
            return pages;
        }
        public double lastPageRead() {
            return lastPageRead;
        }
        public double getFinishedPercent() {

            return lastPageRead / pages;

        }

        private ArrayList<String> extracted = new ArrayList<String>();

        void extractChannel(){

            Pattern pattern = Pattern.compile("<div class=\"channelListEntry\">(.*?)</div>");
            Matcher matcher = pattern.matcher(" http://www.posh24.se/kandisar");

            while(matcher.find()){ // Always return false
                System.out.println("hello ?");
                extracted.add(matcher.group(1));
            }
        }
    }

    public static void main(String [] args) {

        Book book1 = new Book("Building Java Programs", "Stuart Reges & Marty Stepp",
                1194, 586);

        Book book2 = new Book("Java is hard","Brian May", 1334,
                23);


        System.out.println(book1.getFinishedPercent());

        System.out.println(book1.extracted);
        book1.extractChannel();



    }
}



