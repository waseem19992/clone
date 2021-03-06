package fast.cleaner.battery.saver.PagerAdapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import fast.cleaner.battery.saver.Fragments.BatterySaver;
import fast.cleaner.battery.saver.Fragments.CPUCooler;
import fast.cleaner.battery.saver.Fragments.JunkCleaner;
import fast.cleaner.battery.saver.Fragments.PhoneBooster;

/**
 * Created by intag pc on 2/12/2017.
 */

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public MyPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                JunkCleaner tab1 = new JunkCleaner() ;
                return tab1;
            case 1:
                PhoneBooster tab2 = new PhoneBooster();
                return tab2;
            case 2:
                CPUCooler tab3 = new CPUCooler();
                return tab3;
            case 3:
                BatterySaver tab4 = new BatterySaver();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
