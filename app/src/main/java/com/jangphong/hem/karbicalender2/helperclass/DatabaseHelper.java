package com.jangphong.hem.karbicalender2.helperclass;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Mitch on 2016-05-13.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "mylist.db";
    public static final String TABLE_NAME = "mylist_data";
    public static final String TABLE_NAME2 = "notes_data";
    public static final String COL1 = "ID";
    public static final String COL2 = "EVENT";
    public static final String COL3 = "TIME";
    public static final String COL4 = "DATE";
    public static final String COL5 = "UNIQUEID";
    public static final String COL6 = "NOTES_DATE";
    public static final String COL7 = "NOTES";
    public static final String COL8 = "NOTES_ID";
    public static final String COL9 = "NOTES_TITLE";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    String createTable = "CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
            " EVENT TEXT, TIME TEXT, DATE TEXT, UNIQUEID INTEGER) ";

    String createTable2 = "CREATE TABLE " + TABLE_NAME2 + " (NOTES_ID INTEGER PRIMARY KEY AUTOINCREMENT, " + " NOTES TEXT, NOTES_DATE TEXT, NOTES_TITLE TEXT) ";

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(createTable);
        db.execSQL(createTable2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME2);
        onCreate(db);
    }

    public boolean addData(String event1, String time1, String date1, int uniqueId) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2, event1);
        contentValues.put(COL3, time1);
        contentValues.put(COL4, date1);
        contentValues.put(COL5, uniqueId);

        long result = db.insert(TABLE_NAME, null, contentValues);

        //if data is inserted incorrectly it will return -1
        return result != -1;
    }

    public boolean addDataToNotes(String date, String notes, String title) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL6, date);
        contentValues.put(COL7, notes);
        contentValues.put(COL9, title);

        //db2.insert(TABLE_NAME2, null, contentValues2);

        long result = db.insert(TABLE_NAME2, null, contentValues);

        //if data is inserted incorrectly it will return -1
        return result != -1;
    }

    public boolean update(String notes,String title, String id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL7, notes);
        contentValues.put(COL9, title);
        long result = db.update(TABLE_NAME2,contentValues,"NOTES_ID = ?",new String[]{id});

        return result != -1;
    }

    public Integer deleteData(String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "EVENT = ?", new String[]{id});

    }

    public Integer deleteDataFromNotes(String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME2, "NOTES_TITLE = ?", new String[]{id});
    }

    public Cursor getListContents() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
        return data;
    }

    public Cursor getListContentsFromNotesTable() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT * FROM " + TABLE_NAME2, null);
        return data;
    }

}