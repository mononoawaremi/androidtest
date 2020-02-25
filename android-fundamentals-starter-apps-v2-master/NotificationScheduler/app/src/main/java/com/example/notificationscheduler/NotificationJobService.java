package com.example.notificationscheduler;

import android.app.NotificationManager;
import android.app.job.JobParameters;
import android.app.job.JobService;

public class NotificationJobService extends JobService {

    private static final String PRIMARY_CHANNEL_ID =
            "primary_notification_channel";
    NotificationManager mNotifyManager;

    @Override
    public boolean onStartJob(JobParameters params) {

        return false;


    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return false;
    }
}


