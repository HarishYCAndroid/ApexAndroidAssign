package gdm.moviesdbapi.View;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import gdm.moviesdbapi.Model.ResultSearchActivity;
import gdm.moviesdbapi.R;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.daginge.tmdbsearch.MESSAGE";
    public static final String EXTRA_QUERY = "com.daginge.tmdbsearch.QUERY";
    EditText editText;
    Button submitbutton,searchbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText= (EditText) findViewById(R.id.edit_message);
        submitbutton=(Button)findViewById(R.id.btnsubmit);
        searchbutton=(Button)findViewById(R.id.btnsearch);
        getSupportActionBar().setBackgroundDrawable(
                new ColorDrawable(Color.parseColor("#ffffff")));

        getSupportActionBar().setTitle(Html.fromHtml("<font color='#000000'> MoviesDBAPI </font>"));

    }


    public void queryTMDB(View view) {
        Intent intent = new Intent(this, ResultSearchActivity.class);

        String query = editText.getText().toString();
        intent.putExtra(EXTRA_QUERY, query);
        startActivity(intent);
    }
    public void searchnow(View view) {
        editText.setVisibility(View.VISIBLE);
        submitbutton.setVisibility(View.VISIBLE);
        searchbutton.setVisibility(View.GONE);

    }

}
