public class Abonent {
    private String _name = "";
    private String _surname = "";
    private String _byFather = "";
    private String _adress = "";

    Abonent(String name, String surname, String byFather, String adress) {
        _name = name;
        _adress = adress;
        _surname = surname;
        _byFather = byFather;
    }

    String get_name() { return _name; }
    String get_surname() { return _surname; }
    String get_byFather() { return _byFather; }
    String get_adress() {return _adress; }
}
