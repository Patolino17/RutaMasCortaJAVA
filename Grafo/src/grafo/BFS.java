/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package grafo;
import java.util.*;
import javax.swing.JTextArea;
/**
 *
 * @author asus
 */
public class BFS {
    ArrayList<ArrayList<Integer>> city = new ArrayList();
    String t="\n";
    String name[] = {"International Falls", "Grand Forks", "Bemidji", "Duluth", "Fargo", "St. Cloud", "Mineapolis", "Wausau", "Green Bay", "LaCrosse", "Rochester", "Sioux Falls", "Dubuque", "Madison", "Milwaukee", "Rockford", "Chicago"};
    ArrayList<Integer> fila = new ArrayList();
    int visit[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    ArrayList<Integer> hijos = new ArrayList();
    
    void reseteo(){
        city = new ArrayList();
        t="\n";
        fila = new ArrayList();
        for (int i = 0; i < visit.length; i++) {
            visit[i]=0;
        }
        hijos = new ArrayList();
    }
    
    
    void llenado(){
        city.add(new ArrayList());
        city.get(0).add(1);
        city.get(0).add(2);
        city.get(0).add(3);
        city.add(new ArrayList());
        city.get(1).add(0);
        city.get(1).add(2);
        city.get(1).add(4);
        city.add(new ArrayList());
        city.get(2).add(0);
        city.get(2).add(1);
        city.get(2).add(3);
        city.get(2).add(5);
        city.add(new ArrayList());
        city.get(3).add(0);
        city.get(3).add(2);
        city.get(3).add(6);
        city.add(new ArrayList());
        city.get(4).add(1);
        city.get(4).add(5);
        city.get(4).add(11);
        city.add(new ArrayList());
        city.get(5).add(2);
        city.get(5).add(4);
        city.get(5).add(6);
        city.add(new ArrayList());
        city.get(6).add(3);
        city.get(6).add(5);
        city.get(6).add(7);
        city.get(6).add(9);
        city.get(6).add(10);
        city.add(new ArrayList());
        city.get(7).add(6);
        city.get(7).add(8);
        city.add(new ArrayList());
        city.get(8).add(7);
        city.get(8).add(9);
        city.get(8).add(14);
        city.add(new ArrayList());
        city.get(9).add(6);
        city.get(9).add(8);
        city.get(9).add(10);
        city.get(9).add(12);
        city.get(9).add(13);
        city.add(new ArrayList());
        city.get(10).add(6);
        city.get(10).add(9);
        city.get(10).add(11);
        city.get(10).add(12);
        city.add(new ArrayList());
        city.get(11).add(4);
        city.get(11).add(10);
        city.add(new ArrayList());
        city.get(12).add(9);
        city.get(12).add(10);
        city.get(12).add(15);
        city.add(new ArrayList());
        city.get(13).add(9);
        city.get(13).add(14);
        city.get(13).add(15);
        city.add(new ArrayList());
        city.get(14).add(8);
        city.get(14).add(13);
        city.get(14).add(16);
        city.add(new ArrayList());
        city.get(15).add(12);
        city.get(15).add(13);
        city.get(15).add(16);
        city.add(new ArrayList());
        city.get(16).add(14);
        city.get(16).add(15);
    }
    
    void impresion(JTextArea text){
        for(int i=0;i<city.size();i++){
            t=t + "\n" + name[i] + "\t|";
            for(int j=0;j<city.get(i).size();j++){  
                t=t + " " + name[city.get(i).get(j)] + "-";
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
        if (x.equals("Mineapolis"))
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
    
    
    void proceso(String sc,String gc,JTextArea text){
        int cont=0, ver_act,idx_s,idx_g;
        idx_s=compara(sc);
        idx_g=compara(gc);
        hijos.add(0);
        visit[idx_s]=1;
        t=t + "\n\n BFS";
        fila.add(idx_s);
        while (!fila.isEmpty() && cont < 17)
            {System.out.println(fila.get(0));
             ver_act= fila.get(0);
                System.out.println(hijos.get(0));
             t = t + "\n Nivel " + hijos.get(0) + " "+ name[ver_act] + " ";
             if (ver_act==idx_g)
                {cont=17;}
             cont++;
             for (int i = 0; i < city.get(fila.get(0)).size(); i++) {
                    if (visit[city.get(fila.get(0)).get(i)]==0)
                        {fila.add(city.get(fila.get(0)).get(i));
                         visit[city.get(fila.get(0)).get(i)]=1;
                         hijos.add(hijos.get(0)+1);
                        }
                }
             fila.remove(0);
             hijos.remove(0);
            }
        text.setText(t);
        t="";
    }
    
    
}
