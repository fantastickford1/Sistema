package GSonSS;
import java.util.*;

public class Alumnos extends Persona {

  public String escuela;
  public String matricula;
  public String carrera;
  public String grupo;
  public String enable;
  private Scanner keyboard2;

  public Alumnos(){
    super();
    this.enable = "True";
  }

  public String getEscuela(){
    keyboard2 = new Scanner(System.in);
    this.escuela = keyboard2.nextLine();
    return this.escuela;
  }

  public String getMatric(){
    keyboard2 = new Scanner(System.in);
    this.matricula = keyboard2.nextLine();
    return this.matricula;
  }

  public String getCarrera(){
    keyboard2 = new Scanner(System.in);
    this.carrera = keyboard2.nextLine();
    return this.carrera;
  }

  public String getGrupo(){
    keyboard2 = new Scanner(System.in);
    this.grupo = keyboard2.nextLine();
    return grupo;
  }

  public String getStatus(){
    return this.enable;
  }

}
