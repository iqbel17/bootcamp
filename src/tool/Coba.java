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
     * collections.shuffle dr java
     * @param panjang bertipe int sebagai panjang karakter
     * @return hasil bertipe data string 
     */
    public String unique(int panjang) {

        char[] data = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
        String hasil = "";
        ArrayList<Character> list = new ArrayList<Character>();
        for (int i = 0; i < data.length; i++) {
            list.add(data[i]);
        }
        Collections.shuffle(list);

        for (int i = 0; i < panjang; i++) {
            hasil += list.get(i);
        }
        return hasil;
    }

}
