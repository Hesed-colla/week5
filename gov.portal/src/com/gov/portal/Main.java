package com.gov.portal;
 import gov.shared.Citizen;
 import com.gov.identity.NationalIdService;

public class Main {
 public static void main(String[] args){
  Citizen c = new Citizen("JC12345","Hesed");
  new NationalIdService().process(c);
 }
}

