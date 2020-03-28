package Test;

public class Year {
    private String Year;

    Year() {
        System.out.println("Hello from year");
    }

    public String getYear() {
        return Year;
    }

    public Year setYear(String year) {
        Year = year;
        return this;
    }
}
