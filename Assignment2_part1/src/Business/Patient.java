/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


/**
 *
 * @author D diviaruna
 */

public class Patient {


 private int age;
 private VitalSigns vis;

 public int getAge() {
  return age;
 }
 public void setAge(int age) {
  this.age = age;
 }
 public VitalSigns getVis() {
  return vis;
 }
 public void setVis(VitalSigns vis) {
  this.vis = vis;
 }
 boolean isPatientNormal(int age, int respiratoryRate, int heartRate, int bp, double weightKgs, double weightPds) {
  boolean res = false;
  //System.out.println(age +"" + respiratoryRate+"" + heartRate + bp + weightKgs + weightPds);

  if (age == 0) {
   if (respiratoryRate >= 30 && respiratoryRate <= 50 &&
    heartRate >= 120 && heartRate <= 160 &&
    bp >= 50 && bp <= 70 &&
    weightKgs >= 2 && weightKgs <= 3 &&
    weightPds >= 4.5 && weightPds <= 7) {
    res = true;
   }
  }
  if (age > 0 && age <= 1) {
   if (respiratoryRate >= 20 && respiratoryRate <= 30 &&
    heartRate >= 80 && heartRate <= 140 &&
    bp >= 70 && bp <= 100 &&
    weightKgs >= 4 && weightKgs <= 10 &&
    weightPds >= 9 && weightPds <= 22) {
    res = true;
   }
  }
  if (age > 1 && age <= 3) {
   if (respiratoryRate >= 20 && respiratoryRate <= 30 &&
    heartRate >= 80 && heartRate <= 130 &&
    bp >= 80 && bp <= 110 &&
    weightKgs >= 10 && weightKgs <= 14 &&
    weightPds >= 22 && weightPds <= 31) {

    res = true;
   }
  }
  if (age > 3 && age <= 5) {
   if (respiratoryRate >= 20 && respiratoryRate <= 30 &&
    heartRate >= 80 && heartRate <= 120 &&
    bp >= 80 && bp <= 110 &&
    weightKgs >= 14 && weightKgs <= 18 &&
    weightPds >= 31 && weightPds <= 40) {
    res = true;
   }
  }
  if (age > 5 && age <= 12) {
   if (respiratoryRate >= 20 && respiratoryRate <= 30 &&
    heartRate >= 70 && heartRate <= 110 &&
    bp >= 80 && bp <= 120 &&
    weightKgs >= 20 && weightKgs <= 42 &&
    weightPds >= 41 && weightPds <= 92) {
    res = true;
   }
  }
  if (age >= 13) {
   if (respiratoryRate >= 12 && respiratoryRate <= 20 &&
    heartRate >= 55 && heartRate <= 105 &&
    bp >= 110 && bp <= 120 &&
    weightKgs >= 50 &&
    weightPds >= 110) {
    res = true;
   }
  }

  return res;
 }
}