package GSonSS;

import java.util.*;

public class Menu extends Alumnos{

    private Scanner keyboard;


    public Menu(){

    }


    public int MenuContext(){
      keyboard = new Scanner(System.in);
      System.out.println("-----------------Menu----------------");
      System.out.println("Selecione una opcion a realizar");
      System.out.println("1. Agregar Usuario");
      System.out.println("2. Borrar Usuario");
      System.out.println("3. Actualizar Usuario");
      System.out.println("4. Listar Usuarios");
      System.out.println("5. Configuracion");
      System.out.println("6. Mostar Creditos");
      System.out.println("7. Salir");
      System.out.println("--------------------------------------------");
      System.out.println("\n");
      System.out.print("Opcion: ");
      int op = keyboard.nextInt();
      System.out.println("\n");
      return op;
    }



    public String[][] Option1(String[][] us, int num_repetir){
      for(int aux = 0 ; aux < num_repetir; aux++){
        System.out.print("\nNombre completo: ");
        us[aux][0] = this.getNombre();
        System.out.print("\nEdad: ");
        us[aux][1]  = this.getAge();
        System.out.print("\nTipo de Sangre: ");
        us[aux][2]  = this.getBlood();
        System.out.print("\nTelefono: ");
        us[aux][3]  = this.getNumber();
        System.out.print("\nGenero: ");
        us[aux][4]  =this.getGender();
        System.out.print("\nCorreo: ");
        us[aux][5]  = this.getEMail();
        System.out.print("\nEscuela: ");
        us[aux][6]  = this.getEscuela();
        System.out.print("\nMatricula: ");
        us[aux][7]  = this.getMatric();
        System.out.print("\nCarrera: ");
        us[aux][8]  = this.getCarrera();
        System.out.print("\nGrupo: ");
        us[aux][9]  = this.getGrupo();
        us[aux][10] = this.getStatus();
      }
      return us;
    }

    /////////////////////////////////////////////////////













}
