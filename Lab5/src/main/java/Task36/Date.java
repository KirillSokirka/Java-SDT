package Task36;

import java.util.Objects;

/** class that represents date */
public class Date extends GlobalDate {
    /** getter for field day
     * @return a value of field day
     */
    @Override
    public int getDay() {
        return day;
    }

    /** setter for field day
     * @param day a new value for a field day
     * @throws IndexOutOfBoundsException when param is illegal
     */
    @Override
    public void setDay(int day) {
        if (day <= 0 || day >= 31)
            throw new IndexOutOfBoundsException();
        this.day = day;
    }

    /** getter for field month
     * @return a value of field month
     */
    @Override
    public int getMonth() {
        return month;
    }

    /** setter for field month
     * @param month a new value for a field month
     * @throws IndexOutOfBoundsException when param is illegal
     */
    @Override
    public void setMonth(int month) {
        if (month <= 0 || month > 12)
            throw new IndexOutOfBoundsException();
        this.month = month;
    }

    /** getter for field year
     * @return a value of field year
     */
    @Override
    public int getYear() {
        return year;
    }

    /** setter for field year
     * @param year a new value for a field day
     * @throws IndexOutOfBoundsException when day is illegal
     */
    @Override
    public void setYear(int year) {
        if (year < 2000 || year > 2050)
            throw new IndexOutOfBoundsException();
        this.year = year;
    }

    @Override
    protected void setMinutes(int value) { }

    @Override
    protected int getMinutes() { return 0; }

    @Override
    protected void setHours(int value) { }

    @Override
    protected int getHours() { return 0; }

    @Override
    public String toString() {
        return "Date{" +
                "\n\tday=" + day +
                "\n\tmonth=" + month +
                "\n\tyear=" + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return day == date.day && month == date.month && year == date.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    /** a field for a date's day */
    private int day;
    /** a field for a date's month */
    private int month;
    /** a field for a date's year */
    private int year;

}
