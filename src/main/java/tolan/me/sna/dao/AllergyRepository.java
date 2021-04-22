package tolan.me.sna.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tolan.me.sna.models.Allergy;

@Repository
public interface AllergyRepository extends CrudRepository<Allergy, Long> {

}
