package com.petersburg_studio.trackmysleepqualitystarter.sleeptracker

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.petersburg_studio.trackmysleepqualitystarter.database.SleepDatabaseDao

/**
 * ViewModel for SleepTrackerFragment.
 */
class SleepTrackerViewModel(
    val database: SleepDatabaseDao,
    application: Application) : AndroidViewModel(application) {
}