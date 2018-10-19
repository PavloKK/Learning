public class Main {
    public static void main(String[] args) {
       //                 встроеный метод-конструктор который авт. запускается для создания обьект(экземпляра класса)
            Person person1 = new Person();
            Person person2 = new Person();
            Progammer person3 = new Progammer();
            Driver person4 = new Driver();

            House house = new House("1street");

            house.setAddress("1street");

            person1.setName("John");
            person1.setAge(23);


            person2.setName("Kate");
            person2.setAge(22);

            person3.setName("Dan");
            person3.setAge(45);
            person3.setProgrammingExpierience(2);

            person4.setName("Dima");
            person4.setAge(37);
            person4.setDrivingExperience(5);

            house.settlePerson(person1);
            house.settlePerson(person1); // Заселяем еще иакого же как первый что проверить метод который не позволяет заселить такого же
            house.settlePerson(person2);
            house.settlePerson(person3);
            house.settlePerson(person4);

            person1.DescriptionOfPerson();
            person2.DescriptionOfPerson();
            person3.DescriptionOfPerson();
            person4.DescriptionOfPerson();

            house.DescriptionOfHouse();


    }
}
