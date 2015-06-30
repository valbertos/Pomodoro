package activities;

import android.view.MenuItem;

import com.hacerapp.pomodorotasks.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.res.StringRes;

@EActivity(R.layout.config_activity)
public class ConfigActivity extends BaseAppCompatActivity {

    @AfterViews protected void initViews() {
        super.init();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @StringRes protected String config_account;
    @Override protected String titleToolbar() {
        return config_account;
    }

    @Override public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) onBackPressed();
        return super.onOptionsItemSelected(item);
    }
}
