package com.example.ogrencinotsistemi;

public class Student {

    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;

    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c1.quiz = c1.quiz;
        this.c2 = c2;
        this.c2.quiz = c2.quiz;
        this.c3 = c3;
        this.c3.quiz = c3.quiz;

        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNot(int note1, int note2, int note3){
        if (note1 >= 0 && note1 <= 100){
            this.c1.note = note1;
            this.c1.note *= 0.80;
        }
        if (note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
            this.c2.note *= 0.80;
        }
        if (note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
            this.c3.note *= 0.80;
        }

    }
    void addQuizNot(int quiz1, int quiz2, int quiz3){
        if (quiz1 >= 0 && quiz1 <= 100){
            this.c1.quiz = quiz1;
            this.c1.quiz *= 0.20;
        }
        if (quiz2 >= 0 && quiz2 <= 100){
            this.c2.quiz = quiz2;
            this.c2.quiz *= 0.20;
        }
        if (quiz3 >= 0 && quiz3 <= 100){
            this.c3.quiz = quiz3;
            this.c3.quiz *= 0.20;
        }

    }

    void issPas(){

        System.out.println("============================");
        this.avarage = (this.c1.note + this.c1.quiz + this.c2.note + this.c2.quiz + this.c3.note + this.c3.quiz) / 3.0;


        if (this.avarage > 55) {
            System.out.println("Başarılı");
            this.isPass = true;
        } else{
            System.out.println("Sınıf Tekrarı");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){
        System.out.println("-------------------");
        System.out.println(c1.name + "Notu\t\t: " + (c1.note + c1.quiz) );
        System.out.println(c2.name + "Notu\t\t: " + (c2.note + c2.quiz) );
        System.out.println(c3.name + "Notu\t: " + (c3.note + c3.quiz) );
        System.out.println("ORTALAMANIZ\t\t: " + this.avarage);

    }
}
