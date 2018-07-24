/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author iqbael17
 */
public class Coba {

    /**
     * membuat fungsi random unique dengan panjang tertentu meggunakan fungsi
     * collections.shuffle
     * @param panjang bertipe int sebagai panjang karakter
     * @return hasil
     */
    public String unique(int panjang) {

        char[] c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
        String hasil = "";
        ArrayList<Character> list = new ArrayList<Character>();
        for (int i = 0; i < c.length; i++) {
            list.add(c[i]);
        }
        Collections.shuffle(list);

        for (int i = 0; i < panjang; i++) {
            
            hasil += list.get(i);
        
        }
        return hasil;
    }

}
