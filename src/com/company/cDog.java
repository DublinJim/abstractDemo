package com.company;

class cDog extends cPet {

  public cDog(String name) {
    super(name);
  }

  @Override
  public void skinType() {
    System.out.println("Pet has fur");
  }
}
