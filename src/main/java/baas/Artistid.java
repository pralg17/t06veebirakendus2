package baas;

import javax.persistence.*;

@Entity
@Table(name="artistid_andmed")
public class Artistid{
	@Id
	public int artistinimi;
	public String stiil;
	public String synnikoht;
	public int synniaasta;
	public int tegev;
}