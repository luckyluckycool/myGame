package luckycoolgames.mygame.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import luckycoolgames.mygame.R;

public class AddButtonsFragment extends Fragment {
    LinearLayout linearLayout;
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.add_buttons_fragment, container, false);
        linearLayout = view.findViewById(R.id.layout);
        return view;
    }
}
