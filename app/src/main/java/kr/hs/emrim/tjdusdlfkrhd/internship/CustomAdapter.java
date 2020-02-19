package kr.hs.emrim.tjdusdlfkrhd.internship;

import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    private ArrayList<Article> mList;

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        protected TextView id;
        protected TextView contents;
        protected TextView heart;
        protected TextView file_location;


        public CustomViewHolder(View view){
            super(view);
            this.id = view.findViewById(R.id.id);
            this.contents = (TextView) view.findViewById(R.id.contents);
            this.heart = (TextView) view.findViewById(R.id.heart);
            this.file_location = (TextView) view.findViewById(R.id.file_location);

        }
    }

    public CustomAdapter(ArrayList<Article> list){
        this.mList = list;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, viewGroup, false);
        CustomViewHolder viewHolder = new CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder viewHolder, int position){
        viewHolder.id.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        viewHolder.id.setGravity(Gravity.CENTER);
        viewHolder.id.setText(Integer.toString(mList.get(position).getId()));

        viewHolder.contents.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
        viewHolder.contents.setGravity(Gravity.CENTER);
        viewHolder.contents.setText(mList.get(position).getContents());

        viewHolder.heart.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
        viewHolder.heart.setGravity(Gravity.CENTER);
        viewHolder.heart.setText(Integer.toString(mList.get(position).getHeart()));

        /*
        viewHolder.file_location.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        viewHolder.file_location.setGravity(Gravity.CENTER);
        viewHolder.file_location.setText(mList.get(position).getHeart()); // 쓸데없는 거임.
        */
    }

    @Override
    public int getItemCount(){
        return (null != mList ? mList.size() : 0);
    }
}