package brigid;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tulemused")
public class Voistleja{
  @Id
  public String nimi;
  public int pallivisketulemus;
}
