package id.ac.ui.cs.mobileprogramming.usmansidiq.helloworld;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import id.ac.ui.cs.mobileprogramming.usmansidiq.helloworld.viewmodels.FirstViewModel;

public class FirstFragment extends Fragment {

    private FirstViewModel viewModel;
    private ListView lv;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(FirstViewModel.class);

        lv.setAdapter(new ArrayAdapter<String>(this.getActivity(),
                android.R.layout.simple_list_item_1, viewModel.getPersonList()));

        lv.setOnItemClickListener((adapter, itemView, pos, id) -> {
            TextView tv = (TextView)itemView;
            Toast.makeText(this.getContext(), tv.getText().toString(), Toast.LENGTH_SHORT).show();
            viewModel.selectPerson(tv.getText().toString());
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.first_fragment,
                container, false);
        lv = (ListView)view.findViewById(R.id.person_lv);

        return view;
    }
}