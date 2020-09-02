package com.jangphong.hem.karbicalender2;

import android.content.Intent;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.jangphong.hem.karbicalender2.notesactivities.april;
import com.jangphong.hem.karbicalender2.notesactivities.august;
import com.jangphong.hem.karbicalender2.notesactivities.dec;
import com.jangphong.hem.karbicalender2.notesactivities.feb;
import com.jangphong.hem.karbicalender2.notesactivities.jan;
import com.jangphong.hem.karbicalender2.notesactivities.july;
import com.jangphong.hem.karbicalender2.notesactivities.june;
import com.jangphong.hem.karbicalender2.notesactivities.march;
import com.jangphong.hem.karbicalender2.notesactivities.may;
import com.jangphong.hem.karbicalender2.notesactivities.nov;
import com.jangphong.hem.karbicalender2.notesactivities.oct;
import com.jangphong.hem.karbicalender2.notesactivities.sep;

public class HolidayPopupWindow extends AppCompatActivity {

    TextView t1, t2, t3, t4;
    FloatingActionButton addBtn;
    Class cls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holiday_popup_window);

        t1 = findViewById(R.id.notePlace);
        t2 = findViewById(R.id.holidayPlace);
        t3 = findViewById(R.id.dayPlace);
        t4 = findViewById(R.id.datePlace);

        addBtn = findViewById(R.id.addNotesBtn);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.3));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y = -50;

        getWindow().setAttributes(params);

        Intent intent = getIntent();
        final String a = intent.getStringExtra("holiday");
        String b = intent.getStringExtra("note");
        final String c = intent.getStringExtra("dayName");
        final String d = intent.getStringExtra("date");
        final int e = intent.getIntExtra("dateInt",0);
        int monthId = intent.getIntExtra("month",0);
        t2.setText(a);
        t1.setText(b);
        t3.setText(c);
        t4.setText(d);

        switch (monthId) {
            case 1:
                cls = jan.class;
                break;
            case 2:
                cls = feb.class;
                break;
            case 3:
                cls = march.class;
                break;
            case 4:
                cls = april.class;
                break;
            case 5:
                cls = may.class;
                break;
            case 6:
                cls = june.class;
                break;
            case 7:
                cls = july.class;
                break;
            case 8:
                cls = august.class;
                break;
            case 9:
                cls = sep.class;
                break;
            case 10:
                cls = oct.class;
                break;
            case 11:
                cls = nov.class;
                break;
            case 12:
                cls = dec.class;
                break;
        }

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(HolidayPopupWindow.this,cls);
                intent1.putExtra("date2",d);
                intent1.putExtra("dateInt2",e);
                //intent1.putExtra("dayName2",c);
                startActivity(intent1);
                finish();
                //overridePendingTransition(0, 0);
            }
        });



    }
}
