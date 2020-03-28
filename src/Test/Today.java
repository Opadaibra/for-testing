package Test;

public class Today {
        String day;
        Today(){
            System.out.println("Hello from Today");
        }

        public String getDay() {
            return day;
        }

        public Today setDay(String day) {
            this.day = day;
            return this;
        }

}
