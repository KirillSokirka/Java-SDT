/*"""
Создать класс для элемента каталога музыкальных
компакт дисков (поля: исполнитель, композитор, название диска, любимый трек,
дата покупки, кому дан диск, количество треков, продолжительность).
"""*/

package Task20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Program {
    import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.regex.Pattern;

    public class CompactDisc implements ICompactDisc {
        /** A field for author name */
        private String author;
        /** A field for compositor name */
        private String compositor;
        /** A field for disc name */
        private String discName;
        /** A field for favourite song name */
        private String favouriteSong;
        /** A field for dateOfBuy */
        private Date dateOfBuy;
        /** A field for name of disc current owner */
        private String whoIsOwner;
        /** A field for number of songs on the disc */
        private int numberOfSongs;
        /** A field for all songs duration */
        private double duration;

        /** getter for field author
         * @return the songs' author name
         */
        @Override
        public String getAuthor() {
            return author;
        }

        /** setter for field author
         * @param author name of author
         */
        @Override
        public void setAuthor(String author) {
            if (author.trim().isEmpty())
                throw new IllegalArgumentException();
            this.author = author;
        }

        /** getter for field compositor
         * @return the songs' compositor name
         */
        @Override
        public String getCompositor() {
            return compositor;
        }

        /** setter for field compositor
         * @param compositor value for compositor field
         */
        @Override
        public void setCompositor(String compositor) {
            if (compositor.trim().isEmpty())
                throw new IllegalArgumentException();
            this.compositor = compositor;
        }

        /** getter for field discName
         * @return the name of disc
         */
        @Override
        public String getDiscName() {
            return discName;
        }

        /** setter for field discName
         * @param discName a new value for discName field
         */
        @Override
        public void setDiscName(String discName) {
            if (discName.trim().isEmpty())
                throw new IllegalArgumentException();
            this.discName = discName;
        }

        /** getter for field favouriteSong
         * @return the name of favouriteSong
         */
        @Override
        public String getFavouriteSong() {
            return favouriteSong;
        }

        /** setter for field favouriteSong
         * @param favouriteSong a new value for favouriteSong field
         */
        @Override
        public void setFavouriteSong(String favouriteSong) {
            if (favouriteSong.trim().isEmpty())
                throw new IllegalArgumentException();
            this.favouriteSong = favouriteSong;
        }

        /** getter for field dateOfBuy
         * @return the date of buying
         */
        @Override
        public Date getDateOfBuy() {
            return dateOfBuy;
        }

        /** setter for field dateOfBut
         * @param dateOfBuy a new value for dateOfBuy field
         * @throws ParseException when a format of string isn't correct
         */
        @Override
        public void setDateOfBuy(String dateOfBuy) throws ParseException {
            if (!Pattern.matches("(0?[1-9]|[12][0-9]|3[0-1])-(0?[1-9]|1[0-2])-(20[2-9][1-9])", dateOfBuy))
                throw new IllegalArgumentException();
            var formater = new SimpleDateFormat("dd-MM-yyyy");
            this.dateOfBuy = formater.parse(dateOfBuy);
        }

        /** getter for field whoIsOwner
         * @return the name of buyer
         */
        @Override
        public String getWhoIsOwner() {
            return whoIsOwner;
        }

        /** setter for field whoIsOwner
         * @param whoIsOwner a new value for whoIsOwner field
         */
        @Override
        public void setWhoIsOwner(String whoIsOwner) {
            if (whoIsOwner.trim().isEmpty())
                throw new IllegalArgumentException();
            this.whoIsOwner = whoIsOwner;
        }

        /** getter for field numberOfSongs
         * @return the number of songs
         */
        @Override
        public int getNumberOfSongs() {
            return numberOfSongs;
        }

        /** setter for field NumberOfSongs
         * @param numberOfSongs a new value for field numberOfSongs
         * @throws IllegalArgumentException when numberOfSong less|equal zero
         */
        @Override
        public void setNumberOfSongs(int numberOfSongs) {
            if (numberOfSongs <= 0)
                throw new IllegalArgumentException();
            this.numberOfSongs = numberOfSongs;
        }

        /** getter for field duration
         * @return the duration of songs playing
         */
        @Override
        public double getDuration() {
            return duration;
        }

        /** setter for field duration
         * @param duration a new value for field duration
         * @throws IllegalArgumentException when duration less|equal zero
         */
        @Override
        public void setDuration(double duration) {
            if (duration <= 0)
                throw new IllegalArgumentException();
            this.duration = duration;
        }

        @Override
        public String toString() {
            var format = new SimpleDateFormat("dd-MM-yyyy");
            return "CompactDisc {" +
                    "\n\tauthor= '" + author + '\'' +
                    "\n\tcompositor= '" + compositor + '\'' +
                    "\n\tdiscName= '" + discName + '\'' +
                    "\n\tfavouriteSong= '" + favouriteSong + '\'' +
                    "\n\tdateOfBuy= " + format.format(dateOfBuy) +
                    "\n\twhoIsOwner= '" + whoIsOwner + '\'' +
                    "\n\tnumberOfSongs= " + numberOfSongs +
                    "\n\tduration= " + duration +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CompactDisc that = (CompactDisc) o;
            return numberOfSongs == that.numberOfSongs && Double.compare(that.duration, duration) == 0
                    && Objects.equals(author, that.author)
                    && Objects.equals(compositor, that.compositor)
                    && Objects.equals(discName, that.discName)
                    && Objects.equals(favouriteSong, that.favouriteSong)
                    && Objects.equals(dateOfBuy, that.dateOfBuy)
                    && Objects.equals(whoIsOwner, that.whoIsOwner);
        }

        @Override
        public int hashCode() {
            return Objects.hash(author, compositor, discName, favouriteSong, dateOfBuy, whoIsOwner, numberOfSongs, duration);
        }
    }


    public static void main(String[] args) {
        CompactDisc disc = new CompactDisc();
        var scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Hello to compact music disc creator");
            getInformationFromUser(disc,"disc name", Fields.DiscName);
            getInformationFromUser(disc, "author name", Fields.AuthorName);
            getInformationFromUser(disc, "compositor name", Fields.CompositorName);
            getInformationFromUser(disc, "disk's owner", Fields.Owner);
            getInformationFromUser(disc, "favourite song", Fields.FavouriteSong);
            getInformationFromUser(disc, "date of buy in format \"dd-mm-20yy\"", Fields.Date);
            getInformationFromUser(disc, "number of songs", Fields.NumberOfSongs);
            getInformationFromUser(disc, "duration of playing", Fields.Duration);
            System.out.println(disc);
            System.out.println("To exit enter 'q': ");
            var answer = scanner.nextLine();
            if (answer.equals("q"))
                break;
        }
    }

    private static void getInformationFromUser(ICompactDisc disc, String message, Fields field) {
        var scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.printf("Enter a %s: ", message);
                var answer = scanner.nextLine();
                switch (field) {
                    case DiscName -> disc.setDiscName(answer);
                    case AuthorName -> disc.setAuthor(answer);
                    case CompositorName -> disc.setCompositor(answer);
                    case FavouriteSong -> disc.setFavouriteSong(answer);
                    case Owner -> disc.setWhoIsOwner(answer);
                    case Date -> disc.setDateOfBuy(answer);
                    case Duration -> disc.setDuration(Double.parseDouble(answer));
                    case NumberOfSongs -> disc.setNumberOfSongs(Integer.parseInt(answer));
                }
            } catch (Exception e) {
                System.out.println("Some thing went wrong, try again ");
                continue;
            }
            break;
        }
    }
}

