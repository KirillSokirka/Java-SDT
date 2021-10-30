import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

class StorageOfImagesTest {

    static StorageOfImages storage = null;
    static Map<String, String> images = null;
    static SortedSet<String> names = null;

    @BeforeAll
    public static void setValues() {
        images = new HashMap<String, String>();
        images.put("Sun", "sum.png");
        images.put("Wolf", "wolf.png");
        images.put("Rabbit", "rabbit.png");
        images.put("Tree", "tree.png");
        names = new TreeSet<String>();
        names.addAll(images.keySet());
        storage = new StorageOfImages(images);
    }

    @Test
    void constructorTest() {
        var resultedImages = storage.GetImages();
        var resultedNames = storage.GetNames();

        assertIterableEquals(names, resultedNames);
        assertIterableEquals(images.entrySet(), resultedImages.entrySet());
    }

    @Test
    void addImageTest() {
        names.add("Test");
        images.put("Test", "text.png");

        var result = storage.AddImage("Test", "test.png");

        assertTrue(result);
        assertIterableEquals(names, storage.GetNames());
        assertIterableEquals(images.entrySet(), storage.GetImages().entrySet());
    }

    @Test
    void deleteImageTest() {
        names.remove("Test");
        images.remove("Test");

        var result = storage.DeleteImage("Test");

        assertTrue(result);
        assertIterableEquals(names, storage.GetNames());
        assertIterableEquals(images.entrySet(), storage.GetImages().entrySet());
    }

    @Test
    void findImageTest() {
        assertNull(storage.FindImage("KPI"));
    }
}