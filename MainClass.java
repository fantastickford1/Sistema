import GSonSS.*;
import java.util.*;
public class MainClass{

  public static void main(String[] args) {
    //AnalizaFile lee = n
    String [] usurario; //array que guarda todos los datos
    String [] recup; //Array para guardar datos recuperados del .json
    String conf;//contenedor del nombre del archivo configura
    String jsonName = " "; //contenedor del nombre del archivo .json
    boolean exitState;
    int tam;
    AnalizaFile txt;
    WriteRead jasnWR;
    Redimensiona redimesion;
    Menu menu = new Menu();//crea objeto menu
    Scanner keyboard = new Scanner(System.in);
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    System.out.println("------------------Bienvenido------------------------\n");
    System.out.println("Porfavor ingrese el nombre del documento de Configuracion con extencion .txt\n");
    conf = keyboard.nextLine(); //leer nombre del configura
    txt = new AnalizaFile(conf);
    jsonName = txt.getFirstLine(); //se obtiene el nombre del .json a crear
      if(jsonName == "ERROR,  no se ha encontrado el archivo"){ //No se pudo leer el archivo TXT
        System.out.println("Error el archivo de configuracion no se a encontrado");
      }else{ //se pudo leer el archivo txt
        jasnWR = new WriteRead(jsonName);
        if (jasnWR.leerJson() == true) { //si el .json existe
          System.out.println("***************Se econtro un .json existente con el nombre especificado en el configura.txt************\n\n");
          recup = jasnWR.recoveryData();
          exitState = true;
          while (exitState == true) {
            switch(menu.MenuContext()){
              case 1:{ //agregar a una clase//
                System.out.println("Introduce el numero de usuarios a agregar");
                int usr1 = keyboard.nextInt();
                tam = usr1 * 11;
                usurario = new String[tam];
                usurario = menu.Option1(usurario,usr1);
                jasnWR = new WriteRead(jsonName);
                jasnWR.setStringJS(usurario);
                jasnWR.writeJson();
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

              case 6:{
                exitState = false;
                break;
              }

              default: System.out.println("Obcion no valida");
                break;
            }
          }
        }else{ //si el .json no existe
          exitState = true;
          while (exitState == true) {
            switch(menu.MenuContext()){
              case 1:{ //agregar a una clase//
                System.out.println("Introduce el numero de usuarios a agregar");
                int usr1 = keyboard.nextInt();
                tam = usr1 * 11;
                usurario = new String[tam];
                usurario = menu.Option1(usurario,usr1);
                //jasnWR = new WriteRead(jsonName);
                jasnWR.setStringJS(usurario);
                jasnWR.writeJson();
                break;
              }

              case 2:{
                keyboard = new Scanner(System.in);
                recup = jasnWR.recoveryData();
                String[] temporal = new String[recup.length-1];
                for (int y = 0; y < temporal.length ; y++ ) {
                  temporal[y] = recup[y+1];
                }
                System.out.println("Introduce el numero de usuarios a borrar");
                int usr2 = keyboard.nextInt();
                int rt = 0;
                int lw = 0;
                int p = 0;
                while ( p < usr2 ) {
                  System.out.println("Ingrese la matricula del usuario a borrar");
                  String matr = keyboard.next();
                  if (matr == temporal[rt+7]) {
                    temporal[lw+10] = "False";
                  }
                  p++;
                }
                jasnWR.setStringJS(temporal);
                jasnWR.writeJson();
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

              case 6: exitState = false;
                break;

              default: System.out.println("Obcion no valida");
                break;
            }
          }
      }
    }
  }
}
