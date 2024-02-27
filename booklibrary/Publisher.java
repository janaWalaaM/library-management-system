package booklibrary;

public class Publisher {
    private String name;
    private int day;
    private String month;
    private int year;

    public Publisher() {
    }
    public Publisher(String name, int day, String month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Publisher{" + "name=" + name + ", day=" + day + ", month=" + month + ", year=" + year + '}';
    }
    
    
}
