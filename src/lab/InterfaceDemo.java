package lab;
abstract class Animal
{
protected int legs;
protected String name;

public Animal(int legs) {
this.legs = legs;
}

public abstract void eat();

public void walk() {
System.out.println("This animal walks by " + legs + " legs.");
}
}


class Spider extends Animal {
public Spider() {
super(8);
}

public void eat() {
System.out.println("The spider eats insects.");
}
}


interface Pet {
String getName();
void setName(String name);
void play();
}



class Fish extends Animal implements Pet {


public Fish() {
super(0);
}

public void eat() {
System.out.println("The fish eat plants.");
}

public void walk() {
System.out.println("Fish has no legs.");
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

@Override
public void play() {
	// TODO Auto-generated method stub
	
}


}


class Cat extends Animal implements Pet {
public Cat(String name) {
super(4);
this.name = name;
}

public Cat() {
this("");
}

public void eat() {
System.out.println("The cat eats fishes.");
}

public void walk() {
System.out.println("The cat walks by " + legs + " legs.");
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public void play() {
System.out.println("The cat plays with rats.");
}
}


public class InterfaceDemo {
public static void main(String[] args) {
Fish fish = new Fish();
Cat cat = new Cat("Fluffy");
Animal animalFish = new Fish();
Animal animalSpider = new Spider();
Pet petCat = new Cat();

fish.setName("Mimi");
System.out.println("FISH");
System.out.println("Fish name is " + fish.getName());
fish.eat();
fish.walk();
petCat.setName("Momo");
System.out.println("This fish's name is " + petCat.getName());

System.out.println("\nCAT");
System.out.println("Cat name is " + cat.getName());
cat.walk();
cat.play();
cat.eat();
petCat.setName("Moose");
System.out.println("This cat's name is " + petCat.getName());

System.out.println("\nSPIDER");
animalSpider.eat();
animalSpider.walk();


}
}
	

