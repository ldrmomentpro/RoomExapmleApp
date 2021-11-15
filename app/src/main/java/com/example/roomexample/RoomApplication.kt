package com.example.roomexample

import android.app.Application
import com.example.roomexample.data.ItemRoomDatabase

class RoomApplication : Application() {
    val database: ItemRoomDatabase by lazy { ItemRoomDatabase.getDatabase(this) }
}
