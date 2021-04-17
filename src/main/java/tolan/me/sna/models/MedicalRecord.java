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
//  private List<Allergy> allergies;

  public MedicalRecord() {
  }

  public MedicalRecord(String firstName, String lastName, LocalDate birthdate) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthdate = birthdate;
//    this.medications = medications;
//    this.allergies = allergies;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LocalDate getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(LocalDate birthdate) {
    this.birthdate = birthdate;
  }

}
