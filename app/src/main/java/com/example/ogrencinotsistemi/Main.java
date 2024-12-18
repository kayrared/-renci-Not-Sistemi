package com.example.ogrencinotsistemi;

public class Main {

    public static void main(String args[]){


        Teacher t1 = new Teacher("Mahmut Hoca", "+905554442211", "TRH");
        Teacher t2 = new Teacher("Cenk Hoca","05254856214","FZK");
        Teacher t3 = new Teacher("Semih Hoca", "05442578695","MAT");


        Course tarih = new Course ("Tarih", "101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course ("Fizik", "102","FZK");
        fizik.addTeacher(t2);

        Course matematik = new Course ("Matematik", "103","MAT");
        matematik.addTeacher(t3);

        Student s1 = new Student("Mahmut", "1828", "4",tarih ,fizik ,matematik );
        s1.addBulkExamNot(80,70,60);
        s1.addQuizNot(100,100,95);
        s1.issPas();

        Student s2 = new Student("Necmi", "2221", "4",tarih,fizik,matematik);
        s2.addBulkExamNot(50,50,50);
        s2.addQuizNot(50,50,50);
        s2.issPas();


    }
}
