package com.touchizen.drawerwithbottomnavigation.ui.Timeline;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TimelineViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TimelineViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Timeline Fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}