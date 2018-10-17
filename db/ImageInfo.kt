package se.indpro.indproassignment.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime

@Entity(tableName = "ImageTable")
data class ImageInfo(
    @PrimaryKey(autoGenerate = true)
    var id:Int? = null,
    var url: String,
    @ColumnInfo(name = "lk")
    var likeCount: Int = 0,
    @ColumnInfo(name = "dislike")
    var dislikeCount: Int = 0,
    var click: Int = 0,
    @ColumnInfo(name = "updated_at")
    var updatedAt: LocalDateTime = LocalDateTime.now(),
    @ColumnInfo(name = "created_at")
    var createdAt: LocalDateTime = LocalDateTime.now()
    ){
    companion object {
        fun populateData(): Array<ImageInfo>{
            return arrayOf(
                ImageInfo(url = "http://www.indpro.se/wp-content/uploads/2016/07/DSC00489-830x400.jpg"),
                ImageInfo(url = "http://www.indpro.se/wp-content/uploads/2016/07/indpro_team_2016-826x400.jpg"),
                ImageInfo(url = "http://www.indpro.se/wp-content/uploads/2017/01/nod-2000x720.jpg"),
                ImageInfo(url = "http://www.indpro.se/wp-content/uploads/2017/01/indpro_wtc-1370x493.png"),
                ImageInfo(url = "http://www.indpro.se/wp-content/uploads/2016/06/bigstock-Programmer-Working-Computer-Mo-119137727-830x400.jpg"),
                ImageInfo(url = "http://www.indpro.se/wp-content/uploads/2016/06/bigstock-Programmer-Working-Computer-Mo-119137727-830x400.jpg"),
                ImageInfo(url = "https://media.licdn.com/media/p/5/005/089/310/067700c.png"),
                ImageInfo(url = "http://www.indpro.se/wp-content/themes/wasabiweb/build/img/site-logo.svg"),
                ImageInfo(url = "https://image.isu.pub/091106120135-72ef08cac96b499a8962dc2f149dbf9c/jpg/page_1_thumb_large.jpg"),
                ImageInfo(url = "https://scontent.fdel1-2.fna.fbcdn.net/v/t1.0-9/18157255_10158513417270573_252111462048733266_n.jpg?oh=d992ad5f09f0c0b50279843785c4c334&oe=598380B0")
            )
        }
    }
}