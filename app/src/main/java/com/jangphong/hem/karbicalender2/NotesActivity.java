package com.jangphong.hem.karbicalender2;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.jangphong.hem.karbicalender2.adapters.NotesListAdapter;
import com.jangphong.hem.karbicalender2.helperclass.DatabaseHelper;

import java.util.ArrayList;

public class NotesActivity extends AppCompatActivity {

    FloatingActionButton fabAddNotesBtn;
    DatabaseHelper myDB;
    ArrayList<Item> notesList, idList;
    ListView listView;
    Item item , item2;
    NotesListAdapter adapter;
    ImageView topBackBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        fabAddNotesBtn = findViewById(R.id.to_notes_field_btn);
        myDB = new DatabaseHelper(this);
        notesList = new ArrayList<>();
        idList = new ArrayList<>();
        listView = findViewById(R.id.notesList);
        topBackBtn =findViewById(R.id.backBtn);

        fabAddNotesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(NotesActivity.this, NotesFieldActivity.class);
                startActivity(i);
                finish();
            }
        });

        topBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        final Cursor data = myDB.getListContentsFromNotesTable();
        int numRows = data.getCount();

        if (numRows == 0) {
            Toast.makeText(NotesActivity.this, "Empty Database ", Toast.LENGTH_SHORT).show();
        } else {
            while (data.moveToNext()) {
                item = new Item(data.getString(2), data.getString(1), data.getString(3));
                item2 = new Item(data.getString(0));
                notesList.add(item);
                idList.add(item2);


            }

            adapter = new NotesListAdapter(NotesActivity.this, R.layout.notes_list_model, notesList);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, final int position, long id) {


                    Item s = notesList.get(position);
                    Item idx = idList.get(position);
                   // Toast.makeText(NotesActivity.this, "Data Not Deleted", Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(NotesActivity.this, StoredNotesDisplayActivity.class);

                    i.putExtra("notesKey", s.getNotes());
                    i.putExtra("titleKey", s.getNotesTitle());
                    i.putExtra("dateKey", s.getNotesDate());
                    i.putExtra("idKey", idx.getId());
                    startActivity(i);
                    finish();


                }


            });


            listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
                @Override
                public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long l) {


                    AlertDialog.Builder alertBuilder = new AlertDialog.Builder(NotesActivity.this);
                    alertBuilder.setTitle("Delete?");

                    final Item itemCall = notesList.get(position);// Most Important to get the list of array stored in ArrayList<Item> by clicking the  position

                    //final int uid = itemCall.getUniqueId();

                    alertBuilder.setMessage("Are You Sure You Wanna Delete? ");
                    final String positionToRemove = itemCall.getNotesTitle(); // To get the event name from the item class which has the data


                    alertBuilder.setNegativeButton("Cancel", null);
                    alertBuilder.setPositiveButton("Ok", new AlertDialog.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {


                            Integer deletedRows = myDB.deleteDataFromNotes(positionToRemove);
                            if (deletedRows > 0) {

                                Toast.makeText(NotesActivity.this, "Data Deleted", Toast.LENGTH_SHORT).show();
                                finish();
                                overridePendingTransition(0, 0);
                                startActivity(getIntent());
                            } else
                                Toast.makeText(NotesActivity.this, "Data Not Deleted", Toast.LENGTH_SHORT).show();


                        }
                    });
                    alertBuilder.show();

                    return true;
                }
            });


        }


    }
}
