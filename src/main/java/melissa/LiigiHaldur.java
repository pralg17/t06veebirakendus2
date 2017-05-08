package melissa;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
@Transactional
public interface LiigiHaldur extends CrudRepository<Liik, String> {
}