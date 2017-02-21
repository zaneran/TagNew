package zhuoranhuang.tagnew.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import butterknife.BindView;
import zhuoranhuang.tagnew.R;
import zhuoranhuang.tagnew.app.BaseActivity;
import zhuoranhuang.tagnew.ui.adapter.MyPagerAdapter;

public class MainActivity extends BaseActivity {

    public static final int TAB_NUM = 4;

    @BindView(R.id.tablayout)
    TabLayout tabLayout;

    @BindView(R.id.viewpager)
    ViewPager viewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initViewPager();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    private void initViewPager(){
        PagerAdapter myPageAdapter = new MyPagerAdapter(getSupportFragmentManager(), TAB_NUM);
        viewPager.setAdapter(myPageAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabSelectedLisener());
    }


    public class TabSelectedLisener implements TabLayout.OnTabSelectedListener{

        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            viewPager.setCurrentItem(tab.getPosition());
        }

        @Override
        public void onTabUnselected(TabLayout.Tab tab) {

        }

        @Override
        public void onTabReselected(TabLayout.Tab tab) {

        }
    }
}