package markvalj;
import java.util.concurrent.ThreadLocalRandom;

class v6rrand {
	
	int oun;
	
	double ounuAlles;
	
	
	
	v6rrand() {

		
		oun = 3;
		
	}
	public double arvuta(double x){
		ounuAlles = x - oun;
		if(ounuAlles < 0){
			ounuAlles = 0;	
		}
		return ounuAlles;
	}
	
	
	
}

