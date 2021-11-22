package paul.androidbenchmark.ui.home_screen.fragments.scores;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import paul.androidbenchmark.databinding.FragmentScoresBinding;

public class ScoresFragment extends Fragment {

    private ScoresViewModel scoresViewModel;
    private FragmentScoresBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        scoresViewModel =
                new ViewModelProvider(this).get(ScoresViewModel.class);

        binding = FragmentScoresBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textScores;
        scoresViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}