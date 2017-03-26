package baas;

import javax.persistence.*;

@Entity
@Table(name="ained")
public class Ained{
  @Id
  public String aine;
  public int eap;
  @ManyToOne
  @JoinColumn(name="nimi")
  public Opilased deklareerija;
}
