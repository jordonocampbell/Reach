package ctrl_it.reach;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.MenuItem;

// TODO: 12/7/2018 implement new de sign inclusive of: hamburger button for navigation bar use and reduce ride schedule to one button
public class DriverDashboardActivity extends AppCompatActivity{
    private DrawerLayout mDrawerLayout;
    private NavigationView driverNavigationView;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_dashboard);

        driverNavigationView = findViewById(R.id.nav_view);
        setupDrawerContent(driverNavigationView);
    }

    private void setupDrawerContent(NavigationView driverNavigationView){
        driverNavigationView.setNavigationItemSelectedListener(

                new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(MenuItem menuItem) {
                    mDrawerLayout = findViewById(R.id.drawer_layout);
                    selectDrawerItem(menuItem);
                    return true;
                }
            }
        );
    }

    public void selectDrawerItem(MenuItem menuItem){
        // Add code here to update the UI based on the item selected
        // For example, swap UI fragments here

        Fragment fragment = null;
        Class fragmentClass;
        switch(menuItem.getItemId()) {
            case R.id.fragment_driver_account_details:
                fragmentClass = DriverAccountDetails.class;
                break;
            case R.id.fragment_driver_ride_schedule:
                fragmentClass = DriverRideSchedule.class;
                break;
            default:
                fragmentClass = DriverAccountDetails.class;
        }

        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Insert the fragment by replacing any existing fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();

        menuItem.setChecked(true);
        // Set action bar title
        setTitle(menuItem.getTitle());
        // Close the navigation drawer
        mDrawerLayout.closeDrawers();
    }

}
