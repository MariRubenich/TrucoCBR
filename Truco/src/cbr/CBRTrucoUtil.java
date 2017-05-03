/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbr;

/**
 *
 * @author Felipe
 */
public class CBRTrucoUtil {
    
    public static Integer getCardValue(String valor, String naipe){
        if("Espada".equals(naipe)){
            if("A".equals(valor) || "a".equals(valor) || "1".equals(valor))
                return 14;
            if("2".equals(valor))
                return 9;
            if("3".equals(valor))
                return 10;
            if("4".equals(valor))
                return 1;
            if("5".equals(valor))
                return 2;
            if("6".equals(valor))
                return 3;
            if("7".equals(valor))
                return 12;
            if("10".equals(valor))
                return 5;
            if("11".equals(valor))
                return 6;
            if("12".equals(valor))
                return 7;
        }
        if("Basto".equals(naipe)){
            if("A".equals(valor) || "a".equals(valor) || "1".equals(valor))
                return 13;
            if("2".equals(valor))
                return 9;
            if("3".equals(valor))
                return 10;
            if("4".equals(valor))
                return 1;
            if("5".equals(valor))
                return 2;
            if("6".equals(valor))
                return 3;
            if("7".equals(valor))
                return 4;
            if("10".equals(valor))
                return 5;
            if("11".equals(valor))
                return 6;
            if("12".equals(valor))
                return 7;
        }
        if("Ouro".equals(naipe)){
            if("A".equals(valor) || "a".equals(valor) || "1".equals(valor))
                return 8;
            if("2".equals(valor))
                return 9;
            if("3".equals(valor))
                return 10;
            if("4".equals(valor))
                return 1;
            if("5".equals(valor))
                return 2;
            if("6".equals(valor))
                return 3;
            if("7".equals(valor))
                return 11;
            if("10".equals(valor))
                return 5;
            if("11".equals(valor))
                return 6;
            if("12".equals(valor))
                return 7;
        }
        if("Copa".equals(naipe)){
            if("A".equals(valor) || "a".equals(valor) || "1".equals(valor))
                return 8;
            if("2".equals(valor))
                return 9;
            if("3".equals(valor))
                return 10;
            if("4".equals(valor))
                return 1;
            if("5".equals(valor))
                return 2;
            if("6".equals(valor))
                return 3;
            if("7".equals(valor))
                return 4;
            if("10".equals(valor))
                return 5;
            if("11".equals(valor))
                return 6;
            if("12".equals(valor))
                return 7;
        }
        
        return null;
    }
}
