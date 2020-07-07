package com.RickProjects.roomdbcodelabs;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao /*The interface is now Identified as a DAO for Room DB*/
public interface WordDao {
    /*
     * The DAO validates the SQLite at runtime.
     * It's also used to access data from the Room database
     */

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Word word);

    @Query("DELETE FROM word_table")
    void deleteAll();

    @Query("SELECT * FROM word_table ORDER BY word ASC")
    LiveData<List<Word>> getAlphabetizedWords();
}
