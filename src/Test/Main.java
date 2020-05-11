package Test;

public class Main {

    public static void main(String[] args) {
        Date date = new Date(new Today(),new Month(),new Year());
        date.setMonth("August");
        date.setToday("Sunday");
        date.setYear("1999");
        System.out.println(date);
        System.out.println(new Today().setDay("Monday").getDay());
        System.out.println(new Month().setMonth("September").getMonth());
        System.out.println(new Year().setYear("2006").getYear());
    }
}
