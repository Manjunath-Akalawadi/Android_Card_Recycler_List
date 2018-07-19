package com.manju7.android_card_recycler_list;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    private Context mContext;
    private List<Movies> mData;

    public RecyclerViewAdapter(Context mContext, List<Movies> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mlayoutInflater=LayoutInflater.from(mContext);
        view=mlayoutInflater.inflate(R.layout.card_items,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.movie_title1.setText(mData.get(position).getTitle());
        holder.movie_image1.setImageResource(mData.get(position).getThumbnail());
        holder.movie_category1.setText(mData.get(position).getCategory());

        holder.cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(mContext,MoviesActivity.class);

                intent.putExtra("Title",mData.get(position).getTitle());
                intent.putExtra("Description",mData.get(position).getDescription());
                intent.putExtra("Thumbnail",mData.get(position).getThumbnail());
                intent.putExtra("Category",mData.get(position).getCategory());

                mContext.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView movie_title1,movie_category1;
        ImageView movie_image1;
        CardView cardView1;

        public MyViewHolder(View itemView){
            super(itemView);

            movie_title1=(TextView)itemView.findViewById(R.id.movie_title);
            movie_image1=(ImageView)itemView.findViewById(R.id.movie_icon);
            movie_category1=(TextView)itemView.findViewById(R.id.movie_category) ;
            cardView1=(CardView)itemView.findViewById(R.id.cardview_id);



        }
    }
}
