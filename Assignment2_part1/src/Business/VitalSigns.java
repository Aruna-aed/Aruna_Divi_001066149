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
 public VitalSigns() {

 }
 public static void main(String[] args) {
  Patient pat = new Patient();
  VitalSigns vis = new VitalSigns();
  
  

  Scanner s = new Scanner(System.in);
   System.out.println("Newborn               respiratoryRate : 30-50, heartRate : 120-160, bp : 50-70,  weightKgs : 2-3,   weightPds :4.5-7"
             +"\r\n"+ "Infant(1-12 months)   respiratoryRate : 20-30, heartRate : 80-140,  bp : 70-100, weightKgs : 4-10,  weightPds :9-22"
             +"\r\n"+ "Toddler(1-3 yrs)      respiratoryRate : 20-30, heartRate : 80-130,  bp : 80-110, weightKgs : 10-14, weightPds :22-31"
             +"\r\n"+ "Preschooler(3-5 yrs)  respiratoryRate : 20-30, heartRate : 80-120,  bp : 80-110, weightKgs : 14-18, weightPds :31-40"
             +"\r\n"+ "Schoolage(6-12 yrs)   respiratoryRate : 20-30, heartRate : 70-110,  bp : 80-120, weightKgs : 20-42, weightPds :41-92"
             +"\r\n"+ "Adolescent(13+ yrs)   respiratoryRate : 12-20, heartRate : 55-105,  bp : 110-120,weightKgs : >50,   weightPds : >110");
     
  System.out.println("Age :");
  double age = s.nextDouble();
  

  System.out.println("Respiratory Rate :");
  int respiratoryRate = s.nextInt();

  System.out.println("heartRate :");
  int heartRate = s.nextInt();

  System.out.println("bp :");
  int bp = s.nextInt();

  System.out.println("weightKgs :");
  double weightKgs = s.nextInt();

  System.out.println("weightPds :");
  double weightPds = s.nextDouble();
  pat.setAge(age);
  vis.setRespiratoryRate(respiratoryRate);
  vis.setHeartRate(heartRate);
  vis.setBP(bp);
  vis.setWeightKgs(weightKgs);
  vis.setWeightPds(weightPds);

  pat.setVis(vis);

  boolean output;

  output = pat.isPatientNormal(pat.getAge(), vis.getRespiratoryRate(), vis.getHeartRate(), vis.getBP(), vis.getWeightKgs(), vis.getWeightPds());
  
  if (output == true)
   System.out.println("Patient is in Normal condition");
  else
   System.out.println("Patient is in Abnormal condition");
 }

}