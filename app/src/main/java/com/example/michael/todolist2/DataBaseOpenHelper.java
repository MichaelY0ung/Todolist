package com.example.michael.todolist2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by michael on 2016/7/7.
 */
public class DataBaseOpenHelper extends SQLiteOpenHelper{
    private static final String DBNAME = "list";
    private static final int VERSION = 1;
    public DataBaseOpenHelper(Context context){
        super(context,DBNAME,null,VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("create table list(listid integer primary key,title varchar(20),text varchar(400),status integer");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
        db.execSQL("drop table if exists list");
        onCreate(db);
    }
}
