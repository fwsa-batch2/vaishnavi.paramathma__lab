package com.vaishnavi;

public class user{
    private int animalNo;
    private String animalName;

public void setAnimalNo(int animalNo) {  // setAnimalNo(___)
    this.animalNo = animalNo;
}
public int getAnimalNo() {
    return animalNo;
}
public String getAnimalName() {
    return animalName;
}
public void setAnimalName(String animalName) {
    this.animalName = animalName;

}
public static void main(String[] args){
 user obj = new user();
      obj.setAnimalNo(87);
      obj.setAnimalName("zebra");

 System.out.println(obj.getAnimalNo());
 System.out.println(obj.getAnimalName());
}
}
