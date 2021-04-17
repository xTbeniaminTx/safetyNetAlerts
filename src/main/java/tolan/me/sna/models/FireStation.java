package tolan.me.sna.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FireStation {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long fireStationId;

  private String address;
  private int station;

  public FireStation() {
  }

  public FireStation(String address, int station) {
    this.address = address;
    this.station = station;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getStation() {
    return station;
  }

  public void setStation(int station) {
    this.station = station;
  }

  @Override
  public String toString() {
    return "FireStation{" +
        "fireStationId=" + fireStationId +
        ", address='" + address + '\'' +
        ", station=" + station +
        '}';
  }

}
