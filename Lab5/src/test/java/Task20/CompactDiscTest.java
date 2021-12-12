package Task20;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class CompactDiscTest {

    @Test
    void setAuthor_WhenArgumentIsIllegal_ThrowsIllegalArgumentEx() {
        var disc = new CompactDisc();
        assertThrows(IllegalArgumentException.class, () -> disc.setAuthor(" "));
    }

    @Test
    void setCompositor_WhenArgumentIsIllegal_ThrowsIllegalArgumentEx() {
        var disc = new CompactDisc();
        assertThrows(IllegalArgumentException.class, () -> disc.setCompositor(" "));
    }

    @Test
    void setDiscName_WhenArgumentIsIllegal_ThrowsIllegalArgumentEx() {
        var disc = new CompactDisc();
        assertThrows(IllegalArgumentException.class, () -> disc.setDiscName(" "));
    }

    @Test
    void setFavouriteSong_WhenArgumentIsIllegal_ThrowsIllegalArgumentEx() {
        var disc = new CompactDisc();
        assertThrows(IllegalArgumentException.class, () -> disc.setFavouriteSong(" "));
    }

    @Test
    void setDateOfBuy_WhenArgumentIsIllegal_ThrowsIllegalArgumentEx() {
        var disc = new CompactDisc();
        assertThrows(IllegalArgumentException.class, () -> disc.setDateOfBuy("efrefre"));
    }

    @Test
    void setWhoIsOwner_WhenArgumentIsIllegal_ThrowsIllegalArgumentEx() {
        var disc = new CompactDisc();
        assertThrows(IllegalArgumentException.class, () -> disc.setWhoIsOwner("   "));
    }

    @Test
    void setNumberOfSongs_WhenArgumentIsIllegal_ThrowsIllegalArgumentEx() {
        var disc = new CompactDisc();
        assertThrows(IllegalArgumentException.class, () -> disc.setNumberOfSongs(-2304));
    }

    @Test
    void setDuration_WhenArgumentIsIllegal_ThrowsIllegalArgumentEx() {
        var disc = new CompactDisc();
        assertThrows(IllegalArgumentException.class, () -> disc.setDuration(0));
    }
}