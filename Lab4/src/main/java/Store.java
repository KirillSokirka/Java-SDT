import java.util.HashMap;
import java.util.Map;

public class Store {
    private final Map<Integer, Article> _store;
    public Map<Integer, Article> get_store() {
        return _store;
    }

    Store() {
        _store = new HashMap<Integer, Article>();
    }

    Store(Map<Integer, Article> store) {
        _store = store;
    }

    Store(Integer key, Article article) {
        _store = new HashMap<Integer, Article>();
        _store.put(key, article);
    }

    public void addItem(Integer key, Article article) {
        _store.put(key, article);
    }

    public Article getItem(Integer key) {
        return _store.get(key);
    }

    public void updateItem(Integer key, Article updatedItem) {
        if (_store.containsKey(key))
            _store.replace(key, updatedItem);
        else
            _store.put(key, updatedItem);
    }

    public void deleteItem(Integer key) {
        _store.remove(key);
    }

    public void show() {
        System.out.println("Products: ");
        for (var item : _store.entrySet()) {
            System.out.printf("Id = %s | Product = \t%s\n", item.getKey(), item.getValue());
        }
    }
}
