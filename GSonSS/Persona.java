package GsonSS;

public class Persona{

  public String nombre_compl;
  public String bloodType;
  public long phoneNumber;
  public String e_mail;
  public int age;
  public String gender;

  public Persona(){
    this.nombre_compl = " ";
    this.bloodType = " ";
    this.phoneNumber = " ";
    this.e_mail = " ";
    this.age = " ";
    this.gender = " ";
  }

  public Persona(String nombre_compl, String bloodType, long phoneNumber, String e_mail, int age, String gender){
    this.nombre_compl = nombre_compl;
    this.bloodType = bloodType;
    this.phoneNumber = phoneNumber;
    this.e_mail = e_mail;
    this.age = age;
    this.gender = gender;
  }

  public String getNombre(){
    return this.nombre_compl;
  }

  public String getBlood(){
    return this.bloodType;
  }

  public long getNumber(){
    return this.phoneNumber;
  }

  public String getEMail(){
    return this.e_mail;
  }

  public int getAge(){
    return this.age;
  }

  public String getGender(){
    return this.gender;
  }

}
