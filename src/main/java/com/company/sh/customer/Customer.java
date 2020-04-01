package com.company.sh.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;


@Entity
public class Customer {
   @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
   private Long id;
    private String name;
    private String email;
    private String address;

 public Customer() {
 }
 protected Customer(String name, String email, String address) {
  this.name = name;
  this.email = email;
  this.address = address;
 }

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public String getAddress() {
  return address;
 }

 public void setAddress(String address) {
  this.address = address;
 }

 @Override
 public boolean equals(Object o) {
  if (this == o) return true;
  if (!(o instanceof Customer)) return false;
  Customer customer = (Customer) o;
  return Objects.equals(getId(), customer.getId()) &&
          Objects.equals(getName(), customer.getName()) &&
          Objects.equals(getEmail(), customer.getEmail()) &&
          Objects.equals(getAddress(), customer.getAddress());
 }

 @Override
 public int hashCode() {
  return Objects.hash(getId(), getName(), getEmail(), getAddress());
 }

 @Override
 public String toString() {
  return "Customer{" +
          "id=" + id +
          ", name='" + name + '\'' +
          ", email='" + email + '\'' +
          ", address='" + address + '\'' +
          '}';
 }
}
