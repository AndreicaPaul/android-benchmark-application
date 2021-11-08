package paul.androidbenchmark.ui.home_screen.ui.profile;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProfileViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ProfileViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is profile fragment.\n Here you will be able to see your device specs and" +
                " other profile data");
    }

    public LiveData<String> getText() {
        return mText;
    }
}