package brigid;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
@Transactional
public interface VoistlejaHaldur extends CrudRepository<Voistleja, String> {
}
