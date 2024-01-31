package uz.bahrom.effective_mobile.data.source.local.room.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import uz.bahrom.effective_mobile.data.source.local.room.dao.UserDao
import uz.bahrom.effective_mobile.data.source.local.room.entity.UserEntity

@Database(entities = [UserEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    /**
     *     abstract fun wordDao(): WordDao
     *
     *     companion object {
     *         private var dictionaryDatabase: DictionaryDatabase? = null
     *
     *         fun init(context: Context) {
     *             if (dictionaryDatabase == null)
     *                 dictionaryDatabase = Room.databaseBuilder(
     *                     context,
     *                     DictionaryDatabase::class.java, "Dictionary.db")
     *                     .createFromAsset("dictionary.db")
     *                     .allowMainThreadQueries()
     *                     .build()
     *         }
     *
     *         fun getInstance(): DictionaryDatabase = dictionaryDatabase!!
     *     }
     */

    abstract fun userDao(): UserDao

    companion object {
        private var appDatabase: AppDatabase? = null

        fun init(context: Context) {
            if (appDatabase == null) {
                appDatabase = Room.databaseBuilder(
                    context.applicationContext, AppDatabase::class.java, "effective_mobile_database"
                )
                    .allowMainThreadQueries()
                    .build()
            }
        }

        fun getInstance(): AppDatabase = appDatabase!!
    }
}