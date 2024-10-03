package com.bptn.course._practice_object_superclass;

public class PersonOverride {

		   private String name;

		   public PersonOverride(String theName) {
		      this.name = theName;
		   }

		   @Override
		   public boolean equals(Object other) {
			      Person otherPerson = (Person) other;
			      return this.name.equals(otherPerson.name);
		      }
		     
		   

		   public static void main(String[] args) {
		      Person p1 = new Person("Gabe");
		      Person p2 = new Person("Gus");
		      Person p3 = new Person("Gabe");
		      Person p4 = p3;
		      System.out.println(p1.equals(p2)); // false
		      System.out.println(p2.equals(p3)); // false
		      System.out.println(p1.equals(p3)); // true
		      System.out.println(p3.equals(p4)); // true
		   }
		


}
