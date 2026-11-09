import java.time.LocalDate;

public class HeartRates {

    private String firstName;
    private String lastName;

    private int month;
    private int day;
    private int year;

    public HeartRates(String firstName, String lastName,
                      int month, int day, int year) {

        this.firstName = firstName;
        this.lastName = lastName;

        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public int getAge() {

        LocalDate birthDate =
            LocalDate.of(year, month, day);

        return java.time.Period.between(
            birthDate, LocalDate.now()
        ).getYears();
    }

    public int getMaximumHeartRate() {
        return 220 - getAge();
    }

    public String getTargetHeartRate() {

        int maximum = getMaximumHeartRate();

        int lower = (int) (maximum * 0.50);
        int upper = (int) (maximum * 0.85);

        return lower + " - " + upper + " beats per minute";
    }
}