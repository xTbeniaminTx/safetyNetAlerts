package tolan.me.sna.dao;

import org.springframework.data.repository.CrudRepository;
import tolan.me.sna.models.MedicalRecord;

public interface MedicalRecordRepository extends CrudRepository<MedicalRecord, Long> {

}
