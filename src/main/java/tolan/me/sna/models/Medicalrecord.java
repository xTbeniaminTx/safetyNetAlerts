package tolan.me.sna.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Medicalrecord {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String firstName;
  private String lastName;

  @Temporal(TemporalType.DATE)
  private Date birthdate;

  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(name = "medicalrecords_medications",
      joinColumns = @JoinColumn(name = "medical_record_id", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "medication_id", referencedColumnName = "id"))
  private List<Medication> medications;


  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(name = "medicalrecords_allergies",
      joinColumns = @JoinColumn(name = "medical_record_id", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "allergy_id", referencedColumnName = "id"))
  private List<Allergy> allergies;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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
