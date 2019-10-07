package ui;

import model.*;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

/**
     * this is class runs the program
     */
public class LaboratorioAngeles{
    public static void main(String[] args){
    TopLegion maxima;
    Scanner dato;
    int numAngeles;

        String nom;
        String ora;
        int diaMain;
        String mesMain;
        String pod;
        String fot;
        int posi;        
        String ese;
        String col;
        int grado;
        int tam;
        String respuesta;
    dato=new Scanner(System.in);

    System.out.println("enter the number of archangels");
        numAngeles= dato.nextInt();

        
        maxima= new TopLegion(numAngeles);
        dato= new Scanner(System.in);
        int i=0;
        int j=1;
        do{
            if (i==0) {
                maxima.crearArcangeles("Rafael", "prayer for all the days", 24, "Sept", "Tranquility", 0,"white", "lavender", 9,10,"Desktop foto 1");
                maxima.buscarDadoNombre("Rafael");;;
                System.out.println("there is already a archangel created, would you like tyo create more?(YES/NO)");
                respuesta=dato.nextLine();
                if(respuesta.equalsIgnoreCase("NO")){
                  i=numAngeles;
                }
            } else {
                
            System.out.println("enter the name of the archangel number "+j);
            nom=dato.nextLine();
            if (maxima.validarNombreRepetido(nom)) {
                System.out.println("this name already exists, try again with another name");
                i--;
                j--; 
            } else { if(maxima.validarTerminaEl(nom)){

                System.out.println("enter the prayer of the archangel number "+j);
            ora=dato.nextLine();
            System.out.println("enter the special powwer of the archangel number "+j);
            pod=dato.nextLine();
            if(maxima.validarPoderRepetido(pod)){ 
                System.out.println("this power already exists, try again with another power");
            i--;
            j--; 
        }else{

            System.out.println("enter the month of celebration of the archangel number "+j);
            mesMain=dato.nextLine();
            System.out.println("enter the day of celebration of the archangel number  "+j);
            diaMain=Integer.parseInt(dato.nextLine());
            System.out.println("enter the picture of the archangel number  "+j);
            fot=dato.nextLine();
            System.out.println("enter the essence of the candle of the archangel number "+j);
            ese=dato.nextLine();
            System.out.println("enter the color of the candle of the archangel number "+j);
            col=dato.nextLine();
            System.out.println("enter the ilumination grade of the candle of the archangel number  "+j);
            grado=Integer.parseInt(dato.nextLine());
            System.out.println("enter the size of the candle of the archangel number "+j);
            grado=Integer.parseInt(dato.nextLine());
            tam=i;
            maxima.crearArcangeles(nom, ora, diaMain, mesMain, pod, i, col, ese, grado,tam,fot);
            
        }
            } else{
                System.out.println(" the name of the archangel must end with the syllable -el");
                i--;
                j--; 
            }
                
            }
             
            }
            i++;
            j++;  
        }while(i<numAngeles);

       
        int opciones=0;
        

        do {
            System.out.println("you have finished, what would you like to do ");
            System.out.println("Select one of the following options:");
            System.out.println("1. serch information of the archangel by the name");
            System.out.println("2. serch information od the archangel by the power");
            System.out.println("3. count the quantity of archangels");
            System.out.println("4. serch celebrations date by a month");
            System.out.println("5. serch all the celebrations");
            System.out.println("6. exit the code");
            opciones=Integer.parseInt(dato.nextLine());
            if(opciones==1){
                System.out.println("enter the name of the archangel you would like to search");
                nom=dato.nextLine();
                maxima.buscarDadoNombre(nom);
                opciones=0;
            } else if(opciones==2){
                System.out.println("enter the power of the archangel you would like to search");
                pod=dato.nextLine();
                maxima.buscarDadoPoder(pod);
                opciones=0;
            } else if(opciones==3){
                System.out.println("the quantity of archangels created is : "+maxima.cantidadAngeles());
                opciones=0;
            }
            else if(opciones==4){
                System.out.println("enter the month you would like to search ");
                mesMain=dato.nextLine();
                maxima.buscarCelebracionesMes(mesMain);;
                opciones=0;
            }
            else if(opciones==5){
                maxima.buscarCelebraciones();;
                opciones=0;
            }
            else if(opciones==6){
                opciones=8;
            }
            
        } while (opciones<6);
    }


}