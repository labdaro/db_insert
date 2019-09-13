package com.example.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
var DB_NAME ="student"
val TABLE_NAME = "Staff"
val COLUMN1 = "city"
val COLUMN2 = "sname"

class MyHelper(context: Context):SQLiteOpenHelper(context, DB_NAME,null,1){
    override fun onCreate(p0: SQLiteDatabase?) {
        var table_create = "create table $TABLE_NAME($COLUMN1 varchar(250), $COLUMN2 varchar(250))"
        p0?.execSQL(table_create)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    fun saveData(dto:Staff):Long{

        var cv = ContentValues()
        cv.put(COLUMN1,dto.city)
        cv.put(COLUMN2,dto.sname)

        var db = this.writableDatabase
        var res = db.insert(TABLE_NAME,null,cv)
        return res
    }
}