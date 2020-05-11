package Test;

public class Today {
        String day;
        Today(){

        }

        public String getDay() {
            return day;
        }

        public Today setDay(String day) {
            this.day = day;
            return this;
        }

    @Override
    public String toString() {
        return day ;
    }
}
