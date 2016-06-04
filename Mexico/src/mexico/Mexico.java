/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mexico;

import java.util.*;
import javax.swing.*;

public class Mexico {

    ArrayList<ArrayList<ArrayList<Integer>>> city = new ArrayList();
    int[] permanente= new int[31];
    int[] previo=new int[31];
    int[] distancia= new int[31];
    ArrayList<Integer> ruta = new ArrayList();
    String t="\n";
    String name[] = {"Aguascalientes","Baja California","Baja California Sur","Campeche","Chiapas","Chihuahua","Coahuila","Colima","Durango","Mexico","Guanajuato","Querrero","Hidalgo","Jalisco","Michoacan","Morelos","Nayarit","Nuevo Leon","Oaxaca","Puebla","Queretaro","Quintana Roo","San Luis Potosi","Sinaloa","Sonora","Tabasco","Tamaulipas","Tlaxcala","Veracruz","Yucatan","Zacatecas"};
    
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
        city.get(0).get(0).add(10);
        city.get(0).get(0).add(196);
        
        city.add(new ArrayList());
        city.get(0).add(new ArrayList());
        city.get(0).get(1).add(13);
        city.get(0).get(1).add(220);
        
        city.add(new ArrayList());
        city.get(0).add(new ArrayList());
        city.get(0).get(2).add(22);
        city.get(0).get(2).add(166);
        
        city.add(new ArrayList());
        city.get(0).add(new ArrayList());
        city.get(0).get(3).add(30);
        city.get(0).get(3).add(118);
        
        city.add(new ArrayList());
        city.get(1).add(new ArrayList());
        city.get(1).get(0).add(2);
        city.get(1).get(0).add(1359);
        
        city.add(new ArrayList());
        city.get(1).add(new ArrayList());
        city.get(1).get(1).add(24);
        city.get(1).get(1).add(703);
        
        city.add(new ArrayList());
        city.get(2).add(new ArrayList());
        city.get(2).get(0).add(1);
        city.get(2).get(0).add(1359);
        
        city.add(new ArrayList());
        city.get(3).add(new ArrayList());
        city.get(3).get(0).add(21);
        city.get(3).get(0).add(421);
        
        city.add(new ArrayList());
        city.get(3).add(new ArrayList());
        city.get(3).get(1).add(25);
        city.get(3).get(1).add(383);
        
        city.add(new ArrayList());
        city.get(3).add(new ArrayList());
        city.get(3).get(2).add(29);
        city.get(3).get(2).add(176);
        
        city.add(new ArrayList());
        city.get(4).add(new ArrayList());
        city.get(4).get(0).add(18);
        city.get(4).get(0).add(540);
        
        city.add(new ArrayList());
        city.get(4).add(new ArrayList());
        city.get(4).get(1).add(25);
        city.get(4).get(1).add(248);
        
        city.add(new ArrayList());
        city.get(5).add(new ArrayList());
        city.get(5).get(0).add(6);
        city.get(5).get(0).add(728);
        
        city.add(new ArrayList());
        city.get(5).add(new ArrayList());
        city.get(5).get(1).add(8);
        city.get(5).get(1).add(688);
        
        city.add(new ArrayList());
        city.get(5).add(new ArrayList());
        city.get(5).get(2).add(24);
        city.get(5).get(2).add(692);
        
        city.add(new ArrayList());
        city.get(6).add(new ArrayList());
        city.get(6).get(0).add(5);
        city.get(6).get(0).add(728);
        
        city.add(new ArrayList());
        city.get(6).add(new ArrayList());
        city.get(6).get(1).add(17);
        city.get(6).get(1).add(88);
        
        city.add(new ArrayList());
        city.get(6).add(new ArrayList());
        city.get(6).get(2).add(22);
        city.get(6).get(2).add(448);
        
        city.add(new ArrayList());
        city.get(7).add(new ArrayList());
        city.get(7).get(0).add(13);
        city.get(7).get(0).add(195);
        
        city.add(new ArrayList());
        city.get(7).add(new ArrayList());
        city.get(7).get(1).add(14);
        city.get(7).get(1).add(482);
        
        city.add(new ArrayList());
        city.get(8).add(new ArrayList());
        city.get(8).get(0).add(5);
        city.get(8).get(0).add(688);
        
        city.add(new ArrayList());
        city.get(8).add(new ArrayList());
        city.get(8).get(1).add(16);
        city.get(8).get(1).add(468);
        
        city.add(new ArrayList());
        city.get(8).add(new ArrayList());
        city.get(8).get(2).add(23);
        city.get(8).get(2).add(465);
        
        city.add(new ArrayList());
        city.get(8).add(new ArrayList());
        city.get(8).get(3).add(30);
        city.get(8).get(3).add(290);
        
        city.add(new ArrayList());
        city.get(9).add(new ArrayList());
        city.get(9).get(0).add(11);
        city.get(9).get(0).add(288);
        
        city.add(new ArrayList());
        city.get(9).add(new ArrayList());
        city.get(9).get(1).add(12);
        city.get(9).get(1).add(151);
        
        city.add(new ArrayList());
        city.get(9).add(new ArrayList());
        city.get(9).get(2).add(15);
        city.get(9).get(2).add(136);
        
        city.add(new ArrayList());
        city.get(9).add(new ArrayList());
        city.get(9).get(3).add(20);
        city.get(9).get(3).add(196);
        
        city.add(new ArrayList());
        city.get(10).add(new ArrayList());
        city.get(10).get(0).add(0);
        city.get(10).get(0).add(196);
        
        city.add(new ArrayList());
        city.get(10).add(new ArrayList());
        city.get(10).get(1).add(14);
        city.get(10).get(1).add(179);
        
        city.add(new ArrayList());
        city.get(10).add(new ArrayList());
        city.get(10).get(2).add(20);
        city.get(10).get(2).add(148);
        
        city.add(new ArrayList());
        city.get(10).add(new ArrayList());
        city.get(10).get(3).add(22);
        city.get(10).get(3).add(206);
        
        city.add(new ArrayList());
        city.get(11).add(new ArrayList());
        city.get(11).get(0).add(9);
        city.get(11).get(0).add(288);
        
        city.add(new ArrayList());
        city.get(11).add(new ArrayList());
        city.get(11).get(1).add(14);
        city.get(11).get(1).add(535);
        
        city.add(new ArrayList());
        city.get(11).add(new ArrayList());
        city.get(11).get(2).add(15);
        city.get(11).get(2).add(187);
        
        city.add(new ArrayList());
        city.get(11).add(new ArrayList());
        city.get(11).get(3).add(18);
        city.get(11).get(3).add(561);
        
        city.add(new ArrayList());
        city.get(12).add(new ArrayList());
        city.get(12).get(0).add(9);
        city.get(12).get(0).add(151);
        
        city.add(new ArrayList());
        city.get(12).add(new ArrayList());
        city.get(12).get(1).add(20);
        city.get(12).get(1).add(222);
        
        city.add(new ArrayList());
        city.get(12).add(new ArrayList());
        city.get(12).get(2).add(27);
        city.get(12).get(2).add(125);
        
        city.add(new ArrayList());
        city.get(13).add(new ArrayList());
        city.get(13).get(0).add(0);
        city.get(13).get(0).add(220);
        
        city.add(new ArrayList());
        city.get(13).add(new ArrayList());
        city.get(13).get(1).add(7);
        city.get(13).get(1).add(195);
        
        city.add(new ArrayList());
        city.get(13).add(new ArrayList());
        city.get(13).get(2).add(14);
        city.get(13).get(2).add(288);
        
        city.add(new ArrayList());
        city.get(13).add(new ArrayList());
        city.get(13).get(3).add(16);
        city.get(13).get(3).add(211);
        
        city.add(new ArrayList());
        city.get(14).add(new ArrayList());
        city.get(14).get(0).add(7);
        city.get(14).get(0).add(482);
        
        city.add(new ArrayList());
        city.get(14).add(new ArrayList());
        city.get(14).get(1).add(10);
        city.get(14).get(1).add(179);
        
        city.add(new ArrayList());
        city.get(14).add(new ArrayList());
        city.get(14).get(2).add(11);
        city.get(14).get(2).add(535);
        
        city.add(new ArrayList());
        city.get(14).add(new ArrayList());
        city.get(14).get(3).add(13);
        city.get(14).get(3).add(288);
        
        city.add(new ArrayList());
        city.get(14).add(new ArrayList());
        city.get(14).get(4).add(20);
        city.get(14).get(4).add(189);
        
        city.add(new ArrayList());
        city.get(15).add(new ArrayList());
        city.get(15).get(0).add(9);
        city.get(15).get(0).add(136);
        
        city.add(new ArrayList());
        city.get(15).add(new ArrayList());
        city.get(15).get(1).add(11);
        city.get(15).get(1).add(187);
        
        city.add(new ArrayList());
        city.get(15).add(new ArrayList());
        city.get(15).get(2).add(19);
        city.get(15).get(2).add(156);
        
        city.add(new ArrayList());
        city.get(16).add(new ArrayList());
        city.get(16).get(0).add(8);
        city.get(16).get(0).add(468);
        
        city.add(new ArrayList());
        city.get(16).add(new ArrayList());
        city.get(16).get(1).add(13);
        city.get(16).get(1).add(211);
        
        city.add(new ArrayList());
        city.get(17).add(new ArrayList());
        city.get(17).get(0).add(6);
        city.get(17).get(0).add(88);
        
        city.add(new ArrayList());
        city.get(17).add(new ArrayList());
        city.get(17).get(1).add(22);
        city.get(17).get(1).add(514);
        
        city.add(new ArrayList());
        city.get(17).add(new ArrayList());
        city.get(17).get(2).add(26);
        city.get(17).get(2).add(284);
        
        city.add(new ArrayList());
        city.get(18).add(new ArrayList());
        city.get(18).get(0).add(4);
        city.get(18).get(0).add(540);
        
        city.add(new ArrayList());
        city.get(18).add(new ArrayList());
        city.get(18).get(1).add(11);
        city.get(18).get(1).add(561);
        
        city.add(new ArrayList());
        city.get(18).add(new ArrayList());
        city.get(18).get(2).add(19);
        city.get(18).get(2).add(342);
        
        city.add(new ArrayList());
        city.get(18).add(new ArrayList());
        city.get(18).get(3).add(28);
        city.get(18).get(3).add(431);
        
        city.add(new ArrayList());
        city.get(19).add(new ArrayList());
        city.get(19).get(0).add(15);
        city.get(19).get(0).add(156);
        
        city.add(new ArrayList());
        city.get(19).add(new ArrayList());
        city.get(19).get(1).add(18);
        city.get(19).get(1).add(342);
        
        city.add(new ArrayList());
        city.get(19).add(new ArrayList());
        city.get(19).get(2).add(27);
        city.get(19).get(2).add(42);
        
        city.add(new ArrayList());
        city.get(19).add(new ArrayList());
        city.get(19).get(3).add(28);
        city.get(19).get(3).add(173);
        
        city.add(new ArrayList());
        city.get(20).add(new ArrayList());
        city.get(20).get(0).add(9);
        city.get(20).get(0).add(196);
        
        city.add(new ArrayList());
        city.get(20).add(new ArrayList());
        city.get(20).get(1).add(10);
        city.get(20).get(1).add(148);
        
        city.add(new ArrayList());
        city.get(20).add(new ArrayList());
        city.get(20).get(2).add(12);
        city.get(20).get(2).add(222);
        
        city.add(new ArrayList());
        city.get(20).add(new ArrayList());
        city.get(20).get(3).add(14);
        city.get(20).get(3).add(189);
        
        city.add(new ArrayList());
        city.get(21).add(new ArrayList());
        city.get(21).get(0).add(3);
        city.get(21).get(0).add(421);
        
        city.add(new ArrayList());
        city.get(21).add(new ArrayList());
        city.get(21).get(1).add(29);
        city.get(21).get(1).add(391);
        
        city.add(new ArrayList());
        city.get(22).add(new ArrayList());
        city.get(22).get(0).add(0);
        city.get(22).get(0).add(166);
        
        city.add(new ArrayList());
        city.get(22).add(new ArrayList());
        city.get(22).get(1).add(6);
        city.get(22).get(1).add(448);
        
        city.add(new ArrayList());
        city.get(22).add(new ArrayList());
        city.get(22).get(2).add(17);
        city.get(22).get(2).add(514);
        
        city.add(new ArrayList());
        city.get(22).add(new ArrayList());
        city.get(22).get(3).add(10);
        city.get(22).get(3).add(206);
        
        city.add(new ArrayList());
        city.get(22).add(new ArrayList());
        city.get(22).get(4).add(26);
        city.get(22).get(4).add(333);
        
        city.add(new ArrayList());
        city.get(23).add(new ArrayList());
        city.get(23).get(0).add(8);
        city.get(23).get(0).add(465);
        
        city.add(new ArrayList());
        city.get(23).add(new ArrayList());
        city.get(23).get(1).add(24);
        city.get(23).get(1).add(701);
        
        city.add(new ArrayList());
        city.get(24).add(new ArrayList());
        city.get(24).get(0).add(1);
        city.get(24).get(0).add(703);
        
        city.add(new ArrayList());
        city.get(24).add(new ArrayList());
        city.get(24).get(1).add(5);
        city.get(24).get(1).add(692);
        
        city.add(new ArrayList());
        city.get(24).add(new ArrayList());
        city.get(24).get(2).add(23);
        city.get(24).get(2).add(701);
        
        city.add(new ArrayList());
        city.get(25).add(new ArrayList());
        city.get(25).get(0).add(3);
        city.get(25).get(0).add(383);
        
        city.add(new ArrayList());
        city.get(25).add(new ArrayList());
        city.get(25).get(1).add(4);
        city.get(25).get(1).add(248);
        
        city.add(new ArrayList());
        city.get(25).add(new ArrayList());
        city.get(25).get(2).add(28);
        city.get(25).get(2).add(563);
        
        city.add(new ArrayList());
        city.get(26).add(new ArrayList());
        city.get(26).get(0).add(17);
        city.get(26).get(0).add(284);
        
        city.add(new ArrayList());
        city.get(26).add(new ArrayList());
        city.get(26).get(1).add(22);
        city.get(26).get(1).add(333);
        
        city.add(new ArrayList());
        city.get(26).add(new ArrayList());
        city.get(26).get(2).add(28);
        city.get(26).get(2).add(751);
        
        city.add(new ArrayList());
        city.get(27).add(new ArrayList());
        city.get(27).get(0).add(12);
        city.get(27).get(0).add(125);
        
        city.add(new ArrayList());
        city.get(27).add(new ArrayList());
        city.get(27).get(1).add(19);
        city.get(27).get(1).add(42);
        
        city.add(new ArrayList());
        city.get(28).add(new ArrayList());
        city.get(28).get(0).add(18);
        city.get(28).get(0).add(431);
        
        city.add(new ArrayList());
        city.get(28).add(new ArrayList());
        city.get(28).get(1).add(19);
        city.get(28).get(1).add(173);
        
        city.add(new ArrayList());
        city.get(28).add(new ArrayList());
        city.get(28).get(2).add(25);
        city.get(28).get(2).add(563);
        
        city.add(new ArrayList());
        city.get(28).add(new ArrayList());
        city.get(28).get(3).add(26);
        city.get(28).get(3).add(751);
        
        city.add(new ArrayList());
        city.get(29).add(new ArrayList());
        city.get(29).get(0).add(3);
        city.get(29).get(0).add(176);
        
        city.add(new ArrayList());
        city.get(29).add(new ArrayList());
        city.get(29).get(1).add(21);
        city.get(29).get(1).add(391);
        
        city.add(new ArrayList());
        city.get(30).add(new ArrayList());
        city.get(30).get(0).add(0);
        city.get(30).get(0).add(118);
        
        city.add(new ArrayList());
        city.get(30).add(new ArrayList());
        city.get(30).get(1).add(8);
        city.get(30).get(1).add(290);
        
        for (int i = 0; i < 31; i++) {
             permanente[i]=0;
             distancia[i]=99999;
             previo[i]=-1;
        }
        
    }
    
    void impresion(JTextArea text){
        
        for(int i=0;i<31;i++){
            
            t=t + "\n" + name[i] + "\t|\t";
            for(int j=0;j<city.get(i).size();j++){
                t=t + "(" + name[city.get(i).get(j).get(0)] + "," + city.get(i).get(j).get(1) + ")\t";
            }
            }            
        
        text.setText(t);
    }
    
    int compara(String x){
        int idx=0;
        if (x.equals("Aguascalientes"))
            {idx=0;}
        if (x.equals("Baja California"))
            {idx=1;}
        if (x.equals("Baja California Sur"))
            {idx=2;}
        if (x.equals("Campeche"))
            {idx=3;}
        if (x.equals("Chiapas"))
            {idx=4;}
        if (x.equals("Chihuahua"))
            {idx=5;}
        if (x.equals("Coahuila"))
            {idx=6;}
        if (x.equals("Colima"))
            {idx=7;}
        if (x.equals("Durango"))
            {idx=8;}
        if (x.equals("Mexico"))
            {idx=9;}
        if (x.equals("Guanajuato"))
            {idx=10;}
        if (x.equals("Guerrero"))
            {idx=11;}
        if (x.equals("Hidalgo"))
            {idx=12;}
        if (x.equals("Jalisco"))
            {idx=13;}
        if (x.equals("Michoacan"))
            {idx=14;}
        if (x.equals("Morelos"))
            {idx=15;}
        if (x.equals("Nayarit"))
            {idx=16;}
        if (x.equals("Nuevo Leon"))
            {idx=17;}
        if (x.equals("Oaxaca"))
            {idx=18;}
        if (x.equals("Puebla"))
            {idx=19;}
        if (x.equals("Queretaro"))
            {idx=20;}
        if (x.equals("Quintana Roo"))
            {idx=21;}
        if (x.equals("San Luis Potosi"))
            {idx=22;}
        if (x.equals("Sinaloa"))
            {idx=23;}
        if (x.equals("Sonora"))
            {idx=24;}
        if (x.equals("Tabasco"))
            {idx=25;}
        if (x.equals("Tamaulipas"))
            {idx=26;}
        if (x.equals("Tlaxcala"))
            {idx=27;}
        if (x.equals("Veracruz"))
            {idx=28;}
        if (x.equals("Yucatan"))
            {idx=29;}
        if (x.equals("Zacatecas"))
            {idx=30;}
        
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
            for (int i = 0; i < 31; i++) {
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
