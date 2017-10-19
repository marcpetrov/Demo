package com.marcpetrov;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Demo!");


        String s = null;

        //System.out.println(s);

        String [] titles ={"William", "Beatrice", "Lucy", "Sam"};
        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        //for(int i = 0; i < chars.length; i++){
        for(String name : titles){
            //System.out.println(chars[i]);
            System.out.println(name);
        }

        char lastChar = chars[chars.length - 1];
        System.out.println(lastChar);

        System.out.println("Finish!");

    }
}
