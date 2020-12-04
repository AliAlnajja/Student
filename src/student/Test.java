/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import clock.Clock;



/**
 *
 * @author alinj
 */
public class Test {
    public static void main(String[] args) {
        Clock c = new Clock(22, 55, 2);
        Clock c2 = new Clock(c);
        
        for (int i = 0; i < 10000; i++) {
            c.increaseSe();
            System.out.println(c);
        }
        
//        System.out.println(c2);
        
        
        
        
        
//        double num = 1;
//        char c = 'a';
//        String str = "hello";
////        int num2 = 5;
//        
//        Student stu1 = new Student("yi", "0001", 35, "123-123-1234");
//        Student stu2 = new Student("Ali", "123", 25, "123456789");
//        
//        Student stu3 = new Student();
//        
//        System.out.println(stu1);
//        System.out.println(stu2);
//        System.out.println(stu3);
//        
//        
//        System.out.println(stu2 == stu3);
//        
//        System.out.println(stu3.equals(stu2));
//        System.out.println(stu2.equals(stu3));
//                                        //deep copy 
//        
//        Student stu6 = stu1;        // shallow copy
//                                    // just copy the address (reference)
//                                    // of an object to another reference
//                                    // DOES NOT create a new second piece of
//                                    // memory to store the data
                                    
//        Student s1 = new Student("Yi", 35, "male");
//        Student s2 = new Student("Yi", 18, "female");
//        Student s3 = new Student("Yi", 50, "unknowm");
//        
//        System.out.println(s1.toString());  // call non-static method through object 
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(Student.isNameValid("hello"));   // call static method throught class
         

//        Student stu1 = new Student("Yi", 35, "male", new Address
//        ("123", "35", "Main Street", "Montreal", "QC", "A1A 1A1"));
//        System.out.println(stu1);
//        
//        stu1.setAddress(new Address("223", "35", "Main Street", "Montreal", "QC", "A1A 1A1"));
  
//        
//        stu1.getAddress().setAptNum("223");
//        stu1.getAddress().setStreetNum("122");
//        stu1.getAddress().setZipcode("b2b 2b2");
//        System.out.println(stu1);
//        
//        stu1.getAddress().setCity("Tronto");
//        stu1.getAddress().setProvince("ON");
//        
//        stu1.checkDistance();



        
    }
}
