package Lab2;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Jane on 31.05.2017.
 * java
 */
public class Detail {
    private String name;
    private String brand;
    private String country;
    private String description;
    private Calendar date;
    private long TimeAfterCreation;

    Detail(String name, String brand, String country, String description, int year, int month, int day){
        this.name = name;
        this.brand = brand;
        this.country = country;
        this.description = description;
        this.date = this.fillDate(year,month,day);
        this.TimeAfterCreation = this.fillPeriod(this.date);
    }

    private long fillPeriod(Calendar date){
        long end = Calendar.getInstance().getTimeInMillis();
        long start = date.getTimeInMillis();
        return TimeUnit.MILLISECONDS.toDays(Math.abs(end - start));
    }

    private Calendar fillDate(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        return cal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Calendar getDate() {
        return date;
    }

    public long getTimeAfterCreation() {
        return TimeAfterCreation;
    }

}
