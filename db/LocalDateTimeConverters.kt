package se.indpro.indproassignment.db

import androidx.room.TypeConverter
import java.time.LocalDateTime

class LocalDateTimeConverters {
    @TypeConverter
    fun fromLocalDateTime(localDateTime: LocalDateTime?): String? {
        return if (localDateTime == null) null else localDateTime.toString()
    }

    @TypeConverter
    fun toLocalDateTime(localDateTimeString: String?): LocalDateTime? {
        return if (localDateTimeString == null) null else LocalDateTime.parse(localDateTimeString)
    }
}