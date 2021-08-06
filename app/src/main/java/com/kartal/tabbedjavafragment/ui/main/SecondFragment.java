package com.kartal.tabbedjavafragment.ui.main;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kartal.tabbedjavafragment.R;


public class SecondFragment extends Fragment {

    PageViewModel pageViewModel;


    //heryerden ulaşabilmek için
    public static SecondFragment newInstance() {
        return new SecondFragment();
    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pageViewModel = new ViewModelProvider(requireActivity()).get(PageViewModel.class);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        TextView textView = view.findViewById(R.id.textView);
        ImageView imageView = view.findViewById(R.id.imageView2);



        //observe demek bir değişiklik varsa gözlemle demektir.
        pageViewModel.getName().observe(requireActivity(), new Observer<String>() {
            @Override
            public void onChanged(String s) {

                textView.setText(s);
            }
        });

        super.onViewCreated(view, savedInstanceState);
    }
}