
package view;
import controle.CtrlFigura;
 import java.io.*;
import java.util.List;
import java.lang.String;
import modulo.Figura;

public class Trabalho {

    public static void main(String[]args) throws FileNotFoundException, IOException{
      CtrlFigura controle =new CtrlFigura();
       System.out.println("1) Faça um programa que leia o arquivo TXT e insira as figuras em uma lista.");
         System.out.println("Lista de Figuras");
         System.out.println("|ID |F    |NL  |L1  |L2 |L3 |L4 |L5 |");
          List listaFiguras = controle.lerArquivo("c:/DadosFiguras.txt"); 
         
                for (int i = 0; i < listaFiguras.size(); i++) {
                    Figura  figura = (Figura) listaFiguras.get(i);
                    
                      System.out.print( figura.getId()+"    ");
                      System.out.print( figura.getF()+"    ");
                      System.out.print( figura.getNl()+"    ");
                    System.out.print( figura.getL1()+"    ");
                     System.out.print( figura.getL2()+"    ");
                     System.out.print( figura.getL3()+"    ");
                     System.out.print( figura.getL4()+"    ");
                   System.out.print( figura.getL5()+"    ");
                     
                   System.out.println("");  
                }
               
System.out.println("2) Depois de inseridos na lista, mostre na tela o cálculo de suas áreas.");
        
System.out.println("3) Se a forma pentágono (PEN) for inserida no arquivo , altere a implementação para adicionar a funcionalidade.");
System.out.println("3) Se o usuário quiser, para os triângulos, classificá-los em equilátero, isósceles e escaleno.Como implementar esta funcionalidade?");
     
    }}