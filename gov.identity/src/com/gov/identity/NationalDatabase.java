package com.gov.identity;
 import gov.shared.Citizen;

 public class NationalDatabase {
    public void store(Citizen c){
        System.out.println("Stored " + c.getNin() + " in secure DB");
 }
}