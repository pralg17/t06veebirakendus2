package t06veebirakendus2;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="filmid")
public class Filmid{
	@Id
	public String nimi;
	public int aasta;
	public int raha;
	
	@OneToMany(mappedBy="money")
	Set<Naitleja> naitlejad;
}