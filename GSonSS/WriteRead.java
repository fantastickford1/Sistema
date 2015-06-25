package GSonSS;

import java.io.*;
import java.util.*;
import com.google.gson.*;

public class WriteRead{

  public String [] recovery;
  private String nombre_json;
  private String [] datos;

  public WriteRead(){
    recovery = new String [0];
  }

  public WriteRead(String jsonName, String[] datos){
    this.nombre_json = jsonName;
    this.datos = new String [datos.length];
    for(int aux1=0; aux1<datos.length; aux1++){
          this.datos[aux1]= datos[aux1];
    }

  }
//Metodo que escribe un .json con datos de un Array de tipo String
  public void writeJson(){
    Map<String, String> map= new LinkedHashMap<String, String>();
    map.put("Nombre",this.datos[0]);
    map.put("Edad", this.datos[1]);
    map.put("Tipo de Sangre", this.datos[2]);
    map.put("Telefono", this.datos[3]);
    map.put("Genero", this.datos[4]);
    map.put("Correo", this.datos[5]);
    map.put("Escuela", this.datos[6]);
    map.put("Matricula", this.datos[7]);
    map.put("Carrera", this.datos[8]);
    map.put("Grupo", this.datos[9]);
    Gson gson = new Gson();

    try {
      FileWriter file = new FileWriter(nombre_json);
      file.write(gson.toJson(map));
      file.flush();
      file.close();
    }catch (IOException e) {
      e.printStackTrace();
    }
  }

  public String [] recoveryData(){

    JsonParser parser = new JsonParser();

    try {

      Object obj = parser.parse(new FileReader(this.nombre_json));

      JsonObject jsonObject = (JsonObject) obj;

      String nombre = (String) jsonObject.get("Nombre")
      System.out.println(nombre);

      String edad = ....


    }catch(FileNotFoundException e){
      e.printStackTrace();
    }catch (IOException e) {
      e.printStackTrace();
    }catch (ParseException e) {
      e.printStackTrace();
    }



  }






}
