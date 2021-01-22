package com.apkdoandroid.osstatus.helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Banco_BD extends SQLiteOpenHelper {
    public static int VERSION =3; /// na playstore ta versão 1
    public static String NOME_BD = "frases_bd";
    public static String TABELA = "frases";
    private Context context;
//    public static String
//    public static String

    public Banco_BD( Context context) {
        super(context,NOME_BD , null, VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        try{
            String sql = Sql.getSqlTabelaFrases();
            String sqlInset1 =  Sql.carregarFrases1();
            String sqlInset2 =  Sql.carregarFrases2();
            String sqlInset3 =  Sql.carregarFrases3();
            String sqlInset4 =  Sql.carregarFrases4();
            String sqlInset5 =  Sql.carregarFrases5();
            String sqlInset6 =  Sql.carregarFrases6();
            String sqlInset7 =  Sql.carregarFrases7();
            String sqlInset8 =  Sql.carregarFrases8();
            String sqlInset9 =  Sql.carregarFrases9();
            String sqlInset10 =  Sql.carregarFrases10();
            String sqlInset11 =  Sql.carregarFrases11();
            String sqlInset12 =  Sql.carregarFrases12();
            String sqlInset13 =  Sql.carregarFrases13();
            String sqlInset14 =  Sql.carregarFrases14();
            String sqlInset15 =  Sql.carregarFrases15();
            String sqlInset16 =  Sql.carregarFrases16();
            String sqlInset17 =  Sql.carregarFrases17();
            String sqlInset18 =  Sql.carregarFrases18();
            String sqlInset19 =  Sql.carregarFrases19();
            String sqlInset20 =  Sql.carregarFrases20();
            String sqlInset21 =  Sql.carregarFrases21();
            String sqlInset22 =  Sql.carregarFrases22();
            String sqlInset23 =  Sql.carregarFrases23();
            String sqlInset24 =  Sql.carregarFrases24();


            db.execSQL(sql);
            db.execSQL(sqlInset24);
            db.execSQL(sqlInset23);
            db.execSQL(sqlInset10);
            db.execSQL(sqlInset18);
            db.execSQL(sqlInset1);
            db.execSQL(sqlInset2);
            db.execSQL(sqlInset3);
            db.execSQL(sqlInset4);
            db.execSQL(sqlInset5);
            db.execSQL(sqlInset6);
            db.execSQL(sqlInset7);
            db.execSQL(sqlInset8);
            db.execSQL(sqlInset9);
            db.execSQL(sqlInset11);
            db.execSQL(sqlInset12);
            db.execSQL(sqlInset13);
            db.execSQL(sqlInset14);
            db.execSQL(sqlInset15);
            db.execSQL(sqlInset16);
            db.execSQL(sqlInset17);
            db.execSQL(sqlInset19);
            db.execSQL(sqlInset20);
            db.execSQL(sqlInset21);
            db.execSQL(sqlInset22);

            Log.i("INFO DB", "Sucesso ao criar TABELA" );
        }catch (SQLException e){
            e.printStackTrace();
            Log.i("INFO DB", "Erro ao criar TABELA" +e.getMessage());
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //atualizar bd
//        try{
//            String sqlInset9 =  Sql.carregarFrases9();
//            String sql = Sql.getSqlTabelaFrases();
//            db.execSQL(sqlInset9);
////            onUpgrade(db,1,2);
//          //  db.execSQL("drop table frases");
//           // onCreate(db);
//            //db.execSQL(sqlInset9);
//            Log.i("INFO DB", "Update Banco sucesso " );
//
//
//        }catch (SQLException e){
//            Log.i("INFO DB", "Erro: "+e.getMessage() );
//        }
//


    }




}
