package edgar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@SpringBootApplication
public class Rakendus {
	@Autowired
	private CarsManager carsManager;

	@RequestMapping("/find")
    public String find(String car_name) {
		if(car_name == null){
			return "Such name is not recorded in database, try again.";
		}
        Cars isik=carsManager.findOne(car_name);
		if(isik == null){
			return "The car you requested does not exist";
		}
		return "Car name: " + car_name + "</br>Horse power: " + isik.horse_power + "</br>Car's model: " + isik.car_model + "</br>Year: " + isik.year;
    }
	
	@RequestMapping("/showAll")
	public String all(){
		
		String show_allCars = "";
		int index = 0;
		
		for(Cars isik : carsManager.findAll()){
			index += 1;
			show_allCars = show_allCars + index + "  " + "    " + isik.car_name + "    " + isik.car_model + "    " + isik.horse_power;
			show_allCars += "</br>";
		}
		
		return show_allCars;
		
	}
	
    public static void main(String[] args) {
		System.getProperties().put("server.port", 42222);
        SpringApplication.run(Rakendus.class);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar