package zhuoranhuang.tagnew.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

import zhuoranhuang.tagnew.ui.fragment.AndroidFragment;
import zhuoranhuang.tagnew.ui.fragment.BeautyFragment;
import zhuoranhuang.tagnew.ui.fragment.FavoritesFragment;
import zhuoranhuang.tagnew.ui.fragment.IOSFragment;

/**
 * Adapter for ViewPager of Fragments.
 *
 * Created by zaneran on 2/20/2017.
 */

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    private int Fragment_Num;

    public MyPagerAdapter(FragmentManager fm, int Fragment_Num) {
        super(fm);
        this.Fragment_Num = Fragment_Num;
    }

    @Override
    public CharSequence getPageTitle(int position){
        List<String> tab_title = new ArrayList<>();
        tab_title.add("Android");
        tab_title.add("Beauty");
        tab_title.add("iOS");
        tab_title.add("Favorites");
        return tab_title.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return new AndroidFragment();
            case 1 :
                return new IOSFragment();
            case 2 :
                return new BeautyFragment();
            case 3 :
                return new FavoritesFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return Fragment_Num;
    }
}
