package baas;
import java.util.*;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
@Transactional

public interface kasutajahaldur extends CrudRepository<kasutaja, String>{
  public List<kasutaja> findByNimiLike(String algus);
  public List<kasutaja> findByLaenGreaterThan(float kogus);
}
