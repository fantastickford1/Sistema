import GSonSS.*;
import java.util.*;
public class MainClass{

  public static void main(String[] args) {
    //AnalizaFile lee = n
    String [] usurario; //array que guarda todos los datos
    String [] recup;
    int w; //size of recovered String from .json
    String conf;//contenedor del nombre del archivo configura
    String jsonName = " "; //contenedor del nombre del archivo .json
    AnalizaFile txt;
    WriteRead jasnWR;
    Menu menu = new Menu();//crea objeto menu
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Ingrese el nombre del documento de Configuracion.txt");
    conf = keyboard.nextLine(); //leer nombre del configura
      txt = new AnalizaFile(conf);
      jsonName = txt.getFirstLine(); //se obtiene el nombre del .json a crear
      if(jsonName == "ERROR,  no se ha encontrado el archivo"){
        System.out.println("Error el archivo de configuracion no se a encontrado");
      }else{
        WriteRead readjson = new WriteRead(jsonName);
        if (readjson.leerJson() == true) {
        //  w = readjson.recoveryData().length;
          //recup = new String[w];
          recup = readjson.recoveryData();
          for (int l = 0; l < recup.length ; l++ ) {
            System.out.println(recup[l]);
          }
        }


        /*
        System.out.println("-----------------Bienvenido----------------");
        System.out.println("Selecione una opcion a realizar");
        System.out.println("1. Agregar Usuario");
        System.out.println("2. Borrar Usuario");
        System.out.println("3. Actualizar Usuario");
        System.out.println("4. Listar Usuarios");
        System.out.println("5. Mostar Creditos");
        System.out.println("--------------------------------------------");
        System.out.println("\n");
        System.out.print("Opcion: ");
        int op = keyboard.nextInt();
        System.out.println("\n");

        switch(op){
          case 1:{ //agregar a una clase//
            System.out.println("Introduce el numero de usuarios a agregar");
            int usr1 = keyboard.nextInt();
            int tam = usr1 * 11;
            usurario = new String[tam];
            usurario = menu.Option1(usurario,usr1);
            jasnWR = new WriteRead(jsonName);
            jasnWR.setStringJS(usurario);
            jasnWR.writeJson(usr1);
            break;
          }

          case 2:{
            System.out.println("Introduce el numero de usuarios a borrar");
            int usr2 = keyboard.nextInt();


            break;
          }

          case 3:{
            System.out.println("Introduce el numero de usuarios a actualizar");
            int usr3 = keyboard.nextInt();


            break;
          }

          case 4:{
            jasnWR = new WriteRead(jsonName);
            jasnWR.printData();


            break;
          }

          case 5:{
            System.out.println("******************CREDITOS*********************");
            System.out.println("Carlos Alejandro Zenteno Robles"+"\tMatricula: 143382");
            System.out.println("Diana ALondra Toledo Maza"+"\tMatricula: 143355");
            System.out.println("Josseline Juliane Arreola Cruz"+"\tMatricula: 143471");
            System.out.println("Hugo Sarmiento Toledo"+"\tMatricula: 143359");
            System.out.println("Dr. Juan Carlos Lopez Pimentel");
            System.out.println("Programacion Orientada a Objetos");
            System.out.println("3 A, IDS");
            System.out.println("2 Corte");
          break;
        }

      }

    }*/

  }
}
}
