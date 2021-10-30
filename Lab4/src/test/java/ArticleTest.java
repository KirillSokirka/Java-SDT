import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArticleTest {

    static Article article;

    @BeforeEach
    void setUp() {
        article = new Article("item1", 10f);
    }

    @Test
    void set_name() {
        article.set_name("item");
        assertEquals("item", article.get_name());
    }

    @Test
    void get_name() {
        assertEquals("item1", article.get_name());
    }

    @Test
    void get_price() {
        assertEquals(10f, article.get_price());
    }
    @Test
    void set_price() {
        try {
            article.set_price(-5f);
        } catch (IllegalArgumentException ex) {
            assertTrue(true);
        }
    }

    @Test
    void testToString() {
        assertEquals("Article { " +
                "name = '" + "item1" + '\'' +
                ", price = " + 10f +
                " } ", article.toString());
    }
}