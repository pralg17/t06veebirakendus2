package baas;

import java.util.*;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
@Transactional

public interface ArtistiHaldur extends CrudRepository<Artistid, String>{
	public List<Artistid> findAllByOrderBySynniaastaDesc();

}