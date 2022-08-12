/*
 * Primary design of Dog class
 * Abstraction : Abstracted properties of a dog (name, age, howl)
 * Encapsulation : Gathered fields and methods about a dog in a class
 * 				   plus, we can use howl() not knowing about the field 'howling'.
 * Inheritance : nope
 * Polymorphism : nope
 * 
public class Dog {
	private String name;
	private int age;
	private String howling;
	
	Dog(String name, int age){
		this.name = name;
		this.age = age;
		this.howling = "왈왈";
	}
	
	public void howl() {
		System.out.println(howling);
	}
	
	public void grow() {
		age ++;
	}
}
 */

/*
 * second design of Dog class
 * 
 * Abstraction : Same with primary design.
 * Encapsulation : Same with primary design plus, We can use howl(int repeat)
 * 				   and introduce() not knowing about inner logic.
 * Inheritance : It is an sub class of 'Animal' super class
 * 			 	 uses fields(name, age) of super class.
 * 				 Implements and uses abstract method howl().
 * 				 Can use super's method introduce().
 * Polymorphism : Overrided and overloaded method 'howl' to implement its own
 * 				  service with same command which is method polymorphism.
 */
public class Dog extends Animal{
	private String howling;
	
	Dog(String name, int age){
		super(name, age);
		howling = "barking";
	}
	
	@Override
	public void howl() {
		System.out.println(howling);
	}
	//Overload
	public void howl(int repeat) {
		System.out.println(howling.repeat(repeat));
	}
}
