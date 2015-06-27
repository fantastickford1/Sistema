package GSonSS;
public class Menu extends Alumnos{

    public Menu(){

    }

    public String[] Option1(String[] us, int num_repetir){
      int aux11 = 0;
      for(int aux = 0 ; aux < num_repetir; aux++){
        System.out.print("\nNombre completo: ");
        us[aux11] = this.getNombre();
        aux11++;
        System.out.print("\nEdad: ");
        us[aux11]  = this.getAge();
          aux11++;
        System.out.print("\nTipo de Sangre: ");
        us[aux11]  = this.getBlood();
          aux11++;
        System.out.print("\nTelefono: ");
        us[aux11]  = this.getNumber();
          aux11++;
        System.out.print("\nGenero: ");
        us[aux11]  =this.getGender();
          aux11++;
        System.out.print("\nCorreo: ");
        us[aux11]  = this.getEMail();
          aux11++;
        System.out.print("\nEscuela: ");
        us[aux11]  = this.getEscuela();
          aux11++;
        System.out.print("\nMatricula: ");
        us[aux11]  = this.getMatric();
          aux11++;
        System.out.print("\nCarrera: ");
        us[aux11]  = this.getCarrera();
          aux11++;
        System.out.print("\nGrupo: ");
        us[aux11]  = this.getGrupo();
          aux11++;
        us[aux11] = this.getStatus();
          aux11++;
      }
      return us;
    }

    /////////////////////////////////////////////////////













}
