package tatjkuz;
import javax.persistence.*;

@Entity
@Table(name="varvid")
public class Varvid {

		@Id
		public String nimi;
		public String hexkood;
}

