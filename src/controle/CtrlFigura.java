
package controle;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import modulo.Figura;
import modulo.Pentagono;
import modulo.Quadrado;
import modulo.Retangulo;
import modulo.Trapezio;
import modulo.Triangulo;


public class CtrlFigura {
    
    
    public List<Figura> lerArquivo(String arguivo) throws FileNotFoundException, IOException{
            List<Figura> listaFiguras = new ArrayList<Figura>();           
            BufferedReader br = new BufferedReader(new FileReader(arguivo)); 
         //varrendo a lista do txt para criar a lista de objetos
            
                  
                  
                while(br.ready()){
                String linha = br.readLine();
                String linhaQuebrada[] = linha.split(":");
          int cont=0;
          int  id[] = null;
                  String f[] = null;
                  int  nl[] = null;
                  int  l1[] = null;
                  int  l2[] = null;
                  int l3[] = null;
                  int  l4[] = null;
                  int l5[] = null;
                     int aux=0;
               switch (linhaQuebrada[0]) {
                   
                    case "ID": 
                        if(aux==0){
                              aux=1;
                          id[cont]=Integer.parseInt(linhaQuebrada[1]); 
                             
                        }else{ 
                           cont++;
                             id[cont]=Integer.parseInt(linhaQuebrada[1]);
                            }
                              break;
                    case "F": 
                            f[cont]=linhaQuebrada[1];
                             break;
                    case "NL": 
                           nl[cont]=Integer.parseInt(linhaQuebrada[1]);
                             break;
                    case "L1":
                      l1[cont]=Integer.parseInt(linhaQuebrada[1]);
                        break;
                    case "L2": 
                            l2[cont]=Integer.parseInt(linhaQuebrada[1]);
                        break;
                    case "L3": 
                            l3[cont]=Integer.parseInt(linhaQuebrada[1]);
                        break;
                    case "L4":
                            l4[cont]=Integer.parseInt(linhaQuebrada[1]);
                         break;
                    case "L5":
                         l5[cont]=Integer.parseInt(linhaQuebrada[1]);
                   
                     break;
                      
                   
               }
               for(int i=0;i<cont;i++){
                   if(f[i].compareToIgnoreCase("TRI")==0){
                      Triangulo triangulo=new Triangulo();
                       triangulo.setId(id[i]);
                       triangulo.setF(f[i]);
                       triangulo.setNl(nl[i]);
                       triangulo.setL1(l1[i]);
                       triangulo.setL2(l2[i]);
                       triangulo.setL3(l3[i]);
                       listaFiguras.add(triangulo);
                   }
                   if(f[i].compareToIgnoreCase("QUA")==0){
                      Quadrado quadrado =new Quadrado();
                       quadrado.setId(id[i]);
                       quadrado.setF(f[i]);
                       quadrado.setNl(nl[i]);
                       quadrado.setL1(l1[i]);
                       quadrado.setL2(l2[i]);
                       quadrado.setL3(l3[i]);
                       listaFiguras.add(quadrado);
                   }
                   if(f[i].compareToIgnoreCase("RET")==0){
                      Retangulo retangulo=new Retangulo();
                       retangulo.setId(id[i]);
                       retangulo.setF(f[i]);
                       retangulo.setNl(nl[i]);
                       retangulo.setL1(l1[i]);
                       retangulo.setL2(l2[i]);
                       retangulo.setL3(l3[i]);
                       listaFiguras.add(retangulo);
                   }
                   if(f[i].compareToIgnoreCase("TRA")==0){
                      Trapezio trapezio=new Trapezio();
                       trapezio.setId(id[i]);
                       trapezio.setF(f[i]);
                       trapezio.setNl(nl[i]);
                       trapezio.setL1(l1[i]);
                       trapezio.setL2(l2[i]);
                       trapezio.setL3(l3[i]);
                       listaFiguras.add(trapezio);
                   }
                   if(f[i].compareToIgnoreCase("PEN")==0){
                      Pentagono pentagono=new Pentagono();
                       pentagono.setId(id[i]);
                       pentagono.setF(f[i]);
                       pentagono.setNl(nl[i]);
                       pentagono.setL1(l1[i]);
                       pentagono.setL2(l2[i]);
                       pentagono.setL3(l3[i]);
                       listaFiguras.add(pentagono);
                   }
                   
                   
                   
               }    
               
                   
                    
            
                
    
         
         
         
         
         
             } return listaFiguras;
        }
    }
               
/*int i=0;//  //quebra de string antes da comparação por nao saber o id
             
    }int cont=0; figura[cont];
                     cont++;
        
   int aux=0;      
    while(br.ready()){ 
             String linha = br.readLine();  
             String linhaQuebrada[] = linha.split(":");
        swicth(linhaQuebrada[0]){
         case id:
         if(aux=0){
         aux=1;
         else
         figura[cont];
         cont++;
           Figura figura = new Figura();  
     }
 figura1.setId(Integer.parseInt(linhaQuebrada[1])
         }

            case F;
             figura1.setF(Integer.parseInt(linhaQuebrada[1]);
     if(aux=0){
     aux-1;
     else
     figura[cont];
     cont++;
       Figura figura = new Figura();  
 }
  figura1.setF(Integer.parseInt(linhaQuebrada[1]);
         }


         } }
 public List<Figura> mostrarFiguras() {
        List<Figura> listaFiguras = new ArrayList<Figura>();           
          
                
    
  
        
        return listaFiguras;
    }
    
    }}
                if(linhaQuebrada[0].compareToIgnoreCase("NL")==0){
                   figura1.setNl(Integer.parseInt(linhaQuebrada[1]));//seto o objeto figura com o id da ordem da lista txt 
                listaFiguras.set(0, figura1);   //adicionando objetos a lista criadajogo o contador para 0 para pegar o primeiro objeto
            Figura figura = new Figura();  
                  figura.setId(Integer.parseInt(linhaQuebrada[1]));//seto o objeto figura com o id da ordem da lista txt 
                 listaFiguras.add(figura); while(br.ready()){ //varrendo a lista do txt para setar o tipo de objetos
                
                String linha = br.readLine();  
                String linhaQuebrada[] = linha.split(":");
                
                if(linhaQuebrada[0].compareToIgnoreCase("F")==0){
                     Figura  figura = (Figura) listaFiguras.get(i);
                figura.setF(linhaQuebrada[1]); //seto o primeiro objeto da lista de figuras com o tipo 
                   i++;//incremento para quando retornar no proximo f o objeto ja esta na posição
                                
                }
            }
            int[] pnl = null;
              i=0;    int l=0;//jogo o contador para 0 para pegar o primeiro objeto
            while(br.ready()){ //varrendo a lista do txt para setar o numero de lados do objeto figura.
                
                String linha = br.readLine(); 
                ++l; 
                String linhaQuebrada[] = linha.split(":");
                
                if(linhaQuebrada[0].compareToIgnoreCase("NL")==0){
               pnl[i]=l;//para cada nl eu  marco a posiçao na linha do txt
               
                listaFiguras.get(i).setNl(Integer.parseInt(linhaQuebrada[1])); // seto o primeiro objeto da lista de figuras com n lados  
                   i++;//incremento para quando retornar no proximo f o objeto ja esta na posição
                                
            }
            }
             i=0; l=0;//jogo o contador para 0 para pegar o primeiro objeto
            while(br.ready()){ //varrendo a lista do txt para setar lado 1 da figura
                
                String linha = br.readLine(); 
                String linhaQuebrada[] = linha.split(":");  
                ++l;
                 if(pnl[i]==l){//confirmo posição do numero de lado.
                     
                         } 
                //??
               
              
              
               
               
               
               
               
               }
             
                
        */   
            