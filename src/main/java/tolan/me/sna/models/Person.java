package tolan.me.sna.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String firstName;
  private String lastName;
  private String address;
  private String city;
  private int zip;
  private String phone;
  private String email;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinTable(name = "person_medicalrecord",
      joinColumns =
          { @JoinColumn(name = "person_id", referencedColumnName = "id") },
      inverseJoinColumns =
          { @JoinColumn(name = "md_id", referencedColumnName = "id") })
  private Medicalrecord medicalrecord;

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

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getZip() {
    return zip;
  }

  public void setZip(int zip) {
    this.zip = zip;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Medicalrecord getMedicalrecord() {
    return medicalrecord;
  }

  public void setMedicalrecord(Medicalrecord medicalrecord) {
    this.medicalrecord = medicalrecord;
  }

  @Override
  public String toString() {
    return "Person{" +
        "id=" + id +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", address='" + address + '\'' +
        ", city='" + city + '\'' +
        ", zip=" + zip +
        ", phone='" + phone + '\'' +
        ", email='" + email + '\'' +
        ", medicalrecord=" + medicalrecord +
        '}';
  }
}
