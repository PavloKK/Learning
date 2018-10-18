import java.util.ArrayList;

public class House {
    protected String Address = "n/a";

    protected ArrayList<Person> listOfResidents = new ArrayList<Person>();

    public House(){

    }
    public House(String Address){
        this.Address = Address;

    }



    public void setAddress(String aa) {
        this.Address = aa;
    }
    public String Address(){
        return this.Address;
    }
    public void settlePerson(Person p){
       if(listOfResidents.contains(p)){
           System.out.println("He already lives here");
       }else{
           listOfResidents.add(p);
           p.setAddress(this.Address);
       }
    }
    public void evictPerson(Person p){
         listOfResidents.remove(p);
         }
    public void DescriptionOfHouse(){
           System.out.println("----------");
           System.out.println("# Address of this house :" +this.Address);
           System.out.println("#List of Residents:");

           if(listOfResidents != null){
               for(int i = 0; i < listOfResidents.size(); i++){
                   Person p = listOfResidents.get(i);
                   System.out.println("# - " +p.name);
               }
        }
           }
}
