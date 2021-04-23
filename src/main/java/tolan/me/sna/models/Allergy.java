package tolan.me.sna.models;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Allergy {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String allergyName;

  @ManyToMany(mappedBy = "allergies")
  private List<Medicalrecord> medicalrecords;


  public String getAllergyName() {
    return allergyName;
  }

  public void setAllergyName(String allergyName) {
    this.allergyName = allergyName;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public List<Medicalrecord> getMedicalrecords() {
    return medicalrecords;
  }

  public void setMedicalrecords(List<Medicalrecord> medicalrecords) {
    this.medicalrecords = medicalrecords;
  }
}
