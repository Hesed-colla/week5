 package com.gov.identity;
 import gov.shared.*;
 public class NationalIdService extends Service {
     public void process(Citizen c){
         new NationalDatabase().store(c);
         System.out.println("NIRA: Issued ID for " + c.getName());
 }
}