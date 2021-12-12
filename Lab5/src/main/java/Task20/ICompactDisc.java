package Task20;

import java.text.ParseException;
import java.util.Date;

public interface ICompactDisc {
    String getAuthor();

    void setAuthor(String author);

    String getCompositor();

    void setCompositor(String compositor);

    String getDiscName();

    void setDiscName(String discName);

    String getFavouriteSong();

    void setFavouriteSong(String favouriteSong);

    Date getDateOfBuy();

    void setDateOfBuy(String dateOfBuy) throws ParseException;

    String getWhoIsOwner();

    void setWhoIsOwner(String whoIsOwner);

    int getNumberOfSongs();

    void setNumberOfSongs(int numberOfSongs);

    double getDuration();

    void setDuration(double duration);
}
