package com.example.dgsmatikkk;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {

        private static final String DATABASE_NAME = "DATABASE";
        private static final int DATABASE_VERSION=1;
        private static String DENEMELER ="Deneme";

        public static final String ROW_ID="id";
        public static final String ROW_NAME="ad";
        public static final String ROW_FIRSTSKOR="say";
        public  static final String ROW_SECONDSKOR="söz";






    public DatabaseHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL("CREATE TABLE " + DENEMELER + "("+ROW_ID+" INTEGER PRIMARY KEY ,"+ROW_NAME+" TEXT NOT NULL ,"+ROW_FIRSTSKOR+"TEXT NOT NULL,"+ROW_SECONDSKOR+"TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
    db.execSQL("DROP TABLE IF EXISTS "+DENEMELER);
    onCreate(db);

    }

    public void VeriEkle(String ad,String say , String söz){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(ROW_NAME,ad.trim());
        cv.put(ROW_FIRSTSKOR,say.trim());
        cv.put(ROW_SECONDSKOR,söz.trim());
        db.insert(DENEMELER,null,cv);
        db.close();


    }

    public List<String> VeriListele(){

        List<String> veriler = new ArrayList<String>();
        SQLiteDatabase db = this.getWritableDatabase();
        String[] sutunlar = {ROW_ID,ROW_NAME,ROW_FIRSTSKOR,ROW_SECONDSKOR};
        Cursor cursor=  db.query(DENEMELER,sutunlar,null,null,null,null,null);
        while (cursor.moveToNext()){
            veriler.add(cursor.getInt(0)+" - "+cursor.getString(1)+"-"+cursor.getString(2) +"-"+cursor.getString(3));
        }
                return veriler;
    }
}
