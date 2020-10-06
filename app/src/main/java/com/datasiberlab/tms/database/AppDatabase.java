package com.datasiberlab.tms.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Sms.class, CallLog.class}, version = 1,exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract SmsDao smsDao();
    public abstract CallLogDao callLogDao();
}