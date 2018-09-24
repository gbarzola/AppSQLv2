package app.upc.com.appsql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import static app.upc.com.appsql.Constants.*;

public class SQLiteHelper extends SQLiteOpenHelper {

    String SQLString1 = "CREATE TABLE "+TABLA_TELEFONOS+"("+COLUMN_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+COLUMN_TITULO+" TEXT, "+COLUMN_TELEFONO+" TEXT "+")";
    String SQLString2 = "DROP TABLE IF EXISTS "+TABLA_TELEFONOS;


    public SQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQLString1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(SQLString2);
        sqLiteDatabase.execSQL(SQLString1);
    }
}
