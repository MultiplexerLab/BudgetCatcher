package multiplexer.lab.budget.catcher;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.dell.designapp.R;

import multiplexer.lab.budget.catcher.fragment.AccountFragment;
import multiplexer.lab.budget.catcher.fragment.AnalysisFragment;
import multiplexer.lab.budget.catcher.fragment.HomeFragment;
import multiplexer.lab.budget.catcher.fragment.ManageFragment;

public class BottomNavigationn extends AppCompatActivity {

    private BottomNavigationView mainNav;
    private FrameLayout mainFrame;

    private HomeFragment homeFragment;
    private ManageFragment manageFragment;
    private AccountFragment accountFragment;
    private AnalysisFragment analysisFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigationn);

        mainFrame=(FrameLayout)findViewById(R.id.frame);
        mainNav=(BottomNavigationView) findViewById(R.id.nav_menu);

        homeFragment = new HomeFragment();
        manageFragment = new ManageFragment();
        accountFragment = new AccountFragment();
        analysisFragment = new AnalysisFragment();


        mainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {

                    case R.id.nav_home:
                        setFragment(homeFragment);
                        return true;

                    case R.id.nav_manage:
                        setFragment(manageFragment);
                        return true;

                    case R.id.nav_accounts:
                        setFragment(accountFragment);
                        return true;

                    case R.id.nav_analysis:
                        setFragment(analysisFragment);
                        return true;

                        default:
                            return false;
                }

            }
        });
    }

    private void setFragment (Fragment fragment) {

        FragmentTransaction fragmentTransaction= getSupportFragmentManager().beginTransaction();

        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();

    }
}

