package GSonSS;
public class Redimensiona{


  public int[] redimensionaInt(int[] array_int, int nw_dimension){
    int[] nw_array = new int[nw_dimension];
    int aux;
    if(array_int.length < nw_dimension){
      for (aux=0;aux < array_int.length;aux++ ) {
        nw_array[aux] = array_int[aux];
      }
    }else{
      for (aux=0;aux < nw_dimension;aux++){
        nw_array[aux] = array_int[aux];
      }
    }
    return nw_array;
  }

  public char[] redimensionaChar(char[] array_char, int nw_dimension){

    char[] nw_array = new char[nw_dimension];
    int aux;
    if(array_char.length < nw_dimension){
      for (aux=0;aux < array_char.length;aux++ ) {
        nw_array[aux] = array_char[aux];
      }
    }else{
      for (aux=0;aux < nw_dimension;aux++){
        nw_array[aux] = array_char[aux];
      }
    }
    return nw_array;
  }

  public byte[] redimensionaByte(byte[] array_byte, int nw_dimension){

    byte[] nw_array = new byte[nw_dimension];
    int aux;
    if(array_byte.length < nw_dimension){
      for (aux=0;aux < array_byte.length;aux++ ) {
        nw_array[aux] = array_byte[aux];
      }
    }else{
      for (aux=0;aux < nw_dimension;aux++){
        nw_array[aux] = array_byte[aux];
      }
    }
    return nw_array;
  }

  public double[] redimensionaDouble(double[] array_double, int nw_dimension){

    double[] nw_array = new double[nw_dimension];
    int aux;
    if(array_double.length < nw_dimension){
      for (aux=0;aux < array_double.length;aux++ ) {
        nw_array[aux] = array_double[aux];
      }
    }else{
      for (aux=0;aux < nw_dimension;aux++){
        nw_array[aux] = array_double[aux];
      }
    }
    return nw_array;
  }

  public short[] redimensionaShort(short[] array_short, int nw_dimension){

    short[] nw_array = new short[nw_dimension];
    int aux;
    if(array_short.length < nw_dimension){
      for (aux=0;aux < array_short.length;aux++ ) {
        nw_array[aux] = array_short[aux];
      }
    }else{
      for (aux=0;aux < nw_dimension;aux++){
        nw_array[aux] = array_short[aux];
      }
    }
    return nw_array;
  }

  public long[] redimensionaLong(long[] array_long, int nw_dimension){

    long[] nw_array = new long[nw_dimension];
    int aux;
    if(array_long.length < nw_dimension){
      for (aux=0;aux < array_long.length;aux++ ) {
        nw_array[aux] = array_long[aux];
      }
    }else{
      for (aux=0;aux < nw_dimension;aux++){
        nw_array[aux] = array_long[aux];
      }
    }
    return nw_array;
  }

  public float[] redimensionaFloat(float[] array_float, int nw_dimension){

    float[] nw_array = new float[nw_dimension];
    int aux;
    if(array_float.length < nw_dimension){
      for (aux=0;aux < array_float.length;aux++ ) {
        nw_array[aux] = array_float[aux];
      }
    }else{
      for (aux=0;aux < nw_dimension;aux++){
        nw_array[aux] = array_float[aux];
      }
    }
    return nw_array;
  }

  public boolean[] redimensionaBoolean(boolean[] array_boolean, int nw_dimension){

    boolean[] nw_array = new boolean[nw_dimension];
    int aux;
    if(array_boolean.length < nw_dimension){
      for (aux=0;aux < array_boolean.length;aux++ ) {
        nw_array[aux] = array_boolean[aux];
      }
    }else{
      for (aux=0;aux < nw_dimension;aux++){
        nw_array[aux] = array_boolean[aux];
      }
    }
    return nw_array;
  }

  public String[][] redimensionaString2D(String[][] array_String2D, int new_filas){
    int filas = new_filas + array_String2D.length;
    String[][] nw_array = new String[filas][array_String2D[0].length];
    int aux;
    int aux2;
      for (aux=0;aux < array_String2D.length;aux++ ) {
        for (aux2=0; aux2 < array_String2D[0].length;aux2 ++ ) {
          nw_array[aux][aux2] = array_String2D[aux][aux2];
        }
      }
    return nw_array;
  }

}
