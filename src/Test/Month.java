package Test;

public class Month {
    String month;
    Month(){
        System.out.println("Hello from Month");
    }

    public String getMonth() {
        return month;
    }

    public Month setMonth(String month) {
        this.month = month;
        return this;
    }
}
