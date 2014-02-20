package gsa.muk.app;

import gsa.muk.app.adapter.LandingPagerAdapter;
import gsa.muk.app.adapter.ScrollingTabsAdapter;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import com.astuetz.viewpager.extensions.ScrollingTabsView;
import com.astuetz.viewpager.extensions.TabsAdapter;

public class LandingPagerActivity extends FragmentActivity {
	
	private ViewPager mPager;
	private ScrollingTabsView mScrollingTabs;
	private LandingPagerAdapter mPagerAdapter;
	private TabsAdapter mScrollingTabsAdapter;
	
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
				setContentView(R.layout.activity_scrolling_tabs);
				initViewPager(6, 0xFF000000, 0xFFFFFFFF);
				mScrollingTabs = (ScrollingTabsView) findViewById(R.id.scrolling_tabs);
				mScrollingTabsAdapter = new ScrollingTabsAdapter(this);
				mScrollingTabs.setAdapter(mScrollingTabsAdapter);
				mScrollingTabs.setViewPager(mPager);
		
		}
		
	
	
	private void initViewPager(int pageCount, int backgroundColor, int textColor) {
		mPager = (ViewPager) findViewById(R.id.pager);
		FragmentManager manager = getSupportFragmentManager();
        //FragmentTransaction transaction = manager.beginTransaction();
		mPagerAdapter = new LandingPagerAdapter(manager);
		mPager.setAdapter(mPagerAdapter);
		mPager.setCurrentItem(1);
		mPager.setPageMargin(1);
	}
	
}
