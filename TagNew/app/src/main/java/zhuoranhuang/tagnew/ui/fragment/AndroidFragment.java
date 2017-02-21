package zhuoranhuang.tagnew.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import zhuoranhuang.tagnew.R;
import zhuoranhuang.tagnew.app.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class AndroidFragment extends BaseFragment {

    @BindView(R.id.textview_android)
    TextView textView;

    public AndroidFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_android, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
         super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
