package t06veebirakendus2;

import javax.persistence.*;

@Entity
@Table(name="naitlejad")
public class Naitleja {
	@Id
	@GeneratedValue
	public int id;
	public int eelarve;
	
	@ManyToOne
	@JoinColumn(name="fnimi")
	public Filmid money;
}