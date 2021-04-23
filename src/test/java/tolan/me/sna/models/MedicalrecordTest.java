package tolan.me.sna.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import tolan.me.sna.dao.AllergyRepository;
import tolan.me.sna.dao.MedicalRecordRepository;
import tolan.me.sna.dao.MedicationRepository;

@SpringBootTest
class MedicalrecordTest {

  @Autowired
  MedicalRecordRepository recordRepository;

  @Autowired
  AllergyRepository allergyRepository;

  @Autowired
  MedicationRepository medicationRepository;

  @Test
  public void testCreateMedicalRecord() {
    Medicalrecord medicalRecord = new Medicalrecord();
    medicalRecord.setFirstName("Toot");
    medicalRecord.setLastName("Goth");
    medicalRecord.setBirthdate(new Date());

    Medication medication = new Medication();
    medication.setDrugName("aspirin");
    medication.setDosage(":800g");

    Medication medication2 = new Medication();
    medication2.setDrugName("aspirin2");
    medication2.setDosage(":800g2");

    Allergy allergy = new Allergy();
    allergy.setAllergyName("asthm");

    Allergy allergy2 = new Allergy();
    allergy2.setAllergyName("polen");

    ArrayList<Allergy> allergyArrayList = new ArrayList<>();
    allergyArrayList.add(allergy);
    allergyArrayList.add(allergy2);
    medicalRecord.setAllergies(allergyArrayList);

    ArrayList<Medication> medicationArrayList = new ArrayList<>();
    medicationArrayList.add(medication);
    medicationArrayList.add(medication2);
    medicalRecord.setMedications(medicationArrayList);

    recordRepository.save(medicalRecord);
  }

  @Test
  public void createAllergy() {
    Allergy allergy = new Allergy();
    allergy.setAllergyName("al1");
    allergyRepository.save(allergy);
  }

  @Test
  public void createMedication() {
    Medication medication = new Medication();
    medication.setDrugName("aspirin");
    medication.setDosage(":800g");
    medicationRepository.save(medication);
  }

}












