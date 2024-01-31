package uz.bahrom.effective_mobile.data.source.local.room.dao

import androidx.room.Dao
import androidx.room.Query
import uz.bahrom.effective_mobile.data.source.local.room.BaseDao
import uz.bahrom.effective_mobile.data.source.local.room.entity.UserEntity

@Dao
interface UserDao : BaseDao<UserEntity> {
    /**
     *     @Query("SELECT * FROM dictionary")
     *     fun getAllWords(): List<WordEntity>
     *
     *     @Query("UPDATE dictionary SET is_favourite = :favorite WHERE id = :id")
     *     fun updateFav(id: Int, favorite: Int)
     *
     *     @Query("SELECT *FROM dictionary")
     *     fun getAllWordsCursor(): Cursor
     *
     *     @Query("SELECT * FROM dictionary WHERE english LIKE :search_query||'%'")
     *     fun searchDatabase(search_query: String): List<WordEntity>
     *
     *     @Query("SELECT * FROM dictionary WHERE is_favourite LIKE :select")
     *     fun favoriteDatabase(select: Int): List<WordEntity>
     *
     *     @Query("SELECT * FROM dictionary WHERE english LIKE :select||'%'")
     *     fun selectDatabase(select: String): List<WordEntity>
     *
     *     @Query("SELECT * FROM dictionary WHERE is_favourite LIKE :select and english LIKE :query||'%'")
     *     fun favoritesDatabase(select: Int, query: String): List<WordEntity>
     */
    @Query("SELECT * FROM effective_mobile")
    fun getAllUser(): List<UserEntity>
}