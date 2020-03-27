package com.jangphong.hem.karbicalender2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class jan extends AppCompatActivity {

    FloatingActionButton fab;
    EditText txt,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12,txt13,txt14,txt15,txt16,txt17,txt18,txt19,txt20,txt21,txt22,txt23,txt24,txt25,txt26,txt27,txt28,txt29,txt30,txt31;

    String str;
    String date;
    int dateInt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jan);

        fab = findViewById(R.id.fab_save);
        txt = findViewById(R.id.editText);
        txt2 = findViewById(R.id.editText2);
        txt3 = findViewById(R.id.editText3);
        txt4 = findViewById(R.id.editText4);
        txt5 = findViewById(R.id.editText5);
        txt6 = findViewById(R.id.editText6);
        txt7 = findViewById(R.id.editText7);
        txt8 = findViewById(R.id.editText8);
        txt9 = findViewById(R.id.editText9);
        txt10 = findViewById(R.id.editText10);
        txt11 = findViewById(R.id.editText11);
        txt12 = findViewById(R.id.editText12);
        txt13 = findViewById(R.id.editText13);
        txt14 = findViewById(R.id.editText14);
        txt15 = findViewById(R.id.editText15);
        txt16 = findViewById(R.id.editText16);
        txt17 = findViewById(R.id.editText17);
        txt18 = findViewById(R.id.editText18);
        txt19 = findViewById(R.id.editText19);
        txt20 = findViewById(R.id.editText20);
        txt21 = findViewById(R.id.editText21);
        txt22 = findViewById(R.id.editText22);
        txt23 = findViewById(R.id.editText23);
        txt24 = findViewById(R.id.editText24);
        txt25 = findViewById(R.id.editText25);
        txt26 = findViewById(R.id.editText26);
        txt27 = findViewById(R.id.editText27);
        txt28 = findViewById(R.id.editText28);
        txt29 = findViewById(R.id.editText29);
        txt30 = findViewById(R.id.editText30);
        txt31 = findViewById(R.id.editText31);




        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                Toast.makeText(jan.this,"Saved", Toast.LENGTH_SHORT).show();

                //To save data
                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(jan.this);
                SharedPreferences.Editor editor = prefs.edit();

                str = txt.getText().toString();
                editor.putString("str",str);

                str = txt2.getText().toString();
                editor.putString("str2",str);
                str = txt3.getText().toString();
                editor.putString("str3",str);
                str = txt4.getText().toString();
                editor.putString("str4",str);
                str = txt5.getText().toString();
                editor.putString("str5",str);
                str = txt6.getText().toString();
                editor.putString("str6",str);
                str = txt7.getText().toString();
                editor.putString("str7",str);
                str = txt8.getText().toString();
                editor.putString("str8",str);
                str = txt9.getText().toString();
                editor.putString("str9",str);
                str = txt10.getText().toString();
                editor.putString("str10",str);
                str = txt11.getText().toString();
                editor.putString("str11",str);
                str = txt12.getText().toString();
                editor.putString("str12",str);
                str = txt13.getText().toString();
                editor.putString("str13",str);
                str = txt14.getText().toString();
                editor.putString("str14",str);
                str = txt15.getText().toString();
                editor.putString("str15",str);
                str = txt16.getText().toString();
                editor.putString("str16",str);
                str = txt17.getText().toString();
                editor.putString("str17",str);
                str = txt18.getText().toString();
                editor.putString("str18",str);
                str = txt19.getText().toString();
                editor.putString("str19",str);
                str = txt20.getText().toString();
                editor.putString("str20",str);
                str = txt21.getText().toString();
                editor.putString("str21",str);
                str = txt22.getText().toString();
                editor.putString("str22",str);
                str = txt23.getText().toString();
                editor.putString("str23",str);
                str = txt24.getText().toString();
                editor.putString("str24",str);
                str = txt25.getText().toString();
                editor.putString("str25",str);
                str = txt26.getText().toString();
                editor.putString("str26",str);
                str = txt27.getText().toString();
                editor.putString("str27",str);
                str = txt28.getText().toString();
                editor.putString("str28",str);
                str = txt29.getText().toString();
                editor.putString("str29",str);
                str = txt30.getText().toString();
                editor.putString("str30",str);
                str = txt31.getText().toString();
                editor.putString("str31",str);


                editor.apply();

                //To save data


            }
        });

        //To retrieve data from sharedPreference
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String str1 = prefs.getString("str","");
        txt.setText(str1);
        String str2 = prefs.getString("str2","");
        txt2.setText(str2);
        String str3 = prefs.getString("str3","");
        txt3.setText(str3);
        String str4 = prefs.getString("str4","");
        txt4.setText(str4);
        String str5 = prefs.getString("str5","");
        txt5.setText(str5);
        String str6 = prefs.getString("str6","");
        txt6.setText(str6);
        String str7 = prefs.getString("str7","");
        txt7.setText(str7);
        String str8 = prefs.getString("str8","");
        txt8.setText(str8);
        String str9 = prefs.getString("str9","");
        txt9.setText(str9);
        String str10 = prefs.getString("str10","");
        txt10.setText(str10);
        String str11 = prefs.getString("str11","");
        txt11.setText(str11);
        String str12 = prefs.getString("str12","");
        txt12.setText(str12);
        String str13 = prefs.getString("str13","");
        txt13.setText(str13);
        String str14 = prefs.getString("str14","");
        txt14.setText(str14);
        String str15 = prefs.getString("str15","");
        txt15.setText(str15);
        String str16 = prefs.getString("str16","");
        txt16.setText(str16);
        String str17 = prefs.getString("str17","");
        txt17.setText(str17);
        String str18 = prefs.getString("str18","");
        txt18.setText(str18);
        String str19 = prefs.getString("str19","");
        txt19.setText(str19);
        String str20 = prefs.getString("str20","");
        txt20.setText(str20);
        String str21 = prefs.getString("str21","");
        txt21.setText(str21);
        String str22 = prefs.getString("str22","");
        txt22.setText(str22);
        String str23 = prefs.getString("str23","");
        txt23.setText(str23);
        String str24 = prefs.getString("str24","");
        txt24.setText(str24);
        String str25 = prefs.getString("str25","");
        txt25.setText(str25);
        String str26 = prefs.getString("str26","");
        txt26.setText(str26);
        String str27 = prefs.getString("str27","");
        txt27.setText(str27);
        String str28 = prefs.getString("str28","");
        txt28.setText(str28);
        String str29 = prefs.getString("str29","");
        txt29.setText(str29);
        String str30 = prefs.getString("str30","");
        txt30.setText(str30);
        String str31 = prefs.getString("str31","");
        txt31.setText(str31);
        //Activity.Context.method();
        MainActivity.mainActivity.finish();

        Intent i = getIntent();
        date = i.getStringExtra("date2");
        dateInt2 = i.getIntExtra("dateInt2",0);


        onFocus();



    }

  /*  public static void setDefaults(String key, String value, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key, value);
        editor.commit();
    }*/

    public static String getDefaults(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString(key, null);
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("key1","abc");
        i.putExtra("monthCount",0);
        startActivity(i);
        finish();
        overridePendingTransition(0, 0);
        //MainActivity main = new MainActivity();
        //main.setViewPagerItem(0);
    }

    public void onFocus()
    {
        switch (dateInt2) {
            case 1:
                txt.requestFocus();
                break;
            case 2:
                txt2.requestFocus();
                break;
            case 3:
                txt3.requestFocus();
                break;
            case 4:
                txt4.requestFocus();
                break;
            case 5:
                txt5.requestFocus();
                break;
            case 6:
                txt6.requestFocus();
                break;
            case 7:
                txt7.requestFocus();
                break;
            case 8:
                txt8.requestFocus();
                break;
            case 9:
                txt9.requestFocus();
                break;
            case 10:
                txt10.requestFocus();
                break;
            case 11:
                txt11.requestFocus();
                break;
            case 12:
                txt12.requestFocus();
                break;
            case 13:
                txt13.requestFocus();
                break;
            case 14:
                txt14.requestFocus();
                break;
            case 15:
                txt15.requestFocus();
                break;
            case 16:
                txt16.requestFocus();
                break;
            case 17:
                txt17.requestFocus();
                break;
            case 18:
                txt18.requestFocus();
                break;
            case 19:
                txt19.requestFocus();
                break;
            case 20:
                txt20.requestFocus();
                break;
            case 21:
                txt21.requestFocus();
                break;
            case 22:
                txt22.requestFocus();
                break;
            case 23:
                txt23.requestFocus();
                break;
            case 24:
                txt24.requestFocus();
                break;

            case 25:
                txt25.requestFocus();
                break;
            case 26:
                txt26.requestFocus();
                break;
            case 27:
                txt27.requestFocus();
                break;
            case 28:
                txt28.requestFocus();
                break;
            case 29:
                txt29.requestFocus();
                break;
            case 30:
                txt30.requestFocus();
                break;
            case 31:
                txt31.requestFocus();
                break;
        }

    }
}

