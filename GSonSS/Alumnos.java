package GSonSS;

public class Alumnos extends Persona {

  public String escuela;
  public String matricula;
  public String carrera;
  public String grupo;
  public boolean enable;

  public Alumnos(){
    super();
    this.escuela = "";
    this.matricula = "";
    this.carrera = "";
    this.grupo = "";
    this.enable = false;
  }

  public Alumnos(String nombre_compl, String bloodType, long phoneNumber, String e_mail, int age, String gender, boolean enable){
    super(nombre_compl, bloodType, phoneNumber, e_mail, age, gender);
    this.enable = true;
  }

  public String getEscuela(String escuela){
    this.escuela = escuela;
    return this.escuela;
  }

  public String getMatric(String matricula){
    this.matricula = matricula;
    return this.matricula;
  }

  public String getCarrera(String carrera){
    this.carrera = carrera;
    return this.carrera;
  }

  public String getGrupo(String grupo){
    this.grupo = grupo;
    return grupo;
  }

  public boolean getStatus(){
    return this.enable;
  }



}
