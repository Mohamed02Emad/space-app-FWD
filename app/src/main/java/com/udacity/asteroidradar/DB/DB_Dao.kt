package com.udacity.asteroidradar.DB

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.udacity.asteroidradar.Asteroid

@Dao
interface DB_Dao {
    @Query("SELECT * FROM Asteroid ORDER by closeApproachDate")
    fun getAll(): List<Asteroid>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(asteroid: List<Asteroid>)

    @Query("DELETE  FROM Asteroid")
    fun clear()

}