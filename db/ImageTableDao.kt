package se.indpro.indproassignment.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ImageTableDao {
    @Query("SELECT * FROM ImageTable")
    fun getAll(): List<ImageInfo>

    @Insert
    fun insertAll(imageInfo: Array<ImageInfo>)
}