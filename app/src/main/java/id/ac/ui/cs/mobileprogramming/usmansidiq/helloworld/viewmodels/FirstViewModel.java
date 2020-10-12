package id.ac.ui.cs.mobileprogramming.usmansidiq.helloworld.viewmodels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


import id.ac.ui.cs.mobileprogramming.usmansidiq.helloworld.models.Person;
import id.ac.ui.cs.mobileprogramming.usmansidiq.helloworld.repositories.PersonRepository;

public class FirstViewModel extends ViewModel {

    private final MutableLiveData<String> selectedPerson = new MutableLiveData<String>();

    private PersonRepository mRepo = new PersonRepository();

    public void selectPerson(String personName) {
        selectedPerson.setValue(personName);
    }

    public MutableLiveData<String> getSelectedPerson() {
        return selectedPerson;
    }

    public String[] getPersonList(){
        return mRepo.getPersons();
    }

    public Person getPersonDetails(String name){
        return mRepo.getPersonDetails(name);
    }
}