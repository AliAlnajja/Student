/*
static: belongs to the class, you can only put static var and static method in 
        a static method. You should only call a static method throught thr class Xxxx.method()
        Examples:
                String.format()
                Math methods
                Character methods

non static: belongs to the object, you can put ANYTHING (static var, static method,
            non-static var, non-static method) in a non-static method. You can
            only call a non-static method throught the object xxxx.method()


99% of methods in a class should be non-static
*/
package student;



/**
 *Class of Student, basic OPP exercise
 * @author alinj
 */
public class Student {              // 5000
    private String name;
    private int age;
    private String gender;
    private String id;
    private String email;           // name-@vaniercollege.qc.ca
    private Address address;        // user defined class in another user defined class
    
    private static int nextId = 1;  // one copy of it
    private final static String SCHOOL_NAME = "Vanier College";

    public Student() {
        this.name = null;
        this.age = 0;
        this.gender = null;
        this.id = null;
        this.email = null;
        this.address = null;
    }
    public Student (String name, String gender){        //non-static method
        this.name = name;
        this.age = 0;
        this.gender = gender;
        this.id = String.format("%06d", nextId++);      // static var
        genereateEmail();
        this.address = null;
    }
   
    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = String.format("%06d", nextId++);
        genereateEmail();
        this.address = null;
    }
    
     public Student(String name, int age, String gender, Address address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = String.format("%06d", nextId++);
        genereateEmail();
        this.address = address;
    }
     
    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.gender = student.gender;
        this.id = student.id;
        this.email = student.email;
//        this.address = student.address;                   // shallow copy
        this.address = new Address(student.address);       // deep copy
    }
    
    /**
     * To generate an email for a student
     */
    public void genereateEmail(){
        email = String.format("%s@vaniercollege.qc.ca", name.toLowerCase());
    }
    
    public static boolean isNameValid(String name){             // static method
       
        for (int i = 0; i < name.length(); i++){
            char c = name.charAt(i);
            if (!Character.isLetter(c) && c != ' ' && c != '-' && c != '\'')
                return false;
        }
        return true;
    } 
    
    public void checkDistance() {
        if (this.address.getCity().equalsIgnoreCase("montreal"))
            System.out.println("You live very close to school");
        else if (this.address.getProvince().equalsIgnoreCase("qc"))
            System.out.println("You live not very close to school, but also not too far");
        else 
            System.out.println("You live really far from the school!!!");
    }
       
    public boolean equals(Student student){
        return this.name.equals(student.name) && this.age == student.age
                && this.gender.equals(student.gender) && 
                this.id.equals(student.id) && this.email.equals(student.email)
                && this.address.equals(student.address);
    }
    
    @Override
    public String toString(){                               //non-static method
        String str = "";
        
        str += String.format("Student from %s\n", SCHOOL_NAME);     // static var
        str += String.format("%-10s: %s\n", "Name", name);
        str += String.format("%-10s: %d\n", "Age", age);
        str += String.format("%-10s: %s\n", "Gender", gender);
        str += String.format("%-10s: %s\n", "ID", id);
        str += String.format("%-10s: %s\n", "Email", email);
        str += String.format("%-10s:\n", "Address");
        str += String.format("%-10s\n", address);
        return str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (isNameValid(name)){
        this.name = name;
        email = String.format("%s@vaniercollege.qc.ca", name);
        }
        else
            System.out.println("Sorry, the new name is invalid.... Request denied");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        int atIdx = email.indexOf('@');
        name = email.substring(0, atIdx);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}