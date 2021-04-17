package pasha.edu;

/*
@USER: Java02
@DATE: 17.04.2021
@NAME: PartTimeEmployer
*/
public class PartTimeEmployer {
    private String name;
    private String rate;
    private Integer hours;

    public PartTimeEmployer() {
    }

    public PartTimeEmployer(String name, String rate, Integer hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "PartTimeEmployer{" +
                "name='" + name + '\'' +
                ", rate='" + rate + '\'' +
                ", hours=" + hours +
                '}';
    }
}
