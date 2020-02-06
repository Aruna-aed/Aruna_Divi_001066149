/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author D diviaruna
 */
public class Patient {

 private String name;
 private double age;
 private ArrayList < VitalSigns > vitalsHistory;
 private VitalSigns latestRecord;


 public Patient() {
  this.vitalsHistory = new ArrayList < VitalSigns > ();
 }
 public VitalSigns getLatestRecord() {
  return latestRecord;

 }
 public void setLatestRecord(VitalSigns latestRecord) {
  this.latestRecord = latestRecord;


 }
 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public double getAge() {
  return age;
 }

 public void setAge(double age) {
  this.age = age;
 }
 public ArrayList < VitalSigns > getVitalsHistory() {
  return vitalsHistory;
 }

 public void setVitalsHistory(ArrayList < VitalSigns > vitalsHistory) {
  this.vitalsHistory = vitalsHistory;
 }
 public VitalSigns AddVitalSign(VitalSigns vs) {
  vitalsHistory.add(vs);
  VitalSigns vs1 = new VitalSigns();
  this.latestRecord = vs1;
  return vs1;
 }

 public boolean isVitalNormal(String vitalName) {
  String vs_name = vitalName.toLowerCase();
  double age = this.age;
  VitalSigns v = this.latestRecord;
  int rr = v.getRespiratoryRate();
  int hr = v.getHeartRate();
  int b_p = v.getBP();
  double wKgs = v.getWeightKgs();
  double wPds = v.getWeightPds();

  if (vs_name.equals("respiratoryrate")) {
   if (age == 0) {
    System.out.println("respiratory rate :" + rr);
    return (rr >= 30) && (rr <= 50);
   }
   if ((age > 0) && (age <= 1)) {
    System.out.println("respiratory rate :" + rr);
    return (rr >= 20) && (rr <= 30);
   }
   if ((age > 1) && (age <= 3)) {
    System.out.println("respiratory rate :" + rr);
    return (rr >= 20) && (rr <= 30);
   }
   if ((age > 3) && (age <= 5)) {
    System.out.println("respiratory rate :" + rr);
    return (rr >= 20) && (rr <= 30);
   }
   if ((age > 5) && (age <= 12)) {
    System.out.println("respiratory rate :" + rr);
    return (rr >= 20) && (rr <= 30);
   }
   if (age >= 13) {
    System.out.println("respiratory rate :" + rr);
    return (rr >= 12) && (rr <= 20);
   }
  } else
  if (vs_name.equals("heartrate")) {
   if (age == 0) {
    System.out.println("heart rate :" + hr);
    return (hr >= 120) && (hr <= 160);
   }
   if ((age > 0) && (age <= 1)) {
    System.out.println("heart rate :" + hr);
    return (hr >= 80) && (hr <= 140);
   }
   if ((age > 1) && (age <= 3)) {
    System.out.println("heart rate :" + hr);
    return (hr >= 80) && (hr <= 130);
   }
   if ((age > 3) && (age <= 5)) {
    System.out.println("heart rate :" + hr);
    return (hr >= 80) && (hr <= 120);
   }
   if ((age > 5) && (age <= 12)) {
    System.out.println("heart rate :" + hr);
    return (hr >= 70) && (hr <= 110);
   }
   if (age >= 13) {
    System.out.println("heart rate :" + hr);
    return (hr >= 55) && (hr <= 105);
   }
  } else
  if (vs_name.equals("bp")) {
   if (age == 0) {
    System.out.println("bp :" + b_p);
    return (b_p >= 50) && (b_p <= 70);
   }
   if ((age > 0) && (age <= 1)) {
    System.out.println("bp :" + b_p);
    return (b_p >= 70) && (b_p <= 100);
   }
   if ((age > 1) && (age <= 3)) {
    System.out.println("bp :" + b_p);
    return (b_p >= 80) && (b_p <= 110);
   }
   if (age > 3 && age <= 5) {
    System.out.println("bp :" + b_p);
    return (b_p >= 80) && (b_p <= 110);
   }
   if (age > 5 && age <= 12) {
    System.out.println("bp :" + b_p);
    return (b_p >= 80) && (b_p <= 120);
   }
   if (age >= 13) {
    System.out.println("bp :" + b_p);
    return (b_p >= 110) && (b_p <= 120);
   }
  } else
  if (vs_name.equals("weightkgs")) {
   if (age == 0) {
    System.out.println("weight in kgs :" + wKgs);
    return wKgs >= 2 && wKgs <= 3;
   }
   if ((age > 0) && (age <= 1)) {
    System.out.println("weight in kgs :" + wKgs);
    return (wKgs >= 4) && (wKgs <= 10);
   }
   if ((age > 1) && (age <= 3)) {
    System.out.println("weight in kgs :" + wKgs);
    return (wKgs >= 10) && (wKgs <= 14);
   }
   if ((age > 3) && (age <= 5)) {
    System.out.println("weight in kgs :" + wKgs);
    return (wKgs >= 14) && (wKgs <= 18);
   }
   if ((age > 5) && (age <= 12)) {
    System.out.println("weight in kgs :" + wKgs);
    return (wKgs >= 20) && (wKgs <= 42);
   }
   if (age >= 13) {
    System.out.println("weight in kgs :" + wKgs);
    return (wKgs >= 50);
   }
  } else
  if (vs_name.equals("weightpds")) {
   if (age == 0) {
    System.out.println("weight in pounds :" + wPds);
    return (wPds >= 4.5) && (wPds <= 7);
   }
   if ((age > 0) && (age <= 1)) {
    System.out.println("weight in pounds :" + wPds);
    return (wPds >= 9) && (wPds <= 22);
   }
   if ((age > 1) && (age <= 3)) {
    System.out.println("weight in pounds :" + wPds);
    return (wPds >= 22) && (wPds <= 31);
   }
   if ((age > 3) && (age <= 5)) {
    System.out.println("weight in pounds :" + wPds);
    return (wPds >= 31) && (wPds <= 40);
   }
   if ((age > 5) && (age <= 12)) {
    System.out.println("weight in pounds :" + wPds);
    return (wPds >= 41) && (wPds <= 92);
   }
   if (age >= 13) {
    System.out.println("weight in pounds :" + wPds);
    return (wPds >= 110);
   }
  }


  return false;
 }
 public boolean isPatientNormal(String name, double age, int rr, int hr, int b_p, double wKgs, double wPds) {
  if (age == 0) {
   System.out.println("Patient is a newborn");

   return (rr >= 30) && (rr <= 50) &&
    (hr >= 120) && (hr <= 160) &&
    (b_p >= 50) && (b_p <= 70) &&
    (wKgs >= 2) && (wKgs <= 3) &&
    (wPds >= 4.5 && wPds <= 7);

  }


  if (age > 0 && age <= 1) {
   System.out.println("Patient is an infant");

   return (rr >= 20 && rr <= 30) &&
    (hr >= 80 && hr <= 140) &&
    (b_p >= 70 && b_p <= 100) &&
    (wKgs >= 4 && wKgs <= 10) &&
    (wPds >= 9 && wPds <= 22);

  }

  if (age > 1 && age <= 3) {
   System.out.println("Patient is a Toddler");

   return (rr >= 20 && rr <= 30) &&
    (hr >= 80 && hr <= 130) &&
    (b_p >= 80 && b_p <= 110) &&
    (wKgs >= 10 && wKgs <= 14) &&
    (wPds >= 22 && wPds <= 31);
  }


  if (age > 3 && age <= 5) {
   System.out.println("Patient is a preschooler");

   return (rr >= 20 && rr <= 30) &&
    (hr >= 80 && hr <= 120) &&
    (b_p >= 80 && b_p <= 110) &&
    (wKgs >= 14 && wKgs <= 18) &&
    (wPds >= 31 && wPds <= 40);

  }
  if (age > 5 && age <= 12) {
   System.out.println("Patient is a school age");

   return (rr >= 20 && rr <= 30) &&
    (hr >= 70 && hr <= 110) &&
    (b_p >= 80 && b_p <= 120) &&
    (wKgs >= 20 && wKgs <= 42) &&
    (wPds >= 41 && wPds <= 92);

  } else {
   System.out.println("Patient is an Adoloscent");

   return (rr >= 12 && rr <= 20) &&
    (hr >= 55 && hr <= 105) &&
    (b_p >= 110 && b_p <= 120) &&
    (wKgs >= 50) &&
    (wPds >= 110);


  }
 }
}