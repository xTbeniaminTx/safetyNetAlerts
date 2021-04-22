package tolan.me.sna.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class MedicalRecord {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long medicalRecordId;

  private String firstName;
  private String lastName;

  @Temporal(TemporalType.DATE)
  private Date birthdate;

  @ManyToMany
  private List<Medication> medications = new ArrayList<>();

  @ManyToMany
  private List<Allergy> allergies = new ArrayList<>();

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

  public Date getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(Date birthdate) {
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
