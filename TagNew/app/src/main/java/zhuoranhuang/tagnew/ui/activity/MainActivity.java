package zhuoranhuang.tagnew.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import zhuoranhuang.tagnew.R;
import zhuoranhuang.tagnew.app.BaseActivity;
import zhuoranhuang.tagnew.ui.adapter.MyPagerAdapter;

public class MainActivity extends BaseActivity {

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
        List<String> tab_title = new ArrayList<>();
        tab_title.add("Android");
        tab_title.add("Beauty");
        tab_title.add("iOS");
        tab_title.add("Favorites");
        for (String i : tab_title){
            tabLayout.addTab(tabLayout.newTab().setText(i));
        }
        PagerAdapter myPageAdapter = new MyPagerAdapter(getSupportFragmentManager(),
                tabLayout.getTabCount());
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