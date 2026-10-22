package com.ganesh.courier;
import jakarta.persistence.*;
@Entity
public class Consignment {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY) public Long id;
  @Column(unique = true) public Long lrNo;
  public String bookDate, bookTime, createdBy;
  public String fromName, fromPhone, fromGst, fromLine1, fromCity, fromState, fromPin;
  public String toName, toPhone, toGst, toLine1, toCity, toState, toPin;
  public String goods, eway, inv, pay, deliv;
  public int art;
  public double wt, cw, val, fr, ham, dd, oth, gstp, gst, tot;
}
