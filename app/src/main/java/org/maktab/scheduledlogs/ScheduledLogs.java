package org.maktab.scheduledlogs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import org.maktab.scheduledlogs.fragments.ScheduledLogsFragment;

public class ScheduledLogs extends SingleFragmentActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, ScheduledLogs.class);
    }

    @Override
    public Fragment createFragment() {
        return ScheduledLogsFragment.newInstance();
    }
}