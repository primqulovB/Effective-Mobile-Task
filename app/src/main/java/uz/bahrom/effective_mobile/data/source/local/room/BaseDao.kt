package uz.bahrom.effective_mobile.data.source.local.room

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy

interface BaseDao<T> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(t: T)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(t: List<T>)

    @Delete
    fun delete(t: T)
}