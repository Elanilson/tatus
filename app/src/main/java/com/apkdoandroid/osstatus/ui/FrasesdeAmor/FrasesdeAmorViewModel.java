package com.apkdoandroid.osstatus.ui.FrasesdeAmor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FrasesdeAmorViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FrasesdeAmorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}