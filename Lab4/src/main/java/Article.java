public class Article {
    private String _name;

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    private Float _price;

    public Float get_price() {
        return _price;
    }

    public void set_price(Float _price) {
        if (_price < 0)
            throw new IllegalArgumentException();
        this._price = _price;
    }

    Article (String name, Float price) {
        set_name(name);
        set_price(price);
    }

    @Override
    public String toString() {
        return "Article { " +
                "name = '" + _name + '\'' +
                ", price = " + _price +
                " } ";
    }
}
