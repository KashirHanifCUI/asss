public class Date {
    private int date;
    private int month;
    private int year;

    public Date(int date,int month, int year){
        this.month = month;
        this.date = date;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString(){
        String res = String.format("\t%d-%d-%d", date,month,year);
        return res;
    }
}
