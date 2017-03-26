package baas;

import java.util.*;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
@Transactional
public interface Opilastehaldur extends CrudRepository<Opilased, String>{
  public List<Opilased> findAll();
  public List<Opilased> findAllByOrderByMartiklinumberAsc();  
}
