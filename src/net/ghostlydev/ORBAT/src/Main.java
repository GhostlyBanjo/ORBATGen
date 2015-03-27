package net.ghostlydev.ORBAT.src;

//http://www.nordicnames.de/wiki/Surnames
public class Main {

    public static void main(String[] args) {
	// List of first names
        String firstName[][] = {
                {
                        "Alf", "Aus", "Kro", "For", "Gre", "Ska", "Mar", "Tom", "Bil", "Jeb", "Bjor", "Hel", "Har","Heim", "Fen","Bech","Bla"
                },
                {
                        "gor","strom","stor", "n", "storm", "kus", "mas", "rir", "rer", "kir", "ker", "jar", "aegr","nir","ner","nus","ans"
                }
        };
        String lastName[][] = {
                {
                        "Ahl", "Ahk", "Ahrk", "Hel", "Fro","Erik","Arhik","Gre", "Da","Ra","Or","Khro", "Yul", "Shul","Asp","Alm","Ager", "Bek"
                },
                {
                        "mon", "kul","tross","ork","fin","kom","fus", "ro", "dah", "fur", "far","kuum","strom","storm","berg","qvist","lund", "holm","holt","hus"
                }
        };


        int one = firstName[0].length*firstName[1].length, two = lastName[0].length*lastName[1].length;
            System.out.println(one);
            System.out.println(two);
            System.out.println(one*two);
    }
}
