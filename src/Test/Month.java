package Test;

public class Month {
    String month;
    Month(){
    }

    public String getMonth() {
        return month;
    }

    public Month setMonth(String month) {
        this.month = month;
        return this;
    }

    @Override
    public String toString() {
        return month;
    }
}
