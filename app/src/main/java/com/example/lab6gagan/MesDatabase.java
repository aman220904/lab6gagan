
package com.example.lab6gagan;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {ChatMessage.class}, version = 1)
public abstract class MesDatabase extends RoomDatabase {
    public abstract ChatMessageDAO chatMessageDAO();
}
