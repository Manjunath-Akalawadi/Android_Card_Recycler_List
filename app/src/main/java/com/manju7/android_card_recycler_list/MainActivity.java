package com.manju7.android_card_recycler_list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Movies> moviesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moviesList=new ArrayList<>();
        moviesList.add(new Movies("Intersteller","Drama/Mystery","In the future, Earth is slowly becoming uninhabitable. Ex-NASA pilot Cooper, along with a team of researchers, is sent on a planet exploration mission to report which planet can sustain life.",R.drawable.interstellar));
        moviesList.add(new Movies("Avatar","Fantasy/Science fiction","On the lush alien world of Pandora live the Na'vi, beings who appear primitive but are highly evolved. Because the planet's environment is poisonous, human/Na'vi hybrids, called Avatars, must link to human minds to allow for free movement on Pandora. Jake Sully (Sam Worthington), a paralyzed former Marine, becomes mobile again through one such Avatar and falls in love with a Na'vi woman (Zoe Saldana). As a bond with her grows, he is drawn into a battle for the survival of her world.",R.drawable.avatar));
        moviesList.add(new Movies("Deadpool","Fantasy/Science fiction","Mercenary Wade Wilson, subjected to an experiment to heal himself of cancer, obtains healing powers, but at the cost of becoming awfully disfigured. He then adopts the alter ego of Deadpool.",R.drawable.deadpool));
        moviesList.add(new Movies("Dark Knight"," Drama/Crime","After Gordon, Dent and Batman begin an assault on Gotham's organised crime, the mobs hire the Joker, a psychopathic criminal mastermind, who wants to bring all the heroes down to his level.\n",R.drawable.darkknight));
        moviesList.add(new Movies("Inception","Science fiction film/Thriller","Cobb steals information from his targets by entering their dreams. He is wanted for his alleged role in his wife's murder and his only chance at redemption is to perform the impossible, an inception.",R.drawable.inception));
        moviesList.add(new Movies("Martian","Drama/Science fiction","Mark Watney is stranded on the planet of Mars after his crew leaves him behind, presuming him to be dead due to a storm. With minimum supply, Mark struggles to keep himself alive.\n",R.drawable.martian));
        moviesList.add(new Movies("Gravity","Drama/Science fiction","Dr Ryan Stone, an engineer on her first time on a space mission, and Matt Kowalski, an astronaut on his final expedition, have to survive in space after they are hit by debris while spacewalking.",R.drawable.gravity));
        moviesList.add(new Movies("Passengers","Drama/Science fiction","Jim is accidentally awoken while travelling to a distant colony planet and awakens Aurora to keep him company. They fall in love but soon discover malfunctions in their spaceship and try to save it.\n",R.drawable.passengers));
        moviesList.add(new Movies("Mr and Ms Smith","Crime film/Thriller","A husband and wife struggle to keep their marriage alive until they realise they are both secretly working as assassins. Now, their respective assignments require them to kill each other.\n",R.drawable.smith));


        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recycler_view_id1);
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(this,moviesList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
