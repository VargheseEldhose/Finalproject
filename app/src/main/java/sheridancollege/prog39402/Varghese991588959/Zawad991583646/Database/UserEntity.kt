package sheridancollege.prog39402.Varghese991588959.Zawad991583646.Database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "user")
data class UserEntity ( @PrimaryKey(autoGenerate = true)
                        var id:Long,
                        @ColumnInfo(name = "Name")
                        var name :String,
                        @ColumnInfo(name="grades")
                        var grade:Int)
