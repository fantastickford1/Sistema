package GSonSS;
import java.util.*;
public class Persona{

  public String nombre_compl;
  public String bloodType;
  public String phoneNumber;
  public String e_mail;
  public String age;
  public String gender;
  private Scanner keyboard;

  public Persona(){
  }

  public String getNombre(){
    keyboard = new Scanner(System.in);
    this.nombre_compl = keyboard.nextLine();
    return this.nombre_compl;
  }

  public String getBlood(){
    keyboard = new Scanner(System.in);
    this.bloodType = keyboard.nextLine();
    return this.bloodType;
  }

  public String getNumber(){
    keyboard = new Scanner(System.in);
    this.phoneNumber = keyboard.nextLine();
    return this.phoneNumber;
  }

  public String getEMail(){
    keyboard = new Scanner(System.in);
    this.e_mail = keyboard.nextLine();
    return this.e_mail;
  }

  public String getAge(){
    keyboard = new Scanner(System.in);
    this.age = keyboard.nextLine();
    return this.age;
  }

  public String getGender(){
    keyboard = new Scanner(System.in);
    this.gender = keyboard.nextLine();
    return this.gender;
  }

}
