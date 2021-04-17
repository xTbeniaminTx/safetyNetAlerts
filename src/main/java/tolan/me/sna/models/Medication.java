package tolan.me.sna.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medication {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long medicationId;

  private String drugName;
  private String dosage;

  public Medication() {
  }

  public Medication(String drugName, String dosage) {
    this.drugName = drugName;
    this.dosage = dosage;
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

  @Override
  public String toString() {
    return "Medication{" +
        "medicationId=" + medicationId +
        ", drugName='" + drugName + '\'' +
        ", dosage='" + dosage + '\'' +
        '}';
  }
}
