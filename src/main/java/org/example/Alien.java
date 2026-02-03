 package org.example;
public class Alien {

//  private Laptop laptop;
    private Computer comp;
   public Alien(){
       System.out.println("a contructor");
   }
   private  int age ;

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }
//   public Alien(Laptop laptop){
//       this.laptop=laptop;
//       System.out.println("dev1 constructor");
//
//   }

    public void build(){
        System.out.println("Working");
        comp.compile();
        // laptop.compile();
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }

//    public void setLaptop(Laptop laptop){
//        this.laptop=laptop;
//    }
//    public Alien(int age){   // constructor injection
//        this.age=age;
//        System.out.println("dev constructor");
//
//
//    }

//    public int getAge(){
//        return age;
//    }

//    public void setAge(int age){
//        this.age=age;
//    }





}
