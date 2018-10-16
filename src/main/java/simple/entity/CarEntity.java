package simple.entity;

import lombok.Data;

@Data
public class CarEntity {

    private String name;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public CarEntity duplicate(final CarEntity entity) {
        CarEntity instance = new CarEntity();
        instance.setName(name);
        instance.setYear(year);
        return entity;
    }
}
