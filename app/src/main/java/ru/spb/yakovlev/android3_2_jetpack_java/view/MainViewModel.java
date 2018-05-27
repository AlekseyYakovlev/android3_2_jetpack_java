package ru.spb.yakovlev.android3_2_jetpack_java.view;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;


public class MainViewModel extends ViewModel {


    public MutableLiveData<String> dynamicText = new MutableLiveData<>();

    {
        dynamicText.postValue("Initial text");
    }
}
