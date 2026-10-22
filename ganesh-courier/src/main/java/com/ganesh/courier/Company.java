package com.ganesh.courier;
import jakarta.persistence.*;
@Entity
public class Company {
  @Id public Long id;       // always 1 (one company row)
  public String name, address, phone, gstin, upi, jur;
}
