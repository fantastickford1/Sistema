package GSonSS;

import java.io.*;
import org.json.simple.*;
import java.util.*;

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

  public void writeJson(){
    Map obj=new LinkedHashMap();
    obj.put("Nombre",this.datos[0]);
    obj.put("Edad", this.datos[1]);
    obj.put("Tipo de Sangre", this.datos[2]);
    obj.put("Telefono", this.datos[3]);
    obj.put("Genero", this.datos[4]);
    obj.put("Correo", this.datos[5]);
    obj.put("Escuela", this.datos[6]);
    obj.put("Matricula", this.datos[7]);
    obj.put("Carrera", this.datos[8]);
    obj.put("Grupo", this.datos[9]);

    String jsonText = JSONValue.toJSONString(obj);
    System.out.print(nombre_compl);
  }


  /*public String [] recoveryData(){

    JSONParser parser = new JSONParser(this.nombre_json);

    try {

      Object obj = parser.parse(new FileReader(this.nombre_json));



    }catch



  }*/






}
