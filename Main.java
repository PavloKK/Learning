public class Main {
    public static void main(String[] args) {
       //                 встроеный метод-конструктор который авт. запускается для создания обьект(экземпляра класса)
            Person person1 = new Person("John",23);
            Person person2 = new Person();

            House house = new House("1street");

            //house.setAddress("1street");

           // person1.setName("John");
           // person1.setAge(23);


            person2.setName("Kate");
            person2.setAge(22);

            house.settlePerson(person1);
            house.settlePerson(person1);
            house.settlePerson(person2);

            person1.DescriptionOfPerson();
            person2.DescriptionOfPerson();
            house.DescriptionOfHouse();

    }
}
