package tolan.me.sna.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tolan.me.sna.dao.MedicalRecordRepository;
import tolan.me.sna.models.MedicalRecord;


@Service
public class MedicalRecordService {

  @Autowired
  MedicalRecordRepository medicalRecordRepo;

  public void createMedicalRecord(MedicalRecord medicalRecord) throws Exception {
    List<MedicalRecord> allMedicalRecord = (List<MedicalRecord>) medicalRecordRepo.findAll();
    if (allMedicalRecord.contains(medicalRecord)){
      throw new Exception("The medicalRecord is already registered");
    } else {
      medicalRecordRepo.save(medicalRecord);
    }
  }
}
