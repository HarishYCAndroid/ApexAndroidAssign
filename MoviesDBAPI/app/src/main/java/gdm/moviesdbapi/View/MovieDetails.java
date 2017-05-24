package gdm.moviesdbapi.View;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

import gdm.moviesdbapi.R;

public class MovieDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        getSupportActionBar().setBackgroundDrawable(
                new ColorDrawable(Color.parseColor("#ffffff")));

        getSupportActionBar().setTitle(Html.fromHtml("<font color='#000000'> MoviesDBAPI </font>"));

        TextView t1=(TextView)findViewById(R.id.title);
        TextView t2=(TextView)findViewById(R.id.originalTitle);
        TextView t3=(TextView)findViewById(R.id.releaseDate);
        TextView t4=(TextView)findViewById(R.id.popularity);
        Intent iin= getIntent();Bundle b = iin.getExtras();
        t1.setText(b.getString("t1"));
        t2.setText(b.getString("t2"));
        t3.setText(b.getString("t3"));
        t4.setText(b.getString("t4"));

    }
}
