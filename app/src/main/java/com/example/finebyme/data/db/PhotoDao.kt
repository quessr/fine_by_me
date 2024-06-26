package com.example.finebyme.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface PhotoDao {
    @Query("SELECT * from favorite_photos ORDER BY inputAt DESC")
    fun getAllPhotos(): List<Photo>

    @Query("SELECT * from favorite_photos WHERE id = :id LIMIT 1")
    fun getPhoto(id: String): Photo

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(photo: Photo)

    @Update
    fun update(photo: Photo)

    @Delete
    fun delete(photo: Photo)

}