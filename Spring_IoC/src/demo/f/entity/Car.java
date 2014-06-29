package demo.f.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Administrator on 14-6-29.
 */
@Entity
public class Car implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String brand;
    private String color;

    public Car() {
    }

    public Car(Integer id, String brand, String color) {

        this.id = id;
        this.brand = brand;
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
