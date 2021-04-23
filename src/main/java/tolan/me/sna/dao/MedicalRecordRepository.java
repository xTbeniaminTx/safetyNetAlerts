package tolan.me.sna.dao;

import org.springframework.data.repository.CrudRepository;
import tolan.me.sna.models.Medicalrecord;

public interface MedicalRecordRepository extends CrudRepository<Medicalrecord, Long> {

}
