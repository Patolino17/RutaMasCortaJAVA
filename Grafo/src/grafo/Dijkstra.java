

package grafo;

import java.util.*;
import javax.swing.*;

public class Dijkstra {
     ArrayList<ArrayList<ArrayList<Integer>>> city = new ArrayList();
     int[] permanente= new int[17];
     int[] previo=new int[17];
     int[] distancia= new int[17];
     ArrayList<Integer> ruta = new ArrayList();
     String t="\n";
    String name[] = {"International Falls", "Grand Forks", "Bemidji", "Duluth", "Fargo", "St. Cloud", "Mineapolis", "Wausau", "Green Bay", "LaCrosse", "Rochester", "Sioux Falls", "Dubuque", "Madison", "Milwaukee", "Rockford", "Chicago"};
     
    void reseteo(){
        city = new ArrayList();
        ruta = new ArrayList();
        for (int i = 0; i < permanente.length; i++) {
            permanente[i]=previo[i]=distancia[i]=0;
        }
        t="\n";
    } 
    
    void llenado(){
         
         city.add(new ArrayList());
         city.get(0).add(new ArrayList());
         city.get(0).get(0).add(1);
         city.get(0).get(0).add(221);
         
         city.add(new ArrayList());
         city.get(0).add(new ArrayList());
         city.get(0).get(1).add(2);
         city.get(0).get(1).add(111);
         
         city.add(new ArrayList());
         city.get(0).add(new ArrayList());
         city.get(0).get(2).add(3);
         city.get(0).get(2).add(162);
         
         city.add(new ArrayList());
         city.get(1).add(new ArrayList());
         city.get(1).get(0).add(1);
         city.get(1).get(0).add(221);
         
         city.add(new ArrayList());
         city.get(1).add(new ArrayList());
         city.get(1).get(1).add(2);
         city.get(1).get(1).add(112);
         
         city.add(new ArrayList());
         city.get(1).add(new ArrayList());
         city.get(1).get(2).add(4);
         city.get(1).get(2).add(80);
         
         city.add(new ArrayList());
         city.get(2).add(new ArrayList());
         city.get(2).get(0).add(3);
         city.get(2).get(0).add(150);
         
         city.add(new ArrayList());
         city.get(2).add(new ArrayList());
         city.get(2).get(1).add(5);
         city.get(2).get(1).add(153);
         
         city.add(new ArrayList());
         city.get(2).add(new ArrayList());
         city.get(2).get(2).add(0);
         city.get(2).get(2).add(111);
         
         city.add(new ArrayList());
         city.get(2).add(new ArrayList());
         city.get(2).get(3).add(2);
         city.get(2).get(3).add(112);
         
         city.add(new ArrayList());
         city.get(3).add(new ArrayList());
         city.get(3).get(0).add(6);
         city.get(3).get(0).add(154);
         
         city.add(new ArrayList());
         city.get(3).add(new ArrayList());
         city.get(3).get(1).add(0);
         city.get(3).get(1).add(162);
         
         city.add(new ArrayList());
         city.get(3).add(new ArrayList());
         city.get(3).get(2).add(2);
         city.get(3).get(2).add(150);
         
         city.add(new ArrayList());
         city.get(4).add(new ArrayList());
         city.get(4).get(0).add(5);
         city.get(4).get(0).add(172);
         
         city.add(new ArrayList());
         city.get(4).add(new ArrayList());
         city.get(4).get(1).add(11);
         city.get(4).get(1).add(224);
         
         city.add(new ArrayList());
         city.get(4).add(new ArrayList());
         city.get(4).get(2).add(2);
         city.get(4).get(2).add(80);
         
         city.add(new ArrayList());
         city.get(5).add(new ArrayList());
         city.get(5).get(0).add(6);
         city.get(5).get(0).add(66);
         
         city.add(new ArrayList());
         city.get(5).add(new ArrayList());
         city.get(5).get(1).add(2);
         city.get(5).get(1).add(153);
         
         city.add(new ArrayList());
         city.get(5).add(new ArrayList());
         city.get(5).get(2).add(4);
         city.get(5).get(2).add(172);
         
         city.add(new ArrayList());
         city.get(6).add(new ArrayList());
         city.get(6).get(0).add(7);
         city.get(6).get(0).add(185);
         
         city.add(new ArrayList());
         city.get(6).add(new ArrayList());
         city.get(6).get(1).add(9);
         city.get(6).get(1).add(160);
         
         city.add(new ArrayList());
         city.get(6).add(new ArrayList());
         city.get(6).get(2).add(10);
         city.get(6).get(2).add(87);
         
         city.add(new ArrayList());
         city.get(6).add(new ArrayList());
         city.get(6).get(3).add(3);
         city.get(6).get(3).add(152);
         
         city.add(new ArrayList());
         city.get(6).add(new ArrayList());
         city.get(6).get(4).add(5);
         city.get(6).get(4).add(66);
         
         city.add(new ArrayList());
         city.get(7).add(new ArrayList());
         city.get(7).get(0).add(8);
         city.get(7).get(0).add(97);
         
         city.add(new ArrayList());
         city.get(7).add(new ArrayList());
         city.get(7).get(1).add(6);
         city.get(7).get(1).add(185);
         
         city.add(new ArrayList());
         city.get(8).add(new ArrayList());
         city.get(8).get(0).add(9);
         city.get(8).get(0).add(200);
         
         city.add(new ArrayList());
         city.get(8).add(new ArrayList());
         city.get(8).get(1).add(14);
         city.get(8).get(1).add(121);
         
         city.add(new ArrayList());
         city.get(8).add(new ArrayList());
         city.get(8).get(2).add(7);
         city.get(8).get(2).add(97);
         
         city.add(new ArrayList());
         city.get(9).add(new ArrayList());
         city.get(9).get(0).add(10);
         city.get(9).get(0).add(75);
         
         city.add(new ArrayList());
         city.get(9).add(new ArrayList());
         city.get(9).get(1).add(12);
         city.get(9).get(1).add(119);
         
         city.add(new ArrayList());
         city.get(9).add(new ArrayList());
         city.get(9).get(2).add(13);
         city.get(9).get(2).add(142);
         
         city.add(new ArrayList());
         city.get(9).add(new ArrayList());
         city.get(9).get(3).add(6);
         city.get(9).get(3).add(160);
         
         city.add(new ArrayList());
         city.get(9).add(new ArrayList());
         city.get(9).get(4).add(8);
         city.get(9).get(4).add(200);
         
         city.add(new ArrayList());
         city.get(10).add(new ArrayList());
         city.get(10).get(0).add(11);
         city.get(10).get(0).add(254);
         
         city.add(new ArrayList());
         city.get(10).add(new ArrayList());
         city.get(10).get(1).add(12);
         city.get(10).get(1).add(168);
         
         city.add(new ArrayList());
         city.get(10).add(new ArrayList());
         city.get(10).get(2).add(6);
         city.get(10).get(2).add(87);
         
         city.add(new ArrayList());
         city.get(10).add(new ArrayList());
         city.get(10).get(3).add(9);
         city.get(10).get(3).add(75);
         
         city.add(new ArrayList());
         city.get(11).add(new ArrayList());
         city.get(11).get(0).add(4);
         city.get(11).get(0).add(244);
         
         city.add(new ArrayList());
         city.get(11).add(new ArrayList());
         city.get(11).get(1).add(10);
         city.get(11).get(1).add(254);
         
         city.add(new ArrayList());
         city.get(12).add(new ArrayList());
         city.get(12).get(0).add(15);
         city.get(12).get(0).add(93);
         
         city.add(new ArrayList());
         city.get(12).add(new ArrayList());
         city.get(12).get(1).add(9);
         city.get(12).get(1).add(119);
         
         city.add(new ArrayList());
         city.get(12).add(new ArrayList());
         city.get(12).get(2).add(10);
         city.get(12).get(2).add(168);
         
         city.add(new ArrayList());
         city.get(13).add(new ArrayList());
         city.get(13).get(0).add(14);
         city.get(13).get(0).add(79);
         
         city.add(new ArrayList());
         city.get(13).add(new ArrayList());
         city.get(13).get(1).add(15);
         city.get(13).get(1).add(74);
         
         city.add(new ArrayList());
         city.get(13).add(new ArrayList());
         city.get(13).get(2).add(9);
         city.get(13).get(2).add(142);
         
         city.add(new ArrayList());
         city.get(14).add(new ArrayList());
         city.get(14).get(0).add(16);
         city.get(14).get(0).add(92);
         
         city.add(new ArrayList());
         city.get(14).add(new ArrayList());
         city.get(14).get(1).add(8);
         city.get(14).get(1).add(121);
         
         city.add(new ArrayList());
         city.get(14).add(new ArrayList());
         city.get(14).get(2).add(13);
         city.get(14).get(2).add(79);
         
         city.add(new ArrayList());
         city.get(15).add(new ArrayList());
         city.get(15).get(0).add(16);
         city.get(15).get(0).add(89);
         
         city.add(new ArrayList());
         city.get(15).add(new ArrayList());
         city.get(15).get(1).add(12);
         city.get(15).get(1).add(93);
         
         city.add(new ArrayList());
         city.get(15).add(new ArrayList());
         city.get(15).get(2).add(13);
         city.get(15).get(2).add(74);
         
         city.add(new ArrayList());
         city.get(16).add(new ArrayList());
         city.get(16).get(0).add(14);
         city.get(16).get(0).add(92);
         
         city.add(new ArrayList());
         city.get(16).add(new ArrayList());
         city.get(16).get(1).add(15);
         city.get(16).get(1).add(89);
         
         for (int i = 0; i < 17; i++) {
             permanente[i]=0;
             distancia[i]=99999;
             previo[i]=-1;
        }
         
     }
     
     
    void impresion(JTextArea text){
        
        for(int i=0;i<17;i++){
            
            t=t + "\n" + name[i] + "\t|\t";
            for(int j=0;j<city.get(i).size();j++){
                t=t + "(" + name[city.get(i).get(j).get(0)] + "," + city.get(i).get(j).get(1) + ")\t";
            }
            }            
        
        text.setText(t);
    }
    
    int compara(String x){
        int idx=0;
        if (x.equals("Internacional Falls"))
            {idx=0;}
        if (x.equals("Grand Forks"))
            {idx=1;}
        if (x.equals("Bemidji"))
            {idx=2;}
        if (x.equals("Duluth"))
            {idx=3;}
        if (x.equals("Fargo"))
            {idx=4;}
        if (x.equals("St. Cloud"))
            {idx=5;}
        if (x.equals("Minneapolis"))
            {idx=6;}
        if (x.equals("Wausau"))
            {idx=7;}
        if (x.equals("Green Bay"))
            {idx=8;}
        if (x.equals("LaCrosse"))
            {idx=9;}
        if (x.equals("Rochester"))
            {idx=10;}
        if (x.equals("Sioux Falls"))
            {idx=11;}
        if (x.equals("Dubuque"))
            {idx=12;}
        if (x.equals("Madison"))
            {idx=13;}
        if (x.equals("Milwaukee"))
            {idx=14;}
        if (x.equals("Rockford"))
            {idx=15;}
        if (x.equals("Chicago"))
            {idx=16;}
        
        return idx;
    }

    void road(int ver_ini,int ver_fin){
        int ver_act,tem,min=9999;
        distancia[ver_ini]=0;
        ver_act=ver_ini;
        permanente[ver_act]=1;
        while (permanente[ver_fin]==0){
            {for (int i = 0; i < city.get(ver_act).size(); i++) {
                    tem=distancia[ver_act]+city.get(ver_act).get(i).get(1);
       
                    if (distancia[city.get(ver_act).get(i).get(0)] > tem)
                        {distancia[city.get(ver_act).get(i).get(0)] = tem;
                         previo[city.get(ver_act).get(i).get(0)]= ver_act;
                        }
                    }
            for (int i = 0; i < 17; i++) {
                    if (distancia[i]<min && permanente[i]==0)
                       {min=distancia[i];
                        ver_act=i;
                       }    
             }
            min=99999;
            permanente[ver_act]=1;
            }
        }
     ver_act=ver_fin;
     t=t+ "\n\n Ruta \n";
     while(ver_act!=ver_ini)
        {ruta.add(ver_act);
         ver_act=previo[ver_act];
        }
     ruta.add(ver_ini);
     for (int i = ruta.size()-1; i >=0; i--) {
         t=t + "-> " + name[ruta.get(i)];
     }
     
     t=t + "\n\n Distancia: " + distancia[ver_fin];
     
    }
    
    void procesos(String sc,String gc,JTextArea text){
        int idx_s,idx_g;
        idx_s=compara(sc);
        idx_g=compara(gc);
        road(idx_s,idx_g);
        text.setText(t);
        t="";
    }
}
