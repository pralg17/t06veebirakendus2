package baas;

import javax.persistence.*;

@Entity
@Table(name="kiirendused")

public class Kiirendus{
  @Id
  @GeneratedValue
  public int id;
  public Float aeg;
  @ManyToOne
  @JoinColumn(name="juht")
  public Kasutaja soitja;

}
