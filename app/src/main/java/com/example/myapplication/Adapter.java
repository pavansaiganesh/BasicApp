package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass> userList;


    public Adapter(List<ModelClass>userList){
        this.userList=userList;
    }



    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        int resource=userList.get(position).getImageview1();
        String name=userList.get(position).getTextview1();
        String msg=userList.get(position).getTextview2();
        int href=userList.get(position).getHref();

        holder.setData(resource,name,msg,href);



    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private ImageView imageView;
        private TextView textView1;
        private TextView textView2;
        private TextView href;
        Context context;
        List<ModelClass> userList;
        private TextView linkTextView  ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageview1);
            textView1=itemView.findViewById(R.id.textview);
            textView2=itemView.findViewById(R.id.textview2);
            href=itemView.findViewById(R.id.href);
            itemView.setOnClickListener(this);
            this.context=context;
            this.userList=userList;
        }

        public void setData(int resource, String name, String msg , int p) {

            imageView.setImageResource(resource);
            textView1.setText(name);
            textView2.setText(msg);
            href.setText(p);
        }


        @Override
        public void onClick(View view) {
           href= itemView.findViewById(R.id.href);
           href.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
