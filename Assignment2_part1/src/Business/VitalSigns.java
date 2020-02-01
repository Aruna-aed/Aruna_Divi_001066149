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

  System.out.println("Age :");
  int age = s.nextInt();

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
   System.out.println("Normal");
  else
   System.out.println("Abnormal");
 }

}