public class inhertance{
 public static void main(String args[]){
//    dog d =new dog();
//    d.eat();
//    d.legs=4;
//    System.out.println(d.legs);

// Bird b = new Bird();
// b.eat();
// Fish f = new Fish();
// f.breathe();
// Mammal m = new Mammal();
// m.eat();

Tune t = new Tune();
t.eat();
t.swing();

Peacock p = new Peacock();
p.breathe();
p.fly();

Human h = new Human();
h.eat();
h.walk();
 }   
}

class Animal{
    String color;

    void eat(){
        System.out.println("Animal is eat");
    }

    void breathe(){
        System.out.println("Animal is breathe");
    }
}

class Mammal extends Animal{
    int legs;
    void  walk(){
        System.out.println("Walks");
    }
}

class Fish extends Animal{
    void swing(){
        System.out.println("Swing");
    }

}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}


class Tune extends Fish{
    void tune(){
        System.out.println("Tune");
    }
}

class Shark extends  Fish{
    void shark(){
        System.out.println("Sharke");
    }
}

class Peacock extends Bird{
    void peacock(){
        System.out.println("peacock");
    }

}

class Dog extends Mammal{
    void dog(){
        System.out.println("Dog");
    }
}

class Human extends Mammal{
    void human(){
        System.err.println("human");
    }
}

class Cat extends Mammal{
    void cat(){
        System.out.println("cat");
    }
}

// class dog extends Mammal{

// }