/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Scanner;

/**
 *
 * @author D diviaruna
 */
public class VitalSigns {

 private int respiratoryRate;
 private int heartRate;
 private int bp;
 private double weightKgs;
 private double weightPds;
 private int date;

 public int getDate() {
  return date;
 }

 public void setDate(int date) {
  this.date = date;
 }

 public int getRespiratoryRate() {
  return respiratoryRate;
 }
 public void setRespiratoryRate(int respiratoryRate) {
  this.respiratoryRate = respiratoryRate;
 }
 public int getHeartRate() {
  return heartRate;
 }
 public void setHeartRate(int heartRate) {
  this.heartRate = heartRate;
 }
 public int getBP() {
  return bp;
 }
 public void setBP(int bp) {
  this.bp = bp;
 }
 public double getWeightKgs() {
  return weightKgs;
 }
 public void setWeightKgs(double weightKgs) {
  this.weightKgs = weightKgs;
 }
 public double getWeightPds() {
  return weightPds;
 }
 public void setWeightPds(double weightPds) {
  this.weightPds = weightPds;
 }
 public static void displayVitalSigns(Patient pat) {
  for (VitalSigns vs: pat.getVitalsHistory()) {
   System.out.println(pat.getName() + " " + vs.getRespiratoryRate() + " " + vs.getHeartRate() + " " + vs.getBP() + " " + vs.getWeightKgs() + " " + vs.getWeightPds());
  }
 }
 public static void main(String[] args) {
  Patient pat = new Patient();
  Scanner scn = new Scanner(System.in);
  System.out.println("Patient Name :");
  String name = scn.nextLine();
  System.out.println("Timestamp :");
  int timeStamp = scn.nextInt();
  System.out.println("Age :");
  double age = scn.nextDouble();
  System.out.println("Respiratory rate :");
  int respRate = scn.nextInt();
  System.out.println("Heart rate :");
  int heartRate = scn.nextInt();
  System.out.println("Blood Pressure :");
  int bp = scn.nextInt();
  System.out.println("Weight Kgs :");
  double weightKgs = scn.nextDouble();
  System.out.println("Weight Pds :");
  double weightPds = scn.nextDouble();

  pat.setName(name);
  pat.setAge(age);
  VitalSigns vs = new VitalSigns();
  vs.setRespiratoryRate(respRate);
  vs.setHeartRate(heartRate);
  vs.setBP(bp);
  vs.setWeightKgs(weightKgs);
  vs.setWeightPds(weightPds);
  vs.setDate(timeStamp);
  pat.setLatestRecord(vs);


  System.out.println("Timestamp :");
  int timeStamp1 = scn.nextInt();


  System.out.println("Age_1 :");
  double age_1 = scn.nextDouble();

  System.out.println("Respiratory rate_1 :");
  int respRate_1 = scn.nextInt();

  System.out.println("Heart rate_1 :");
  int heartRate_1 = scn.nextInt();

  System.out.println("Blood Pressure_1 :");
  int bp_1 = scn.nextInt();

  System.out.println("Weight Kgs_1 :");
  double weightKgs_1 = scn.nextDouble();

  System.out.println("Weight Pds_1 :");
  double weightPds_1 = scn.nextDouble();

  pat.setAge(age_1);
  VitalSigns vis_1 = pat.AddVitalSign(pat.getLatestRecord());
  vis_1.setRespiratoryRate(respRate_1);
  vis_1.setHeartRate(heartRate_1);
  vis_1.setBP(bp_1);
  vis_1.setWeightKgs(weightKgs_1);
  vis_1.setWeightPds(weightPds_1);
  vis_1.setDate(timeStamp1);



  System.out.println("Timestamp :");
  int timeStamp2 = scn.nextInt();

  System.out.println("Age_2 :");
  double age_2 = scn.nextDouble();

  System.out.println("Respiratory rate_2 :");
  int respRate_2 = scn.nextInt();

  System.out.println("heart rate_2 :");
  int heartRate_2 = scn.nextInt();
  System.out.println("bp_2 :");
  int bp_2 = scn.nextInt();

  System.out.println("Weight Kgs_2 :");
  double weightKgs_2 = scn.nextDouble();
  System.out.println("Weight Pds_2 :");
  double weightPds_2 = scn.nextDouble();


  pat.setAge(age_2);
  VitalSigns vis_2 = pat.AddVitalSign(pat.getLatestRecord());
  vis_2.setRespiratoryRate(respRate_2);
  vis_2.setHeartRate(heartRate_2);
  vis_2.setBP(bp_2);
  vis_2.setWeightKgs(weightKgs_2);
  vis_2.setWeightPds(weightPds_2);
  vis_2.setDate(timeStamp2);


  boolean result = pat.isVitalNormal("respiratoryrate");

  if (result == true) {
   System.out.println("respiraory rate of patient is normal");
  } else {
   System.out.println("respiraory rate of patient is Abnormal");

  }
  boolean result1 = pat.isVitalNormal("heartrate");
  if (result1 == true) {
   System.out.println("heart rate of patient is normal");
  } else {
   System.out.println("heart rate of patient is Abnormal");

  }
  boolean result2 = pat.isVitalNormal("bp");
  if (result2 == true) {
   System.out.println("BP of patient is normal");
  } else {
   System.out.println("BP of patient is Abnormal");

  }
  boolean result3 = pat.isVitalNormal("weightkgs");
  if (result3 == true) {
   System.out.println("weight Kgs of patient is normal");
  } else {
   System.out.println("weight Kgs of patient is Abnormal");

  }
  boolean result4 = pat.isVitalNormal("weightpds");
  if (result4 == true) {
   System.out.println("weight Pds of patient is normal");
  } else {
   System.out.println("weight Pds of patient is Abnormal");

  }
  displayVitalSigns(pat);



  VitalSigns lvs = pat.getLatestRecord();

  boolean output = pat.isPatientNormal(pat.getName(), pat.getAge(), lvs.getRespiratoryRate(), lvs.getHeartRate(), lvs.getBP(), lvs.getWeightKgs(), lvs.getWeightPds());
  if (output == true) {
   System.out.println(name + " " + "is in normal condition");
  } else {
   System.out.println(name + " " + "is in abnormal condition");

  }

 }
}