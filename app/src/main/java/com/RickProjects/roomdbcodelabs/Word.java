package com.RickProjects.roomdbcodelabs;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table") /*Table Name*/
public class Word {

    @PrimaryKey /*Indicates The Primary Key*/
    @NonNull /*Indicates that the value should never Be Null*/
    @ColumnInfo(name = "word") /*Attribute Name*/
    private String mWord;

    public Word(@NonNull String word) {
        this.mWord = word;
    }

    private String getWord() {
        return mWord;
    }
}
