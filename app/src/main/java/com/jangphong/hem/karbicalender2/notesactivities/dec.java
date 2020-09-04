package com.jangphong.hem.karbicalender2.notesactivities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.jangphong.hem.karbicalender2.MainActivity;
import com.jangphong.hem.karbicalender2.R;

public class dec extends AppCompatActivity {

    FloatingActionButton fab2;
    EditText txt,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12,txt13,txt14,txt15,txt16,txt17,txt18,txt19,txt20,txt21,txt22,txt23,txt24,txt25,txt26,txt27,txt28,txt29,txt30,txt31;

    String str2;
    String date;
    int dateInt2;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dec);

        relativeLayout = findViewById(R.id.relativeLayoutDecember);
        fab2 =  findViewById(R.id.fab2_save);
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





        //To retrieve data from sharedPreference
        SharedPreferences prefsfeb = PreferenceManager.getDefaultSharedPreferences(this);
        String strfeb1 = prefsfeb.getString("strdec","");
        txt.setText(strfeb1);
        String strfeb2 = prefsfeb.getString("strdec2","");
        txt2.setText(strfeb2);
        String strfeb3 = prefsfeb.getString("strdec3","");
        txt3.setText(strfeb3);
        String str4 = prefsfeb.getString("strdec4","");
        txt4.setText(str4);
        String str5 = prefsfeb.getString("strdec5","");
        txt5.setText(str5);
        String str6 = prefsfeb.getString("strdec6","");
        txt6.setText(str6);
        String str7 = prefsfeb.getString("strdec7","");
        txt7.setText(str7);
        String str8 = prefsfeb.getString("strdec8","");
        txt8.setText(str8);
        String str9 = prefsfeb.getString("strdec9","");
        txt9.setText(str9);
        String str10 = prefsfeb.getString("strdec10","");
        txt10.setText(str10);
        String str11 = prefsfeb.getString("strdec11","");
        txt11.setText(str11);
        String str12 = prefsfeb.getString("strdec12","");
        txt12.setText(str12);
        String str13 = prefsfeb.getString("strdec13","");
        txt13.setText(str13);
        String str14 = prefsfeb.getString("strdec14","");
        txt14.setText(str14);
        String str15 = prefsfeb.getString("strdec15","");
        txt15.setText(str15);
        String str16 = prefsfeb.getString("strdec16","");
        txt16.setText(str16);
        String str17 = prefsfeb.getString("strdec17","");
        txt17.setText(str17);
        String str18 = prefsfeb.getString("strdec18","");
        txt18.setText(str18);
        String str19 = prefsfeb.getString("strdec19","");
        txt19.setText(str19);
        String str20 = prefsfeb.getString("strdec20","");
        txt20.setText(str20);
        String str21 = prefsfeb.getString("strdec21","");
        txt21.setText(str21);
        String str22 = prefsfeb.getString("strdec22","");
        txt22.setText(str22);
        String str23 = prefsfeb.getString("strdec23","");
        txt23.setText(str23);
        String str24 = prefsfeb.getString("strdec24","");
        txt24.setText(str24);
        String str25 = prefsfeb.getString("strdec25","");
        txt25.setText(str25);
        String str26 = prefsfeb.getString("strdec26","");
        txt26.setText(str26);
        String str27 = prefsfeb.getString("strdec27","");
        txt27.setText(str27);
        String str28 = prefsfeb.getString("strdec28","");
        txt28.setText(str28);
        String str29 = prefsfeb.getString("strdec29","");
        txt29.setText(str29);
        String str30 = prefsfeb.getString("strdec30","");
        txt30.setText(str30);
        String str31 = prefsfeb.getString("strdec31","");
        txt31.setText(str31);




        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                Snackbar.make(relativeLayout, "Saved",Snackbar.LENGTH_SHORT).show();

                //To save data
                SharedPreferences prefsfeb = PreferenceManager.getDefaultSharedPreferences(dec.this);
                SharedPreferences.Editor editor = prefsfeb.edit();

                str2 = txt.getText().toString();
                editor.putString("strdec",str2);

                str2 = txt2.getText().toString();
                editor.putString("strdec2",str2);
                str2 = txt3.getText().toString();
                editor.putString("strdec3",str2);
                str2 = txt4.getText().toString();
                editor.putString("strdec4",str2);
                str2 = txt5.getText().toString();
                editor.putString("strdec5",str2);
                str2 = txt6.getText().toString();
                editor.putString("strdec6",str2);
                str2 = txt7.getText().toString();
                editor.putString("strdec7",str2);
                str2 = txt8.getText().toString();
                editor.putString("strdec8",str2);
                str2 = txt9.getText().toString();
                editor.putString("strdec9",str2);
                str2 = txt10.getText().toString();
                editor.putString("strdec10",str2);
                str2 = txt11.getText().toString();
                editor.putString("strdec11",str2);
                str2 = txt12.getText().toString();
                editor.putString("strdec12",str2);
                str2 = txt13.getText().toString();
                editor.putString("strdec13",str2);
                str2 = txt14.getText().toString();
                editor.putString("strdec14",str2);
                str2 = txt15.getText().toString();
                editor.putString("strdec15",str2);
                str2 = txt16.getText().toString();
                editor.putString("strdec16",str2);
                str2 = txt17.getText().toString();
                editor.putString("strdec17",str2);
                str2 = txt18.getText().toString();
                editor.putString("strdec18",str2);
                str2 = txt19.getText().toString();
                editor.putString("strdec19",str2);
                str2 = txt20.getText().toString();
                editor.putString("strdec20",str2);
                str2 = txt21.getText().toString();
                editor.putString("strdec21",str2);
                str2 = txt22.getText().toString();
                editor.putString("strdec22",str2);
                str2 = txt23.getText().toString();
                editor.putString("strdec23",str2);
                str2 = txt24.getText().toString();
                editor.putString("strdec24",str2);
                str2 = txt25.getText().toString();
                editor.putString("strdec25",str2);
                str2 = txt26.getText().toString();
                editor.putString("strdec26",str2);
                str2 = txt27.getText().toString();
                editor.putString("strdec27",str2);
                str2 = txt28.getText().toString();
                editor.putString("strdec28",str2);
                str2 = txt29.getText().toString();
                editor.putString("strdec29",str2);
                str2 = txt30.getText().toString();
                editor.putString("strdec30",str2);
                str2 = txt31.getText().toString();
                editor.putString("strdec31",str2);




                editor.apply();

                //To save data


            }
        });

        //Activity.Context.method();
        MainActivity.mainActivity.finish();

        Intent i = getIntent();
        date = i.getStringExtra("date2");
        dateInt2 = i.getIntExtra("dateInt2",0);

        onFocus();



    }

    public static String getDefaults(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString(key, null);
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("key1","abc");
        i.putExtra("monthCount",11);
        startActivity(i);
        finish();
        overridePendingTransition(0, 0);
        // MainActivity main = new MainActivity();
        //  main.setViewPagerItem(1);

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
