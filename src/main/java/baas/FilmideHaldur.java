package t06veebirakendus2;

import java.util.*;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface FilmideHaldur extends CrudRepository<Filmid, String> {
	public List<Filmid> findAllByOrderByRahaDesc();
	public List<Filmid> findByRahaGreaterThan(int kogus);
}