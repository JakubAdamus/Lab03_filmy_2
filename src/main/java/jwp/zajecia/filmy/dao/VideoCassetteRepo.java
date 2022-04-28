package jwp.zajecia.filmy.dao;

import jwp.zajecia.filmy.dao.entity.VideoCassete;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoCassetteRepo extends CrudRepository<VideoCassete,Long> {

}
