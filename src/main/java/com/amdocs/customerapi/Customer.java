package com.amdocs.customerapi;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Customer {

  private @Id @GeneratedValue Long id;
  private String firstName;
  private String lastName;
  private boolean vipCustomer;
  private Double rewards;
  private String email;
  private int phoneNumber;

  Customer() {}

  Customer(String firstName, String lastName, boolean vipCustomer, Double rewards, String email, int phoneNumber) {

    this.firstName = firstName;
    this.lastName = lastName;
    this.vipCustomer = vipCustomer;
    this.rewards = rewards;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public Long getId() {
    return this.id;
  }

  public String getfirstName() {
    return this.firstName;
  }

  public String getlastName() {
    return this.lastName;
  }

  public boolean getvipCustomer() {
    return this.vipCustomer;
  }

  public Double getrewards() {
    return this.rewards;
  }

  public String getemail() {
    return this.email;
  }

  public int getphoneNumber() {
    return this.phoneNumber;
  }


  public void setId(Long id) {
    this.id = id;
  }

  public void setfirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setlastName(String lastName) {
    this.lastName = lastName;
  }

  public void setvipCustomer(Boolean vipCustomer) {
    this.vipCustomer = vipCustomer;
  }

  public void setrewards(Double rewards) {
    this.rewards = rewards;
  }

  public void setemail(String email) {
    this.email = email;
  }

  public void setphoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Customer))
      return false;
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) && Objects.equals(this.firstName, customer.firstName)
        && Objects.equals(this.lastName, customer.lastName) && Objects.equals(this.vipCustomer, customer.vipCustomer) && Objects.equals(this.rewards, customer.rewards) && Objects.equals(this.email, customer.email) && Objects.equals(this.phoneNumber, customer.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.firstName, this.lastName, this.vipCustomer, this.rewards, this.email, this.phoneNumber);
  }

  @Override
  public String toString() {
    return "Customer{" + "id=" + this.id + ", firstName='" + this.firstName + '\'' + ", lastName='" + this.lastName + '\'' + ", vipCustomer='" + this.vipCustomer + '\'' + ", rewards='" + this.rewards + '\'' + ", email='" + this.email + '\'' + ", phoneNumber='" + this.phoneNumber + '\'' + '}';
  }
}