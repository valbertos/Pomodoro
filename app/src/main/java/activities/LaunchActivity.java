package activities;

import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;

import services.UserService;

@EActivity
public class LaunchActivity extends AppCompatActivity {

    @Bean protected UserService mUserService;
    @AfterInject protected void init() {
        if (!mUserService.isAuthenticate()) LoginActivity_.intent(this).start();
    }

}
