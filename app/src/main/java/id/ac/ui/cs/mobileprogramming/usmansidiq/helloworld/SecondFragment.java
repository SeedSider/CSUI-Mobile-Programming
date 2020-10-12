package id.ac.ui.cs.mobileprogramming.usmansidiq.helloworld;

import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import id.ac.ui.cs.mobileprogramming.usmansidiq.helloworld.models.Person;
import id.ac.ui.cs.mobileprogramming.usmansidiq.helloworld.viewmodels.FirstViewModel;

public class SecondFragment extends Fragment {
    private FirstViewModel viewModel;

    private TextView name;
    private TextView birthplace;
    private TextView quote;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this.getActivity()).get(FirstViewModel.class);

        viewModel.getSelectedPerson().observe(this, item -> {
            displayDetails(viewModel.getPersonDetails(item));
        });
    }

    public void displayDetails(Person person){
        name.setText(person.getName());
        birthplace.setText(person.getBirthplace());
        quote.setText(person.getQuote());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_fragment,
                container, false);

        name = view.findViewById(R.id.name);
        birthplace = view.findViewById(R.id.birthplace);
        quote = view.findViewById(R.id.quote);

        return view;
    }
}