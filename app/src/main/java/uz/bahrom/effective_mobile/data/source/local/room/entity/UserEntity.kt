package uz.bahrom.effective_mobile.data.source.local.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "effective_mobile")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo("is_favourite")
    val firstName: String,
    @ColumnInfo("is_favourite")
    val lastName: String,
    @ColumnInfo("is_favourite")
    val phoneNumber: String
)
