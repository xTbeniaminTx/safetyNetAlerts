package tolan.me.sna.models;

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

@Entity
public class Medication {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String drugName;
  private String dosage;

  @ManyToMany(mappedBy = "medications")
  private List<Medicalrecord> medicalrecords;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getDrugName() {
    return drugName;
  }

  public void setDrugName(String drugName) {
    this.drugName = drugName;
  }

  public String getDosage() {
    return dosage;
  }

  public void setDosage(String dosage) {
    this.dosage = dosage;
  }

  public List<Medicalrecord> getMedicalrecords() {
    return medicalrecords;
  }

  public void setMedicalrecords(List<Medicalrecord> medicalrecords) {
    this.medicalrecords = medicalrecords;
  }
}
