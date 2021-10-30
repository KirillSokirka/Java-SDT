public class Task25  {
    public static void Execute() {
        var store = new Store();
        store.addItem(1, new Article("Item1", 20.0f));
        store.addItem(2, new Article("Item7", 13f));
        store.addItem(3, new Article("Item3", 45f));
        store.addItem(4, new Article("Item2", 34f));
        store.addItem(5, new Article("Item4", 90f));
        store.addItem(6, new Article("Item10", 100f));
        System.out.println(store.getItem(6));
        store.show();
    }
}
