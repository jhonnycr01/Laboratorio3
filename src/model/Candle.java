package model;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

/**
     * this is class is the archangles candle
     */
public class Candle{
 private String color;
 private String esencia;
 private int tamano;
 private int gradoIluminancia;
 
/** 
* this is the costructor method, allows you to initialize the objects of the class
* @param  col: color of archangels candle
     *  @param ese: essence of archangels candle
     * @param gradoIlu: ilumination Grade of archangels candle
     * @param tam: size of archangels candle
*/
 public Candle(String col,String ese, int gradoIlu, int tam){
    color=col;
    esencia=ese;
    gradoIluminancia=gradoIlu;
    tamano=tam;

 }

 /**
  * this method modify the color attribute
  *@param col: color of archangels candle
  <b>post:</b> the color attribye has been modified <br>
  *
  */
 public void setColor(String col){
     color=col;
 }
 /**
  * this methos modify the essence attribute
  *  @param ese: essence of archangels candle
  *<b>post:</b> the essence attribye has been modified <br>
  */
 public void setEscencia(String ese){
    esencia=ese;
}
/** 
 * this method modify the ilumination grade attribute
 * @param  grad: ilumination Grade of archangels candle
 * <b>post:</b> the color attribye has been modified <br>
 */
public void setGradoIlumnancia(int grad){
    gradoIluminancia=grad;
}
/** 
 * this method modify the size attribute
 * @param tam: size of archangels candle
 * <b>post:</b> the color attribye has been modified <br>
 */
public void setTamano(int tam){
    tamano=tam;
}
/**
 * @return: this method gets the color attribute
 */
public String getColor(){
    return color;
}
/** 
 * @return: this method gets the esscense attribute
 */
public String getEsencia(){
    return esencia;
}
/**
 * @return: this method gets the ilumination grade attribute
 */
public int getGradoIluminancia(){
    return gradoIluminancia;
}
/** 
 *  @return: this method gets the size attribute
 */
public int getTamano(){
    return tamano;
}
}