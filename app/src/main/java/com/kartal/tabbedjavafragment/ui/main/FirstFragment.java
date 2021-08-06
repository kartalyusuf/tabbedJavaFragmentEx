package com.kartal.tabbedjavafragment.ui.main;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.kartal.tabbedjavafragment.R;


public class FirstFragment extends Fragment {

    PageViewModel pageViewModel;

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        pageViewModel = new ViewModelProvider(requireActivity()).get(PageViewModel.class);





    }

    //Bize hazır olarak verilen kodları sildik çünkü bize lazım olanları kendimiz yazıcaz.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {


        //Amacımız firstFragment a bir şeyler yazdıktan sonra anlık olarak secondFragmentta görmek.
        ImageView imageView = view.findViewById(R.id.imageView);

        EditText editText = view.findViewById(R.id.editText);
        editText.addTextChangedListener(new TextWatcher() {  //Değiştirdiğimize dair geribildirim sağlıyoruz ki anlasın
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                pageViewModel.setName(s.toString());

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



        super.onViewCreated(view, savedInstanceState);
    }
}