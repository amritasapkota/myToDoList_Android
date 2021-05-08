package com.example.mytodolist;

/*
 * Created by Amrita Sapkota on 02/03/21.
 */

import android.provider.BaseColumns;

public class ToDoListDB {
    public static final String DB_NAME = "com.amrita.todolist.db";
    public static final int DB_VERSION = 1;

    public class ToDoEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}
