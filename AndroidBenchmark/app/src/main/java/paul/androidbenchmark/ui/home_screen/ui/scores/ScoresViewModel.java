package paul.androidbenchmark.ui.home_screen.ui.scores;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScoresViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ScoresViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is scores fragment.\nHere you will be able to see your scores and com" +
                "are them to the scores of other users.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}