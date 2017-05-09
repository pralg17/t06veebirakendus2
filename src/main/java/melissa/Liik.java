package melissa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="liigid")
public class Liik{
  @Id
  public String liik;
  public int nähtikorda;
}