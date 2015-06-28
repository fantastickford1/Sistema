package GSonSS;

import java.io.*;
import java.util.*;
import com.google.gson.*;

public class WriteRead{

  private String recovery; //se guarda un array con los datos recuperados del .json
  private String nombre_json; //guarda el nombre del .json obtenido por el Constructor
  private String [][] datos; //guarda el array con datos obtenidos por el metodo setStringJS
  private String[] allrecor; //guarda datos recuperados del .json ya spliteados
  /////////////////////////
  //private int nm = 0;

 //Constructor por defecto
  public WriteRead(){
    this.recovery = " ";
    this.nombre_json = " ";
    this.datos = new String[0][0];
  }
//Constructor que recibe el nombre del .json
  public WriteRead(String jsonName){
    this.nombre_json = jsonName;
    this.recovery = " ";

  }
//metodo copia el array string con datos ingresados por el Usuario
  public void setStringJS(String[][] datos){
    this.datos = new String [datos.length][11];
    for(int aux1=0; aux1<datos.length; aux1++){
      for (int aux2 = 0; aux2 < 11 ; aux2++ ) {
        this.datos[aux1][aux2] = datos[aux1][aux2];
      }
    }
  }
//leer archivo json y regresa si se pudo o no
  public boolean leerJson(){
    try {
      FileReader rd = new FileReader(nombre_json);

    }catch (FileNotFoundException e) {
      return false;
    }
    return true;
  }


//Metodo que escribe un .json con datos de un Array de tipo String
  public void writeJson(){
    Gson gson = new Gson();
    JsonArray  usuario = new JsonArray();
    JsonObject alumnos = new JsonObject();

    for (int q = 0; q < this.datos.length ; q++ ) {
      if(this.datos[q][10] == "True"){
        JsonObject personah = new JsonObject();
        personah.addProperty("Nombre",this.datos[q][0]);
        personah.addProperty("Edad", this.datos[q][1]);
        personah.addProperty("Tipo de Sangre", this.datos[q][2]);
        personah.addProperty("Telefono", this.datos[q][3]);
        personah.addProperty("Genero", this.datos[q][4]);
        personah.addProperty("Correo", this.datos[q][5]);
        personah.addProperty("Escuela", this.datos[q][6]);
        personah.addProperty("Matricula", this.datos[q][7]);
        personah.addProperty("Carrera", this.datos[q][8]);
        personah.addProperty("Grupo", this.datos[q][9]);
        personah.addProperty("Estado", this.datos[q][10]);
        usuario.add(personah);
      }
    }
    alumnos.add("Alumnos",usuario);

    try {
      FileWriter file = new FileWriter(nombre_json);
      file.write(gson.toJson(alumnos));
      file.flush();
      file.close();
    }catch (IOException e) {
      e.printStackTrace();
    }
  }
///////////////////lee y recupera todo el .json////////////////////////////
  public void printData(){
    JsonParser parser = new JsonParser();
    try {
      FileReader fr = new FileReader(nombre_json);
      JsonElement data = parser.parse(fr);
      dumpGsonElement(data);
    }catch(FileNotFoundException e){
      e.printStackTrace();
    }
  }
////////////////////Metodo necesario para el recoveryData///////////////////
  private void dumpGsonElement(JsonElement element){
    if(element.isJsonObject()){
      //System.out.println("Usuario" + nm);
      JsonObject obj = element.getAsJsonObject();
      Set<Map.Entry<String,JsonElement>> entradas = obj.entrySet();
      Iterator<Map.Entry<String,JsonElement>> iter = entradas.iterator();
      while(iter.hasNext()){
        Map.Entry<String,JsonElement> entrada = iter.next();
        System.out.print(entrada.getKey() + ": ");
        //Imprime la clave ejmpl: Nombre,Edad, etc...
        //System.out.println("Valor:");
        dumpGsonElement(entrada.getValue());
      }
    }else if(element.isJsonArray()){
      JsonArray array = element.getAsJsonArray();
      System.out.println("Numero de usuarios: " + array.size());
      Iterator<JsonElement> iter = array.iterator();
      int nm = 1;
      while (iter.hasNext()) {
        System.out.println("Usuario" + nm);
        JsonElement entrada = iter.next();
        nm++;
        dumpGsonElement(entrada);
      }
    } else if (element.isJsonPrimitive()) {
        //System.out.println("Es primitiva");
        JsonPrimitive valor = element.getAsJsonPrimitive();
        if (valor.isBoolean()) {
            System.out.println("Es booleano: " + valor.getAsBoolean());
        } else if (valor.isNumber()) {
            System.out.println("Es numero: " + valor.getAsNumber());
        } else if (valor.isString()) {
            System.out.print(valor.getAsString() + "\n"); //imprimer el valor que tiene la clave ejempl: Diana,15,A.....
        }
    } else if (element.isJsonNull()) {
        System.out.println("Es NULL");
    } else {
        System.out.println("Es otra cosa");
    }
  }
/////////////////////////////////////////////////////////////////////////
public String[] recoveryData(){
  JsonElement report;
  JsonParser parser = new JsonParser();
  try {
    FileReader fr = new FileReader(nombre_json);
    report = parser.parse(fr);
    allrecor = dumpGsonElement2(report).split(":"); // se guarda los datos recuperados del .json en allrecor[]
  }catch(FileNotFoundException e){
    e.printStackTrace();
  }
    return allrecor; //retorno del array de string con un espacio extra
}
//////////////////////////////////////////////////////////////////////

private String dumpGsonElement2(JsonElement element){

  if(element.isJsonObject()){
    JsonObject obj = element.getAsJsonObject();
    Set<Map.Entry<String,JsonElement>> entradas = obj.entrySet();
    Iterator<Map.Entry<String,JsonElement>> iter = entradas.iterator();
    while(iter.hasNext()){
      Map.Entry<String,JsonElement> entrada = iter.next();
      //System.out.print(entrada.getKey() + ": ");
      //Imprime la clave ejmpl: Nombre,Edad, etc...
      dumpGsonElement2(entrada.getValue());
    }
  }else if(element.isJsonArray()){
    JsonArray array = element.getAsJsonArray();
    //System.out.println("Numero de usuarios: " + array.size());
    Iterator<JsonElement> iter = array.iterator();
    //int nm = 1;
    while (iter.hasNext()) {
      //System.out.println("Usuario" + nm);
      JsonElement entrada = iter.next();
      //nm++;
      dumpGsonElement2(entrada);
    }
  } else if (element.isJsonPrimitive()) {
      //System.out.println("Es primitiva");
      JsonPrimitive valor = element.getAsJsonPrimitive();
      if (valor.isBoolean()) {
          //System.out.println("Es booleano: " + valor.getAsBoolean());
      } else if (valor.isNumber()) {
          //System.out.println("Es numero: " + valor.getAsNumber());
      } else if (valor.isString()) {
          recovery = recovery + ":" + valor.getAsString(); //guarda el valor que tiene la clave ejempl: Diana,15,A.....
      }
  } else if (element.isJsonNull()) {
      System.out.println("Es NULL");
  } else {
      System.out.println("Es otra cosa");
  }
  return recovery;
}

}
