package simple.entity;

import lombok.Data;


@Data
public class CarEntity {
    private String name;
    private int year;
    
    public CarEntity duplicate(final CarEntity entity) {
        CarEntity instance = new CarEntity();
        instance.setName(name);
        instance.setYear(year);
        return entity;
    }
}
