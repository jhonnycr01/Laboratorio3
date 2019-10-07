package model;
import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
    /**
     * this is class has the archangles
     */
public class TopLegion{
    private Arcangel[] arcangeles;
    private int numArcangeles;

    /**
     * @param numArca: number of archangels 
     * this is the costructor method, allows you to initialize the objects of the class
     */
    public TopLegion(int numArca){
        arcangeles= new Arcangel[numArca];        

    }
    /**
     * @param i: position of archangel
     * @return: this method allows you to get an archangel attribute in a position
     */
    public Arcangel getArcangel(int i){
        return arcangeles[i];
    }
    /**
  * this method modify an archangel attribute of the array
  *@param i: position of archangel
  *@param arc: new Archangel 
  *<b>post:</b> the archangel attribye in position i has been modified <br>
  */
    public void setArcangel(Arcangel arc, int i){
        arcangeles[i]=arc;
    }
    /**
     * @param nom: archangels name
     * @param ora: archangels prayer 
     * @param diaMain: archangels day
     * @param mesMain: archangels Month
     * @param pod: archangels power
     * @param posi: archangels position
     * @param col: color of archangels candle
     *  @param ese: essence of archangels candle
     * @param grad: ilumination Grade of archangels candle
     * @param  tam: size of archangels candle
     *  @param fot: archangels picture
     * this method allows to set the information of the archangles in the array
     * <b>post:</b> the attributes have been set <br>
     */
    public void crearArcangeles(String nom,String ora,int diaMain,String mesMain,String pod,int posi,String col, String ese, int grad, int tam, String fot){
        
        arcangeles[posi]= new Arcangel(nom, ora, diaMain, mesMain, pod, posi, col, ese, grad,tam,fot);
        
    }
    /**
     * this method allows the user to get the information of one archangel by the name
     * <b>pre:</b> the name that the user enter must be  != null and string. <br>
     * @param nom: archangels name
     * <b>post:</b> the information has been given by entering the name of the archangel<br>    
     * this method returns the information of an archangel by entering the name.
     */
    public void buscarDadoNombre(String nom){
        int i=0;
        do {    
            if  (arcangeles[i]==null){
                i=numArcangeles;
            }else{
            if (arcangeles[i].getNombre().equalsIgnoreCase(nom)) {
                System.out.println(" ");
                System.out.println("name: " + arcangeles[i].getNombre());
                System.out.println("day: "+ arcangeles[i].getDia());
                System.out.println("Month: "+arcangeles[i].getMes());
                System.out.println("prayer: "+arcangeles[i].getOracion());
                System.out.println("Power: "+arcangeles[i].getPoder());
                System.out.println("the picture is: "+arcangeles[i].getFoto());
                System.out.println("Candle color: "+arcangeles[i].velaEspecial.getColor());
                System.out.println("Essence: "+arcangeles[i].velaEspecial.getEsencia());
                System.out.println("ilumination grade: "+arcangeles[i].velaEspecial.getGradoIluminancia());
                System.out.println("candle size: "+arcangeles[i].velaEspecial.getTamano());
                System.out.println(" ");
            } 
        }
            i++;
        } while (i<numArcangeles);
        
    }
    /**
     * this method allows the user to get the information of one archangel bny the celebration month
     * @param mes: archangels Month
     * <b>pre:</b> the celebration month that the user enter must be != null and string. <br>
     * <b>post:</b> the information has been given by entering the celebration month of the archangel<br>
     * the information has been given by entering the celebration month
     */
    public void buscarCelebracionesMes(String mes){
        int i=0;
        int dias=0;
        String[] celebraciones= new String[numArcangeles];
        do {    
            if  (arcangeles[i]==null){
                i=numArcangeles;
            }else{
            if (arcangeles[i].getMes().equalsIgnoreCase(mes)) {
                celebraciones[dias]=arcangeles[i].getNombre()+" day of celebration  "+arcangeles[i].getDia()+" "+arcangeles[i].velaEspecial.getColor()+" "+arcangeles[i].velaEspecial.getEsencia();
                dias++;
        }
            i++;
        }
     } while (i<numArcangeles);
        i=0;
        do {    
            if  (arcangeles[i]==null){
                i=numArcangeles;
            }else{
                System.out.println(celebraciones[i]);              
            } 
            i++;
        }while (i<numArcangeles);
           
       
    }
    /**
     * this method allows the user to get the information by entering the power of the archangel
     * @param pod: archangels power
     * <b>pre:</b> the power that the user enter must be != null and string. <br>
     * <b>post:</b> the information has been given by entering the power of the archangel<br>
     * the information has been given by entering the power.
     */
    public void buscarDadoPoder(String pod){
        int i=0;
        do {    
            if  (arcangeles[i]==null){
                i=numArcangeles;
            }else{
            if (arcangeles[i].getPoder().equalsIgnoreCase(pod)) {
                System.out.println(" ");
                System.out.println("Name: " + arcangeles[i].getNombre());
                System.out.println("day: "+ arcangeles[i].getDia());
                System.out.println("Month: "+arcangeles[i].getMes());
                System.out.println("prayer: "+arcangeles[i].getOracion());
                System.out.println("Power: "+arcangeles[i].getPoder());
                System.out.println("the picture is: "+arcangeles[i].getFoto());
                System.out.println("candle color: "+arcangeles[i].velaEspecial.getColor());
                System.out.println("Essence: "+arcangeles[i].velaEspecial.getEsencia());
                System.out.println("ilumination grade: "+arcangeles[i].velaEspecial.getGradoIluminancia());
                System.out.println("candle size: "+arcangeles[i].velaEspecial.getTamano());
                System.out.println(" ");
            } 
        }
            i++;
        } while (i<numArcangeles);
        
    }
    /** 
     * this method allows the code to validate if the name of the archangel that the user enter ends with el
     * @param nom: archangels name
     * <b>pre:</b> the name that the user enter must be != null and string and has to end with el . <br>
     * <b>post:</b> the information has been validated <br>
     * @return: returns a boolean 
     */
    public boolean validarTerminaEl(String nom){
        boolean terminaEl=false;
        if(nom.endsWith("el")){
            terminaEl=true;
    } 
        return terminaEl;
    }
    /**
     * this method allows the code to validate if the name that the user enter is the same
     * @param nom: archangels name
     * <b>pre:</b> the name that the user enter must be != null and string. <br>
     * <b>post:</b> the information has been validated <br>
     * @return a boolean.
     */
    public boolean validarNombreRepetido(String nom){
        boolean repetido=false;
        int i=0;
        do {
            if  (arcangeles[i]==null){
            i=numArcangeles;
             }   else{ 
                 if(nom.equalsIgnoreCase(arcangeles[i].getNombre())){
                    repetido= true;
                    return repetido;
             }

             }
            i++;
            
        } while (i<numArcangeles);
        return repetido;

    }
    /**
     * this method allows the code to validate if the power that the user enter is equal to another power
     * <b>pre:</b> the power that the user enter must be != null and string. <br>
     * <b>post:</b> the information has been validated <br>
     * @param pod: archangels power
     * @return returns a true if its repited 
     */
    public boolean validarPoderRepetido(String pod){
        boolean repetido=false;
        int i=0;
        do {
            if  (arcangeles[i]==null){
            i=numArcangeles;
             }   else{ 
                 if(pod.equalsIgnoreCase(arcangeles[i].getPoder())){
                    repetido= true;
                    return repetido;
             }

             }
            i++;
            
        } while (i<numArcangeles);
        return repetido;

    }
/**
 * this method allows the code to count the quantity of archangels in the code
 * <b>pre:</b> the int and the contado  has to be initialized <br>
 * <b>post:</b> the code knows the quantity of archangels<br>
 * @return the code returns the quantity of archangels.
 */
public int cantidadAngeles(){
    int i=0;
    int contador=0;

    do {if  (arcangeles[i]==null){
        i=numArcangeles;
    }else{
        contador++;
    }
      i++;  
    } while (i<numArcangeles);
    return contador;
    }

/**
 * this method allows the user to get the information of all the celebration of the archangels
 * <b>pre:</b> the int i has to be initializated. <br>
 * <b>post:</b> the information has been given <br>
 * the celebration of the archangels.
 */
public void buscarCelebraciones(){
    int i=0;
    String celebraciones= "";
    do {    
        if  (arcangeles[i]==null){
            i=numArcangeles;
        }else{        
            celebraciones+=arcangeles[i].getNombre()+": "+arcangeles[i].getDia()+" de "+arcangeles[i].getMes()+" ,";
        }
        i++;
     } while (i<numArcangeles);

        System.out.println(" ");      
        System.out.println(celebraciones);
        System.out.println(" ");
    }
}