import java.util.HashMap;

public class Task10 {
    public static void Execute() {
        var images = new HashMap<String, String>();
        images.put("Sun", "sum.png");
        images.put("Wolf", "wolf.png");
        images.put("Rabbit", "rabbit.png");
        images.put("Rabbit", "rabbit.png");
        images.put("Tree", "tree.png");
        images.put("KPI", "kpi.png");
        var storage = new StorageOfImages(images);
        System.out.println("Initial names:");
        var listOfNames = storage.GetNames();
        for (var item: listOfNames) {
            System.out.println(item);
        }
        if (storage.DeleteImage("Rabbit")) {
            System.out.println("Deletion was successful!");
        }
        System.out.println("Values after deleting a Rabbit:");
        var resultImages = storage.GetImages();
        for (var item : resultImages.entrySet()) {
            System.out.printf("Name = %s, File = %s\n", item.getKey(), item.getValue());
        }
        System.out.printf("Image of KPI = %s", storage.FindImage("KPI"));
    }
}
