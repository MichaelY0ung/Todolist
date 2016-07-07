package com.example.michael.todolist2;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by michael on 2016/7/7.
 */
public class ListService {
    private static final String TAG = "ListService";
    private DataBaseOpenHelper dataBaseOpenHelper;
    private SQLiteDatabase database;
    public ListService(Context context){
        dataBaseOpenHelper = new DataBaseOpenHelper(context);
    }
    public void save(){
        database = dataBaseOpenHelper.getWritableDatabase();
        database.beginTransaction();
        try{

        }
        catch (Exception e){
            e.printStackTrace();
        }
        database.endTransaction();

    }
    public java.util.List<List> getScollData(int startResult,int maxResult){
        java.util.List<List> list = new ArrayList<List>();
        database = dataBaseOpenHelper.getReadableDatabase();
        Cursor cursor = database.rawQuery("select * from list limit ?,?",new String[]{String.valueOf(startResult),String.valueOf(maxResult)});
        while(cursor.moveToNext()){
            list.add(new List(cursor.getInt(0),cursor.getString(1),cursor.getString(2),cursor.getInt(3)));

        }
        return list;
    }
}
