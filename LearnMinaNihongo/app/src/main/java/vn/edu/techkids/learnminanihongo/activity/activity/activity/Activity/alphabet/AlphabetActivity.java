package vn.edu.techkids.learnminanihongo.activity.activity.activity.Activity.alphabet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

import vn.edu.techkids.learnminanihongo.R;
import vn.edu.techkids.learnminanihongo.activity.activity.activity.Activity.MainActivity;

public class AlphabetActivity extends AppCompatActivity {
    private GridView gridView;
    private ArrayAdapter adapter;

    //dung mang 1 chieu de luu du lieu
    String arr[]  = {"あ\na", "い\ni", "う\nu", "え\ne", "お\no",
                    "か\nka", "き\nki", "く\nku", "け\nke", "こ\nko",
                    "さ\nsa", "し\nshi", "す\nsu", "せ\nse", "そ\nso",
                    "た\nta", "ち\nchi", "つ\ntsu", "て\nte", "と\nto",
                    "な\nna", "に\nni", "ぬ\nnu", "ね\nne", "の\nno",
                    "は\nha", "ひ\nhi", "ふ\nfu", "へ\nhe", "ほ\nho",
                    "ま\nma", "み\nmi", "む\nmu", "め\nme", "も\nmo",
                    "や\nya", " ", "ゆ\nyu", " ", "よ\nyo",
                    "ら\nra", "り\nri", "る\nru", "れ\nre", "ろ\nro",
                    "わ\nwa", " ", " ", " ", "を\nwo",
                    " ", " ", "ん\nn", " ", " ",
                    "が\nga", "ぎ\ngi", "ぐ\ngu", "げ\nge", "ご\ngo",
                    "ざ\nza", "じ\nji", "ず\nzu", "ぜ\nze", "ぞ\nzo",
                    "だ\nda", "ぢ\ndi", "づ\ndu", "で\nde", "ど\ndo",
                    "ば\nba", "び\nbi", "ぶ\nbu", "べ\nbe", "ぼ\nbo",
                    "ぱ\npa", "ぴ\npi", "ぷ\npu", "ぺ\npe", "ぽ\npo",
                    "きゃ\nkya", " ", "きゅ\nkyu", " ", "きょ\nkyo",
                    
                    "しゃ\nsha", " ", "しゅ\nsyu", " ", "しょ\nsyo",
                    "じゃ\nja", " ", "じゅ\nju", " ", "じょ\njo",
                    "ちゃ\ncha", " ", "ちゅ\nchu", " ", "ちょ\ncho",


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("Bang Chu cai");

        //doi tuong nay dung de hien thi phan tu  duoc chon trong Gridview
        gridView = (GridView)findViewById(R.id.gridview);
        //gan Datasource vao ArrayAdapter
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr);
        //gan Datasource vao Gridview
        gridView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_alphabet, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_test:
                Intent intent = new Intent(AlphabetActivity.this, TestAlActivity.class);
                //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;
            case R.id.action_showAlphabet:
                Toast.makeText(this, "showHiragana", Toast.LENGTH_SHORT).show();
                break;
            case android.R.id.home:
                Intent homeIntent = new Intent(this, MainActivity.class);
                homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}
