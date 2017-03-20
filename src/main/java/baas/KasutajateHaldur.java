package baas;
import java.util.*;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
@Transactional
public interface KasutajateHaldur extends CrudRepository<Kasutaja, String> {
  public List<Kasutaja> findAllByOrderByVoimsusDesc();
  public List<Kasutaja> findTop2ByOrderByVoimsusDesc();
  public List<Kasutaja> findByOmanikLike(String algus);
  public List<Kasutaja> findByVoimsusGreaterThan(int kogus);
}
