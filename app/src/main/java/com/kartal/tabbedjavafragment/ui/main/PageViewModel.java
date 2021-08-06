package com.kartal.tabbedjavafragment.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel { //Kendimiz yazıyoruz birtakım stringleri falan değiştirerek.

    private MutableLiveData<String> nameInput = new MutableLiveData<>();

    //getter setter yaptık kendimiz.
    public void setName(String name) {

        nameInput.setValue(name);
    }

    public LiveData<String> getName() {

        return nameInput;
    }

}