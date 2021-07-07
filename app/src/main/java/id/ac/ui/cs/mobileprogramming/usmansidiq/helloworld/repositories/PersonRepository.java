package id.ac.ui.cs.mobileprogramming.usmansidiq.helloworld.repositories;

import androidx.lifecycle.MutableLiveData;

import java.util.HashMap;
import java.util.List;

import id.ac.ui.cs.mobileprogramming.usmansidiq.helloworld.models.Person;


public class PersonRepository {
    private String persons[];
    private HashMap<String, Person> personDetails;
    public String[] getPersons(){
        if(persons == null){
            persons = new String[3];
            persons[0] = "Usman";
            persons[1] = "Sidiq";
            persons[2] = "Asep";
        }
        return persons;
    }

    public Person getPersonDetails(String name){
        if(personDetails == null){
            setPersons();
        }
        return personDetails.get(name);
    }

    private void setPersons() {
        personDetails = new HashMap<String, Person>();

        Person person = new Person();
        person.setName("Usman");
        person.setBirthplace("Soppeng");
        person.setQuote("Diam adalah emas");
        personDetails.put("Usman", person);

        Person person2 = new Person();
        person2.setName("Sidiq");
        person2.setBirthplace("Makassar");
        person2.setQuote("Prokras adalah jalan ninjaku");
        personDetails.put("Sidiq", person2);

        Person person3 = new Person();
        person3.setName("Asep");
        person3.setBirthplace("Depok");
        person3.setQuote("Paket phoenix mas?");
        personDetails.put("Asep", person3);
    }
}
