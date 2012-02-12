class Osoba {

  private String name;
  private String sureName;
  private int notACounter;


  public Osoba (String name, String sureName){
    this.name = name;
    this.sureName = sureName;

  }

  public String toString(){
  return "Imię: " + this.name + " Nazwisko: " + this.sureName;

  }

  public void setName(String s){
  name = s;
  }
}


