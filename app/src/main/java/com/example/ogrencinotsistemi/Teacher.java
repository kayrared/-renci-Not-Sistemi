package com.example.ogrencinotsistemi;

public class Teacher {

    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch){
      this.name = name;
      this.mpno = mpno;
      this.branch = branch;
    }

    void print(){
        System.out.println("Adı Soyadı       :"+this.name);
        System.out.println("Telefon numarası :"+this.mpno);
        System.out.println("Dersin Kodu      :"+this.branch);
    }
}
