package com.example.mytodolist;

/*
 * Created by Amrita Sapkota on 02/03/21.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class ToDoListDBHelper extends SQLiteOpenHelper {

    public ToDoListDBHelper(Context context) {
        super(context, ToDoListDB.DB_NAME, null, ToDoListDB.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + ToDoListDB.ToDoEntry.TABLE + " ( " +
                ToDoListDB.ToDoEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ToDoListDB.ToDoEntry.COL_TASK_TITLE + " TEXT NOT NULL);";

        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + ToDoListDB.ToDoEntry.TABLE);
        onCreate(db);
    }
}
