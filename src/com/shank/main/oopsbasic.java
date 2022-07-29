package com.shank.main;

public class oopsbasic {

    public static void main(String[] args){


        person p1 =new person();
        person p2 =new person(100,"ram");

        p1.name="shashank";
        p1.age=24;

         p1.eat();
         p1.eat(4);


        System.out.println(p1.name+" "+p1.age);

        System.out.println(person.count);

    }


}
class developer extends person{


    public developer(int age, String name) {
        super(age, name);
    }
}

class person{

    String name;
    int age ;
    static int count;//only acces through class

    public person(int age,String name){
       this.age=age;
       this.name=name;
    }

    public person() {

    }


    void eat(){


    System.out.println(name + " is eating");

}

void eat(int count){

    System.out.println(name+" "+count);


}


}