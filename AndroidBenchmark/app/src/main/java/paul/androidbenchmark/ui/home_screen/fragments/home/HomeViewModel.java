package paul.androidbenchmark.ui.home_screen.fragments.home;


import android.os.AsyncTask;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import paul.androidbenchmark.R;
import paul.androidbenchmark.services.Benchmark;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private Benchmark mBenchmark;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Press the button below to run your benchmark!");
        mBenchmark = new Benchmark();
    }

    public LiveData<String> getText() {
        return mText;
    }

    public void runBenchmarkTest() {
        mText.setValue("Running benchmark test please wait... ");
        new AsyncTaskRunner().execute();
    }

    private String tt;
    private long tsLong;

    private class AsyncTaskRunner extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            tsLong = 0;
            for (int i = 0; i<20000; i++) {
                tsLong += mBenchmark.computeSHAHash("My test string");
                int percentage = i/200;
                publishProgress(percentage + "%");
            }
            tt = Long.toString(tsLong);
            int roundnumber = Math.round(tsLong / 100000000);
            String score = Integer.toString(roundnumber);
            return "SHA-1 hash: " + " " + mBenchmark.getHashValue() + "\n Time Taken: " + tt + "\n Score: " + score;
        }


        @Override
        protected void onPostExecute(String result) {
            // execution of result of Long time consuming operation
            mText.setValue(result);
        }


        @Override
        protected void onPreExecute() {
        }


        @Override
        protected void onProgressUpdate(String... text) {
            mText.setValue("Progress: " + text[0]);
        }
    }
}