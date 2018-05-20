public class Main{

    public static void main(String[] args)
    {
        PhoneBook phoneBook = new PhoneBook();

        Person[]persons = new Person[20];

        phoneBook.addPerson(persons);

        Person person1 =new Person();
        person1.setName("tibi");
        person1.setPhoneNumber("0712123123");

        Person person2 =new Person();
        person2.setName("mirela");
        person2.setPhoneNumber("0712123123");

        Person person3 =new Person();
        person3.setName("vlad");
        person3.setPhoneNumber("0712123123");

        persons[1] = person1;
        persons[2] = person2;
        persons[3] = person3;

        findPhoneNumberByName("VLAD", phoneBook);

    }
    public static void findPhoneNumberByName(String name, PhoneBook phoneBook){
        for(int i=0; i<20; i++){
            Person person = phoneBook.getPersons()[i];

            if(person!=null && person.getName().equals(name)){
                System.out.println(person.getPhoneNumber());
            }
        }
    }
}
