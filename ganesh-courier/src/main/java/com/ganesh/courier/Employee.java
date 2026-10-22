package com.ganesh.courier;
import jakarta.persistence.*;
@Entity
public class Employee {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY) public Long id;
  @Column(unique = true) public String username;
  public String password;   // e.g. {noop}1234 or a {bcrypt}... hash
  public String name;
  public String mobile;
}
