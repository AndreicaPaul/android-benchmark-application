package paul.androidbenchmark.ui.home_screen.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment.\n Here you will be able to start a benchmarking test.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}