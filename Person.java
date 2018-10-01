public class Person {

    protected String name = "n/a";
    protected int age = 0;
    protected String Adress  = "n/a";

    public void setName(String n){
       this.name = n;
    }
    public String name(){
        return this.name;
    }
    public void setAge(int a){
        this.age = a;
    }
    public void int Age(){
        
    }
    public void DescriptionOfPerson (){
        System.out.println("----------");
        System.out.println("My Name is" +name);
        System.out.println("I'm " +age + "years old");
    }


}
