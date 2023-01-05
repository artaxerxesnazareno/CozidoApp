package com.example.cozidoapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.myViewHolder> {
    Intent tela;
    Context mContext;
    List<FoodItem> mData;

    public FoodAdapter(Context mContext, List<FoodItem> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.card_item, parent, false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.cityCover.setImageResource(mData.get(position).getFoodCover());
        holder.cityName.setText(mData.get(position).getFoodName());

        holder.cityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity activity = getActivity(v);
                Intent intent = new Intent(activity.getBaseContext(), Receita.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);

                intent.putExtra("name" ,  mData.get(position).getFoodName());
                intent.putExtra("img" ,  mData.get(position).getFoodCover());
                intent.putExtra("AdapterCaloria" , mData.get(position).calorias);
                intent.putExtra("AdapterPorcao" , mData.get(position).porcao);
                intent.putExtra("AdapterCozer" , mData.get(position).getTempoCozer());
                intent.putExtra("AdapterIngredientes" , mData.get(position).getIngredies());
                intent.putExtra("AdapterPreparo" , mData.get(position).getPreparo());


                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        ImageView cityCover;
        TextView cityName;
        Button cityButton;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            cityCover = itemView.findViewById(R.id.cityCover);
            cityName = itemView.findViewById(R.id.cityName);
            cityButton = itemView.findViewById(R.id.btnCard);

        /*
         mData.get(getAdapterPosition()).getCityButton().setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(mContext, mData.get(getAdapterPosition()).getFoodName(), Toast.LENGTH_SHORT).show();
                        }
                    });

*/
           /* cityButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), mData.get(getAdapterPosition()).getFoodName(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(mContext, Receita.class);


                    mContext.startActivity(intent);
//                    mContext.startActivity(new Intent(mContext, Receita.class));

                }
            });*/
        }
    }

    private Activity getActivity(View view) {
        Context context = view.getContext();
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public List<FoodItem> getmData() {
        return mData;
    }

    public void setmData(List<FoodItem> mData) {
        this.mData = mData;
    }


}
