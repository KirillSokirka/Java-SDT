public class AdressValue {
    private String _city;
    private String _street;
    private Integer _house;
    private Integer _flat;

    public void set_city(String _city) {
        this._city = _city;
    }

    public void set_flat(Integer _flat) {
        if (_flat < 0) {
            throw new IllegalArgumentException();
        }
        this._flat = _flat;
    }

    public void set_house(Integer _house) {
        this._house = _house;
    }

    public void set_street(String _street) {
        this._street = _street;
    }

    public Integer get_flat() {
        return _flat;
    }

    public String get_city() {
        return _city;
    }

    public String get_street() {
        return _street;
    }

    public Integer get_house() {
        return _house;
    }

    AdressValue(String city, String street,Integer house, Integer flat) {
        set_city(city);
        set_street(street);
        set_house(house);
        set_flat(flat);
    }

    @Override
    public String toString() {
        return "AdressValue {" +
                "\n\tcity='" + _city + '\'' +
                "\n\tstreet='" + _street + '\'' +
                "\n\thouse=" + _house +
                "\n\tflat=" + _flat +
                '}';
    }
}
