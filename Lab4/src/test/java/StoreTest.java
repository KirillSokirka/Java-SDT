import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    private static Store store;

    @BeforeEach
    void setStore() {
        store = new Store(new HashMap<Integer, Article>());
    }

    @Test
    void get_store() {
        assertEquals(new HashMap<Integer, Article>(), store.get_store());
    }

    @Test
    void addItem() {
        var art = new Article("item", 1f);

        store.addItem(1, art);

        long count = 0L;
        for (Map.Entry<Integer, Article> integerArticleEntry : store.get_store().entrySet()) {
            count++;
        }
        assertEquals(1, count);
        assertEquals("item", store.get_store().get(1).get_name());
    }

    @Test
    void getItem() {
        var art = new Article("item", 1f);

        store.addItem(2, art);

        assertEquals(art, store.getItem(2));
    }

    @Test
    void updateItem() {
        var art = new Article("item2", 1f);
        
        store.updateItem(2, art);

        assertEquals(art, store.getItem(2));
    }

    @Test
    void deleteItem() {

        store.addItem(1, new Article("item", 1f));
        store.deleteItem(1);
        assertEquals(0, store.get_store().entrySet().stream().count());
    }
}