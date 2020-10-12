package id.ac.ui.cs.mobileprogramming.usmansidiq.helloworld.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import id.ac.ui.cs.mobileprogramming.usmansidiq.helloworld.models.Person;
import id.ac.ui.cs.mobileprogramming.usmansidiq.helloworld.repositories.PersonRepository;

public class FirstViewModel extends ViewModel {

    private MutableLiveData<List<Person>> mPersons;
    private PersonRepository mRepo;

    public void init() {
        if(mPersons != null) {
            return;
        }
        mRepo = PersonRepository.getInstance();
        mPersons = mRepo.getPersons();
    }
    public LiveData<List<Person>> getPersons() {
        return mPersons;
    }
}