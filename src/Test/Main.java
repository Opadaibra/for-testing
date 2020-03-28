package Test;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Today().setDay("Sunday").getDay());
        System.out.println(new Month().setMonth("August").getMonth());
        System.out.println(new Year().setYear("1999").getYear());
    }
}
