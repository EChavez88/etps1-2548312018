package Parcial_4_2548312018.SQLIte;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NOMBRE = "Parcial4.db";


    public BaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("CREATE TABLE MD_Vehiculos (" +
                "ID_Vehiculo INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "sMarca INTEGER, " +
                "sModelo INTEGER);");

        DB.execSQL("CREATE TABLE MD_Clientes (" +
                "ID_Cliente INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "sNombreCliente TEXT, " +
                "sApellidoCliente TEXT," +
                "sDireccionCliente TEXT," +
                "sCiudadCliente TEXT);");

        DB.execSQL("CREATE TABLE MD_ClienteVehiculo (" +
                "idCliente INTEGER," +
                "idVehiculo INTEGER," +
                "sMatricula TEXT," +
                "iKilometro REAL," +
                "FOREIGN KEY(idCliente) REFERENCES MD_Clientes(ID_Cliente)," +
                "FOREIGN KEY(idVehiculo) REFERENCES MD_Vehiculos(ID_Vehiculo));");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
