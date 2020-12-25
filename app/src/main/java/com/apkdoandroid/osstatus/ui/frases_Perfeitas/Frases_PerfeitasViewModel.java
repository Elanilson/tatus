package com.apkdoandroid.osstatus.ui.frases_Perfeitas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Frases_PerfeitasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Frases_PerfeitasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}