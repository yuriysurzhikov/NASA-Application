package com.yuriysurzhikov.nasaapplication.repository.room.dailypost

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "dailyPosts")
data class DailyPostCacheEntity(
    @ColumnInfo(name = "date")
    var date: String,
    @PrimaryKey
    @ColumnInfo(name = "title")
    var title: String,
    @ColumnInfo(name = "explanation")
    var explanation: String,
    @ColumnInfo(name = "hdUrl")
    var hdUrl: String
)