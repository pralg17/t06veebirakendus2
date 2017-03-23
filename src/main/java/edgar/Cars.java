package edgar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cars_data")
public class Cars{
  @Id
  public String car_name;
  public String car_model;
  public String horse_power;
  public int year;
}