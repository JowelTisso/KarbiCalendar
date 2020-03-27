package com.jangphong.hem.karbicalender2;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class StoredNotesDisplayActivity extends AppCompatActivity {

    TextView savedDate;
    EditText title, notes;
    FloatingActionButton notesSaveBtn;
    DatabaseHelper myDB;
    ImageView topBackBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stored_notes_display);

        savedDate = findViewById(R.id.savedDatePreview2);
        title = findViewById(R.id.titleField2);
        notes = findViewById(R.id.textField2);
        notesSaveBtn = findViewById(R.id.save_notes_btn);
        myDB = new DatabaseHelper(this);
        topBackBtn = findViewById(R.id.backBtn);


        final Intent i = getIntent();

        notes.setText(i.getStringExtra("notesKey"));
        title.setText(i.getStringExtra("titleKey"));
        savedDate.setText(i.getStringExtra("dateKey"));

        notesSaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String TitleStore = title.getText().toString();
                String NotesStore = notes.getText().toString();
                String id = i.getStringExtra("idKey");

                if (TitleStore.length()!=0) {

                    updateData(NotesStore,TitleStore, id);

                } else {

                    Toast.makeText(StoredNotesDisplayActivity.this, "Field is Empty", Toast.LENGTH_SHORT).show();

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

    public void updateData(String notes, String title, String id) {

        boolean insertData = myDB.update(notes, title, id);

        if (insertData == true) {
            Toast.makeText(StoredNotesDisplayActivity.this, "Data updated successfully", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(StoredNotesDisplayActivity.this, "Something went wrong!!", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(StoredNotesDisplayActivity.this, NotesActivity.class);
        startActivity(intent);
        finish();
    }
}
