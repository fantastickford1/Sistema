package GSonSS;

import java.io.*; //Importacion de librerias

public class AnalizaFile{

//Atributos de la clase//
  private String aarchivo;
  private String rdline;
  private FileReader fr;
  private BufferedReader br;
  private String[] vector;

//Constructor por default: se tuvo que declarar ya que sin el no reconocia el Constructor por default//
  public AnalizaFile(){
  }
//Constructor con parametro del nombre del archivo//
  public AnalizaFile(String nombre_archivo){
    aarchivo = nombre_archivo;
  }
//Metodo que obtiene el numero de lineas//
  public int getLines(){
    int numLines = 0;
    try{
      fr = new FileReader(aarchivo);        //se abre el archivo
      br = new BufferedReader(fr);
      while((rdline = br.readLine()) != null){    //lectura de lineas
        numLines++;
      }
    }catch(java.io.IOException ioex){
      return -1;
    }finally{
      try{
        if(null != fr){
          fr.close();       //cierra el archivo
        }
      }catch(java.io.IOException ioex){
      }
    }
    return numLines;
  }
  //Lectura de todas las lineas almacenadas en un array//
  public String[] getAllLines(int num_lines){
      try{
          vector = new String[num_lines];
          int count=0;
          fr = new FileReader(aarchivo);
          br = new BufferedReader(fr);
          while((rdline = br.readLine()) != null && count < num_lines){
              vector[count] = rdline;
              count++;
          }
      }catch(java.io.IOException ioex){
      }finally{
        try{
            if(null != fr){
              fr.close();       //cierra el archivo
            }
        }catch(java.io.IOException ioex){
        }
      }
      return vector;
  }

//Metodo que obtiene la primera linea del txt//
  public String getFirstLine(){
    try{
      fr = new FileReader(aarchivo);  //se abre el archivo
      br = new BufferedReader(fr);
      rdline = br.readLine();     //lee una linea
    }catch(java.io.IOException ioex){
      return "ERROR,  especificar un nombre de archivo";
    }finally{
      try{
        if(null != fr){
          fr.close();       //cierre de archivo
        }
      }catch(java.io.IOException ioex){
      }
    }
    return rdline;
  }
//Metodo que obtiene la ultima linea del txt//
  public String getLastLine(){
    int firtLines = 0;
    String lastLine="";
    try{
      fr = new FileReader(aarchivo);        //abre el archivo
      br = new BufferedReader(fr);
      while((rdline = br.readLine()) != null){      //lee el archivo
        lastLine = rdline;          //lee la ultima linea
      }
    }catch(java.io.IOException ioex){
      return "ERROR,  especificar un nombre de archivo";
    }finally{
      try{
        if(null != fr){
          fr.close();     //se cierra el archivo
        }
      }catch(java.io.IOException ioex){
      }
    }
    return lastLine;
  }
//Metodo que sirve como auxiliar para recibir el nombre del txt si se usa el Constructor por defecto//
  public void setFileName(String nfile){
    aarchivo = nfile;
  }
//Creditos con informacion del proyecto//
  public String creditos(){
    return "Programa: Lectura de archivos\nDocente: Dr. Juan Carlos Lopez Pimentel\nIntregrandes del equipo: \n Diana Alondra Toledo Maza: 143355 \n Hugo Sarmiento Toledo: 143359\n Carlos Alejandro Zenteno Robles:143382\nAsignatura: Programacion Orientada a Objetos\nCorte: 1er\nFecha de entrega:05/30/2015";
  }

}
