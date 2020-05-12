package com.thiagowill.services;

/**
 *
 * @author thiago
 */
public class Comparator {

    //Recebe duas strings e as compara removendo os espaços e caracteres maiúsculo.
    public static boolean compareWithoutSpace(String string1, String string2) {

        String[] phrase1, phrase2;

        phrase1 = string1.toLowerCase().split(" ");
        phrase2 = string2.toLowerCase().split(" ");

        String word1 = "";
        String word2 = "";

        for (String c : phrase1) {

            word1 += c;

        }
        for (String c : phrase2) {
            word2 += c;
        }

        if (word1.equals(word2)) {
            return true;
        } else {
            return false;
        }

    }//---

    // recebe duas String de argumento e retorna verdadeiro se os argumentos
    //tiverem alguma palavra igual(não ignora caractere maiúsculo);
    public static boolean contains(String str, String str2) {

        String[] vet1 = str.split(" ");
        String[] vet2 = str2.split(" ");

        for (String s : vet1) {
            for (String s2 : vet2) {
                if (s.equals(s2)) {
                    return true;
                }
            }
        }

        return false;

    }//---

    
    // recebe duas String de argumento e retorna verdadeiro se os argumentos
    //tiverem alguma palavra igual( ignora caractere maiúsculo);
    public static boolean contaisIgnoreCase(String str, String str2) {
        
        String[] vet1 = str.split(" ");
        String[] vet2 = str2.split(" ");

        for (String s : vet1) {
            for (String s2 : vet2) {
                if (compareWithoutSpace(s,s2)) {
                    return true;
                }
            }
        }

        return false;
        
    }//---

    
    
}
