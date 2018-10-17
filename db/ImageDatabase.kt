package se.indpro.indproassignment.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.sqlite.db.SupportSQLiteDatabase
import java.util.concurrent.Executors

@Database(entities = arrayOf(ImageInfo::class),version = 1)

@TypeConverters(LocalDateTimeConverters::class)

abstract class ImageDatabase: RoomDatabase() {

    abstract fun getImageTableDao(): ImageTableDao

    companion object {

        private var INSTANCE: ImageDatabase? = null

        @Synchronized
        fun getInstance(context: Context): ImageDatabase?{
            if (INSTANCE == null){
                INSTANCE = buildDatabase(context)
            }
            return INSTANCE
        }

        private fun buildDatabase(context: Context): ImageDatabase{
            return Room.databaseBuilder(context,
                ImageDatabase::class.java,
                "image-database").addCallback(
                object : Callback(){
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        Executors.newSingleThreadExecutor().execute {
                            getInstance(context)?.getImageTableDao()?.insertAll(ImageInfo.populateData())
                        }
                    }
                }
            ).build()
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }

}