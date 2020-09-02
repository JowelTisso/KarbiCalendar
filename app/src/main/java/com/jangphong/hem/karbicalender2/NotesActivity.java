package com.jangphong.hem.karbicalender2;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.jangphong.hem.karbicalender2.adapters.NotesListAdapter;
import com.jangphong.hem.karbicalender2.helperclass.DatabaseHelper;

import java.util.ArrayList;

public class NotesActivity extends AppCompatActivity {

    FloatingActionButton fabAddNotesBtn;
    DatabaseHelper myDB;
    ArrayList<Item> notesList, idList;
    RecyclerView recyclerListView;
    Item item , item2;
    NotesListAdapter adapter;
    ImageView topBackBtn;
    LinearLayout linearLayoutParent;
    Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        fabAddNotesBtn = findViewById(R.id.to_notes_field_btn);
        myDB = new DatabaseHelper(this);
        notesList = new ArrayList<>();
        idList = new ArrayList<>();
        recyclerListView = findViewById(R.id.notesRecyclerList);
        topBackBtn =findViewById(R.id.backBtn);
        linearLayoutParent = findViewById(R.id.linearLayoutParent);
        activity = getParent();

        fabAddNotesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(NotesActivity.this, NotesFieldActivity.class);
                startActivity(i);

            }
        });

        topBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

            adapter = new NotesListAdapter(this, R.layout.notes_list_model, notesList, linearLayoutParent, idList, activity);
            recyclerListView.setLayoutManager(new LinearLayoutManager(this));
            recyclerListView.setAdapter(adapter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        notesList.clear();
    }

    @Override
    protected void onResume() {
        super.onResume();
        final Cursor data = myDB.getListContentsFromNotesTable();
        int numRows = data.getCount();

        if (numRows != 0){
            while (data.moveToNext()) {
                item = new Item(data.getString(2), data.getString(1), data.getString(3));
                item2 = new Item(data.getString(0));
                notesList.add(item);
                idList.add(item2);
            }
        }
        adapter.notifyDataSetChanged();
    }
}
