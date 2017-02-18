package zhuoranhuang.tagnew.ui.activity;

import android.os.Bundle;

import zhuoranhuang.tagnew.R;
import zhuoranhuang.tagnew.app.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
