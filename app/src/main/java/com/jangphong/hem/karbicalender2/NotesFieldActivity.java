package com.jangphong.hem.karbicalender2;

import android.content.Intent;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.jangphong.hem.karbicalender2.helperclass.DatabaseHelper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class NotesFieldActivity extends AppCompatActivity {

    TextView currentDate;
    EditText title, notes;
    FloatingActionButton notesAddBtn;
    DatabaseHelper myDB;
    ImageView topBackBtn;
    LinearLayout linearLayoutNotes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_field);

        currentDate = findViewById(R.id.currentDatePreview);
        title = findViewById(R.id.titleField);
        notes = findViewById(R.id.textField);
        notesAddBtn = findViewById(R.id.add_notes_btn);
        topBackBtn = findViewById(R.id.backBtn);
        linearLayoutNotes = findViewById(R.id.linearLayoutNotes);

        myDB = new DatabaseHelper(this);

        String date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
        currentDate.setText(date);

        notesAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String TitleStore = title.getText().toString();
                String NotesStore = notes.getText().toString();
                String DateStore = currentDate.getText().toString();

                if (TitleStore.length() != 0 && NotesStore.length() != 0 && DateStore.length() != 0) {
                    AddData(DateStore, NotesStore, TitleStore);
                } else {
                    Snackbar.make(linearLayoutNotes,"Field is Empty",Snackbar.LENGTH_SHORT).show();
                }
            }
        });

        topBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    public void AddData(String date, String notes, String title) {
        boolean insertData = myDB.addDataToNotes(date, notes, title);

        if (insertData) {
            Snackbar.make(linearLayoutNotes,"Saved",Snackbar.LENGTH_SHORT).show();
        } else {
            Snackbar.make(linearLayoutNotes,"Something went wrong!",Snackbar.LENGTH_SHORT).show();
        }
    }

   /* @Override
    public void onBackPressed() {
        Intent intent = new Intent(NotesFieldActivity.this, NotesActivity.class);
        startActivity(intent);
        finish();
    }*/
}
