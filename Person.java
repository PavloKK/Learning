public class Person {

    protected String name = "n/a";
    protected int age = 0;
    protected String Address  = "n/a";

    public Person(){

    }
    public Person(String name, int age){
     this.name = name;
     this.age = age;

    }

    public void setName(String n){
       this.name = n;
    }
    public String Name(){
        return this.name;
    }
    public void setAge(int a){
        this.age = a;
    }
    public int Age(){
        return this.age;
    }
    public void setAddress (String adr) {
        this.Address = adr;
    }
    public String Address (){
        return this.Address;
    }

    public void DescriptionOfPerson (){
        System.out.println("----------");
        System.out.println("My Name is " +name);
        System.out.println("I'm " +age + " years old");
        System.out.println("My Address is " +Address);
    }


}
