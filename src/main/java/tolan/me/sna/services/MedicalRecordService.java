package tolan.me.sna.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tolan.me.sna.dao.MedicalRecordRepository;
import tolan.me.sna.models.Medicalrecord;


@Service
public class MedicalRecordService {

  @Autowired
  MedicalRecordRepository medicalRecordRepo;

  public void createMedicalRecord(Medicalrecord medicalRecord) throws Exception {
    List<Medicalrecord> allMedicalrecord = (List<Medicalrecord>) medicalRecordRepo.findAll();
    if (allMedicalrecord.contains(medicalRecord)){
      throw new Exception("The medicalRecord is already registered");
    } else {
      medicalRecordRepo.save(medicalRecord);
    }
  }
}
