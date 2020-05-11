package Test;

public class Date {
    private Today today;
    private Month month;
    private Year year;
    Date(Today t,Month m,Year y) {
        this.today=t;
        this.month=m;
        this.year =y;
    }
    public String toString(){
        return today + "/" + month + "/" +year;
    }

    public void setToday(String today) {
        this.today.setDay(today);
    }

    public void setMonth(String month) {
        this.month.setMonth(month);
    }

    public void setYear(String year) {
        this.year.setYear(year);
    }
}
