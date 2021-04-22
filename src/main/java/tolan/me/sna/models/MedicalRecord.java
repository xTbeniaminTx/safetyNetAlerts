package tolan.me.sna.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class MedicalRecord {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long medicalRecordId;

  private String firstName;
  private String lastName;
  private LocalDate birthdate;

  @ManyToMany
  private List<Medication> medications = new ArrayList<>();

  @ManyToMany
  private List<Allergy> allergies = new ArrayList<>();

  public MedicalRecord() {
  }

  public MedicalRecord(long medicalRecordId, String firstName, String lastName,
      LocalDate birthdate, List<Medication> medications,
      List<Allergy> allergies) {
    this.medicalRecordId = medicalRecordId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthdate = birthdate;
    this.medications = medications;
    this.allergies = allergies;
  }

  public long getMedicalRecordId() {
    return medicalRecordId;
  }

  public void setMedicalRecordId(long medicalRecordId) {
    this.medicalRecordId = medicalRecordId;
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

  public List<Medication> getMedications() {
    return medications;
  }

  public void setMedications(List<Medication> medications) {
    this.medications = medications;
  }

  public List<Allergy> getAllergies() {
    return allergies;
  }

  public void setAllergies(List<Allergy> allergies) {
    this.allergies = allergies;
  }
}
