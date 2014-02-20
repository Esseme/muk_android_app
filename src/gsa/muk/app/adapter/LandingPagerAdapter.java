package gsa.muk.app.adapter;

import gsa.muk.app.fragment.RssFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class LandingPagerAdapter extends FragmentPagerAdapter {

	public LandingPagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int position) {
		Fragment fragment = new Fragment();
		switch (position) {
		case 0:
			fragment = new RssFragment();
			Bundle bundle = new Bundle();
			bundle.putString("type", "news");
			fragment.setArguments(bundle);

		case 1:
			fragment = new RssFragment();
			Bundle bundle1 = new Bundle();
			bundle1.putString("type", "events");
			fragment.setArguments(bundle1);
		}
		return fragment;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 2;
	}
}
