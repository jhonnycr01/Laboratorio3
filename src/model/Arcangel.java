package model;
import java.util.Vector;

import javax.print.DocFlavor.STRING;
/**
     * this is class is the archangle
     */
public class Arcangel{
    private String nombre;
    private String oracion;
    private int dia;
    private String mes;
    private String foto;
    private String poder;
    Candle velaEspecial;

    /**
     * this is the costructor method, allows you to initialize the objects of the class
     *  @param nom: archangels name
     * @param  ora: archangels prayer 
     * @param  diaMain: archangels day
     * @param  mesMain: archangels Month
     * @param  pod: archangels power
     * @param  posi: archangels position
     * @param  col: color of archangels candle
     *  @param ese: essence of archangels candle
     * @param  grad: ilumination Grade of archangels candle
     * @param  tam: size of archangels candle
     *  @param fot: archangels picture
     */

    public Arcangel(String nom, String ora, int diaMain, String mesMain, String pod, int posi,String col, String ese, int grad, int tam, String fot){
        nombre=nom;
        oracion=ora;
        dia=diaMain;
        mes=mesMain;
        poder=pod;
        foto=fot;
        velaEspecial= new Candle(col, ese, grad, tam);
    }

    /**
     * @return: this method allows you to get or call the special candle attribute
     */
    public Candle getVelaEspeciaCandle(){
        return velaEspecial;
    }
    /**
     * @return: this method allows you to get the picture attribute
     */
    public String getFoto(){
        return foto;
    }
    /**
     * @return: this method allows you to get the name attribute
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * @return: this method allows you to get the prayer attribute
     */
    public String getOracion(){
        return oracion;
    }
    /**
     * @return: this method allows you to get the month attribute
     */
    public String getMes(){
        return mes;
    }
    /**
     * @return: this method allows you to get the power attribute
     */
    public String getPoder(){
        return poder;
    }
    /** @return: this method allows you to get the day attribute */
    public int getDia(){
        return dia;
    }
    /**
  * this method modify the day attribute
  *@param diaDate: archangels day
  *<b>post:</b> the day attribye has been modified <br>
  */
    public void setDia(int diaDate){
        dia=diaDate;
    }
    /**
  * this method modify the month attribute
  * @param mesDate: archangels Month
  <b>post:</b> the month attribye has been modified <br>
  */
  public void setMes(String mesDate){
    mes=mesDate;
    }
    /**
  * this method modify the name attribute
  *  @param nom: archangels name
  *<b>post:</b> the name attribye has been modified <br>
  */
  public void setNombre(String nom){
    nombre=nom;
    }
    /**
  * this method modify the picture attribute
  *  @param fot: archangels picture
  *<b>post:</b> the picture attribye has been modified <br>
  */
  public void setFoto(String fot){
    foto=fot;
    }
    /**
  * this method modify the prayer attribute
  * @param ora: archangels prayer 
  *<b>post:</b> the prayer attribye has been modified <br>
  */
  public void setOracion(String ora){
    oracion=ora;
    }
    /**
  * this method modify the power attribute
  * @param pod: archangels power
  *<b>post:</b> the power attribye has been modified <br>
  */
  public void setPoder(String pod){
    poder=pod;
    }
    /**
  * this method modify the special candle attribute
  * @param vel: archangels candle
  *<b>post:</b> the special candle attribye has been modified <br>
  */
    public void setVelaEspecial(Candle vel){
        velaEspecial=vel;
        }


}