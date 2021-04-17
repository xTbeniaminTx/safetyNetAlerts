package tolan.me.sna.models;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MedicalRecord {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long medicalRecordId;

  private String firstName;
  private String lastName;
  private LocalDate birthdate;
//  private List<Medication> medications;
//  private String[] allergies;

}
