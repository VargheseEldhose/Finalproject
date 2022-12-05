package sheridancollege.prog39402.Varghese991588959.Zawad991583646.Database

import android.content.Context

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities=[ExerciseEntity::class, DietEntity::class, UserEntity::class, LoadedExeEntity::class, LoadedDietEntity::class], version = 1)
abstract class DatabaseP:RoomDatabase(){


    abstract fun ExerciseDao(): ExerciseDao
    abstract fun DietDao(): DietDao
    abstract fun LoadedDietDao(): LoadedDietDao
    abstract fun LoadedExeDao(): LoadedExeDao
    abstract fun UserDao(): UserDao
    companion object{
        // @Volatile
        private  var INSTANCE: DatabaseP?=null
        fun getInstance(context: Context): DatabaseP
        {
            if(INSTANCE ==null)
                INSTANCE =Room.databaseBuilder(context, DatabaseP::class.java,"student.db").allowMainThreadQueries().build()
            return  INSTANCE as DatabaseP
        }
    }}