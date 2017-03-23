package edgar;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
@Transactional
public interface CarsManager extends CrudRepository<Cars, String> {

}