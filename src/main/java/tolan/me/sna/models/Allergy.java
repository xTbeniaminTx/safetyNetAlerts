package tolan.me.sna.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Allergy {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long allergyId;

  private String allergyName;

  public String getAllergyName() {
    return allergyName;
  }

  public void setAllergyName(String allergyName) {
    this.allergyName = allergyName;
  }

}
