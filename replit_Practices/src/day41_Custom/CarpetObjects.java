package day41_Custom;

import java.util.ArrayList;

public class CarpetObjects {
    public static void main(String[] args) {
       Carpet[] carpets = {new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};
       carpets[0].customOrder(4.5,3.5,7.5,false);
       carpets[1].customOrder(5,4,8,true);
       carpets[2].customOrder(3.9,4,4,true);
       carpets[3].customOrder(6,4.5,8,false);
       carpets[4].customOrder(10,10,3,false);
       /*for (Carpet each:carpets){
           each.getCarpetInfo();
       }  */
        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        ArrayList<Carpet> regularCarpets = new ArrayList<>();
        for(int i = 0;i <= carpets.length-1; i ++){
            if(carpets[i].isPersian){
                persianCarpets.add(carpets[i]);
            }else {
                regularCarpets.add(carpets[i]);
            }
        }
        System.out.println("Number of persian carpets: " +persianCarpets.size());
        System.out.println("Number of non persian carpets: " +regularCarpets.size());

    }
}
