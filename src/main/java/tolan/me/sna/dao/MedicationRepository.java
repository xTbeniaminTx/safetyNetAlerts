package tolan.me.sna.dao;

import org.springframework.data.repository.CrudRepository;
import tolan.me.sna.models.Medication;

public interface MedicationRepository extends CrudRepository<Medication, Long> {

}
