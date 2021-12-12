package Task36;

import java.util.Objects;

public class DateWithTime extends Date {
    /** a field for date's hours */
    private int hours;
    /** a field for date's minutes */
    private int minutes;

    /** setter for field year
     * @param day a new value for a field day
     * @throws IndexOutOfBoundsException when day is illegal
     */
    @Override
    public void setDay(int day) {
        super.setDay(day);
    }

    /** getter for field day
     * @return a value of field day
     */
    @Override
    public int getDay() {
        return super.getDay();
    }

    /** setter for field month
     * @param month a new value for a field month
     * @throws IndexOutOfBoundsException when param is illegal
     */
    @Override
    public void setMonth(int month) {
        super.setMonth(month);
    }

    /** getter for field month
     * @return a value of field month
     */
    @Override
    public int getMonth() {
        return super.getMonth();
    }

    /** getter for field year
     * @return a value of field year
     */
    @Override
    public int getYear() {return super.getYear(); }

    /** setter for field year
     * @param year a new value for a field year
     * @throws IndexOutOfBoundsException when day is illegal
     */
    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    /** getter for field minutes
     * @return a value of field hours
     */
    public int getHours() {
        return hours;
    }

    /** setter for field hours
     * @param hours a new value for a field hours
     * @throws IndexOutOfBoundsException when day is illegal
     */
    public void setHours(int hours) {
        if (hours < 0 || hours > 23)
            throw new IndexOutOfBoundsException();
        this.hours = hours;
    }

    /** getter for field minutes
     * @return a value of field minutes
     */
    public int getMinutes() {
        return minutes;
    }

    /** setter for field minutes
     * @param minutes a new value for a field minutes
     * @throws IndexOutOfBoundsException when day is illegal
     */
    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes >= 59)
            throw new IndexOutOfBoundsException();
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return "DateWithTime{" +
                "\n\thours=" + hours +
                "\n\tminutes=" + minutes +
                "\n\tday=" + super.getDay() +
                "\n\tmonth=" + super.getMonth() +
                "\n\tyear=" + super.getYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DateWithTime that = (DateWithTime) o;
        return hours == that.hours && minutes == that.minutes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hours, minutes);
    }
}
