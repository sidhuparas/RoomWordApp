package com.parassidhu.roomwordsample.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "word_table")
public class Word {

    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    @PrimaryKey(autoGenerate = true)
    private int id; // Not used in codelab, but used to persist data even after app restart

    public Word(String mWord) {
        this.mWord = mWord;
    }

    public String getWord() {
        return mWord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
