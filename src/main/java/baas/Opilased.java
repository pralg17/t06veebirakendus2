package baas;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="opilased")
public class Opilased{
  @Id
  public String nimi;
  public String martiklinumber;
  @OneToMany(mappedBy="deklareerija")
  Set<Ained> ained;
}
