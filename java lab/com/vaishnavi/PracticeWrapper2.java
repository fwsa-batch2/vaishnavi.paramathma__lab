package com.vaishnavi;

public class PracticeWrapper2 {
    public static void main(String[] args) {
        int a=5;
        double b=6.6;
        long c=1361242384787L;
        char d='a';
        Integer aobj= Integer.valueOf(a);
        Double bobj = Double.valueOf(b);
        Long cobj = Long.valueOf(c);
        Character dobj = Character.valueOf(d);
        if(aobj instanceof Integer){
            System.out.println("an obj is integer");
        }
        if(bobj instanceof Double){
            System.out.println("an obj is double");
        }
        if(cobj instanceof Long){
            System.out.println("an obj is long");
        }
        if(dobj instanceof Character){
            System.out.println("an obj is charcter");
        }
    }
}
