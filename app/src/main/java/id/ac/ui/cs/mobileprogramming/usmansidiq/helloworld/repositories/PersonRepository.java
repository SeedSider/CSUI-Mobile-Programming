package id.ac.ui.cs.mobileprogramming.usmansidiq.helloworld.repositories;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import id.ac.ui.cs.mobileprogramming.usmansidiq.helloworld.models.Person;


public class PersonRepository {

    private static PersonRepository instance;
    private ArrayList<Person> dataSet = new ArrayList<>();

    public static PersonRepository getInstance() {
        if(instance == null) {
            instance = new PersonRepository();
        }
        return instance;
    }

    //Dummy data
    public MutableLiveData<List<Person>> getPersons() {
        setPersons();

        MutableLiveData<List<Person>> data = new MutableLiveData<>();
        data.setValue(dataSet);
        return data;
    }

    private void setPersons() {
        dataSet.add(
                new Person("Usman", "Soppeng", "Diam adalah emas")
        );

        dataSet.add(
                new Person("Sidiq", "Makassar", "Prokras adalah jalan ninjaku")
        );

        dataSet.add(
                new Person("Asep", "Depok", "Paket phoenix mas?")
        );
    }
}
