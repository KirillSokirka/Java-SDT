import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class StorageOfImages {

    Map<String, String> _listOfImages;
    SortedSet<String> _listOfNames = new TreeSet<String>();

    StorageOfImages(Map<String, String> listOfImages) {
        _listOfNames.addAll(listOfImages.keySet());
        _listOfImages = listOfImages;
    }

    public Map<String, String> GetImages() {
        return _listOfImages;
    }

    public SortedSet<String> GetNames() {
        return _listOfNames;
    }

    public boolean AddImage(String name, String image) {
        if (_listOfNames.contains(name)) {
            return false;
        }
        _listOfNames.add(name);
        _listOfImages.put(name, image);
        return true;
    }

    public boolean DeleteImage(String name) {
        if (!_listOfNames.contains(name)) {
            return false;
        }
        _listOfNames.remove(name);
        _listOfImages.remove(name);
        return true;
    }

    public String FindImage(String name) {
        return _listOfNames.contains(name) ? (String) _listOfImages.get(name) : null;
    }
}
