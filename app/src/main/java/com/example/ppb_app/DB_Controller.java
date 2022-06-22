package com.example.ppb_app;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.TextView;
public class DB_Controller extends SQLiteOpenHelper{
    public DB_Controller(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, "Mhs.DB", factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase){
        sqLiteDatabase.execSQL("CREATE TABLE MAHASISWA(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT UNIQUE, SURNAME TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int j){
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS MAHASISWA");
        onCreate(sqLiteDatabase);
    }

    public void tambah_mahasiswa(String name, String surname){
        ContentValues contentValues = new ContentValues();
        contentValues.put("NAME", name);
        contentValues.put("SURNAME", surname);
        this.getWritableDatabase().insertOrThrow("MAHASISWA", "", contentValues);
    }
    public void hapus_mahasiswa(String name){
        this.getWritableDatabase().delete("MAHASISWA","NAME='"+name+"'", null);
    }

    public void edit_mahasiswa(String old_name, String new_name){
        this.getWritableDatabase().execSQL("UPDATE MAHASISWA SET NAME = '"+new_name+"' WHERE NAME = '"+old_name+"'");
    }
    public void list_mahasiswa(TextView tvHasildata){
        Cursor cursor = this.getReadableDatabase().rawQuery("SELECT * FROM MAHASISWA", null);
        tvHasildata.setText("");
        while (cursor.moveToNext()){
            tvHasildata.append(cursor.getString(1) + " " + cursor.getString(2) + "\n");
        }
    }
}
