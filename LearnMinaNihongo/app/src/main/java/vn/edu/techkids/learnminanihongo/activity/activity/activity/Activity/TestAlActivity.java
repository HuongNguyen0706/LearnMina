package vn.edu.techkids.learnminanihongo.activity.activity.activity.Activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import vn.edu.techkids.learnminanihongo.R;

public class TestAlActivity extends AppCompatActivity {
    final CharSequence myList[] = {"05s", "10s", "15s", "20s", "25s", "30s"};
    final String arr1[] = {
            "Hiragana->Romaji",
            "Hiragana->Katakana",
            "Katatana->Romaji",
            "Katakana->Hiragana",
            "Romaji->Hiragana",
            "Romaji->Katakana"
    };
    final String arr2[] = {"seion", "dakuon", "youon"};
    private Spinner spinner1;
    private Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_al);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("Kiem tra bang chu cai");

        spinner1 = (Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arr1);
        //hien thi danh sach spinner
        adapter1.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(new MyProcessEvent());

        spinner2 = (Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arr2);
        //hien thi danh sach spinner
        adapter2.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new MyProcessEvent());
    }

    private class MyProcessEvent implements AdapterView.OnItemSelectedListener {


        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_test_alphabet, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent homeIntent = new Intent(this, AlphabetActivity.class);
                //homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
                break;
            case R.id.action_timer:
                final AlertDialog.Builder ad = new AlertDialog.Builder(this);
                ad.setTitle("Chon thoi gian dem lui");
                ad.setSingleChoiceItems(myList, -1, new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        Toast.makeText(getApplicationContext(),
                                "You Choose : " + myList[arg1],
                                Toast.LENGTH_LONG).show();

                        arg0.cancel();
                    }
                });
                ad.create();
                ad.show();

                break;
        }
        return super.onOptionsItemSelected(item);
    }


}
