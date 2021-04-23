package tolan.me.sna.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FireStation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long fireStationId;

  private String address;
  private int station;

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
