package com.bptn.course._12_super_keyword;

public class Person {

	private String name;

    public Person(String name) {
       this.name = name;
    }

    public String getFood() {
       return "Hamburger";
    }

    public static void main(String[] args) {
       Person p = new Student("Javier");
       System.out.println(p.getFood());

       p = new Vegan("Vegan");
       System.out.println(p.name);
       System.out.println(p.getFood());
    }
}
