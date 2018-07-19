package com.manju7.android_card_recycler_list;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MoviesActivity extends AppCompatActivity {

    TextView mtitle,mdescription,mcategory;
    ImageView micon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        mtitle=(TextView)findViewById(R.id.title_id);
        mcategory=(TextView)findViewById(R.id.cat_id);
        mdescription=(TextView)findViewById(R.id.desc_id);
        micon=(ImageView)findViewById(R.id.image_id);


        Intent intent=getIntent();
        String title=intent.getExtras().getString("Title");
        String description=intent.getExtras().getString("Description");
        String category=intent.getExtras().getString("Category");
        int image=intent.getExtras().getInt("Thumbnail");

        mtitle.setText(title);
        mcategory.setText(category);
        mdescription.setText(description);
        micon.setImageResource(image);
    }
}
