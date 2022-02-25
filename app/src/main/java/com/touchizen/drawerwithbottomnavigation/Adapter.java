package com.touchizen.drawerwithbottomnavigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    private List<modelclass> userList;

    public Adapter (List<modelclass>userList){ this.userList=userList; }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.member_item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        String block=userList.get(position).getText1();
        String no=userList.get(position).getText2();
        String name=userList.get(position).getText3();
        String no2=userList.get(position).getText4();
        String name2=userList.get(position).getText5();
        String no3=userList.get(position).getText6();
        String name3=userList.get(position).getText7();
        String no4=userList.get(position).getText8();
        String name4=userList.get(position).getText9();

        holder.setData(block,no,name,no2,name2,no3,name3,no4,name4);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView text1;
        private TextView text2;
        private TextView text3;
        private TextView text4;
        private TextView text5;
        private TextView text6;
        private TextView text7;
        private TextView text8;
        private TextView text9;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            text1=itemView.findViewById(R.id.t1);
            text2=itemView.findViewById(R.id.t2);
            text3=itemView.findViewById(R.id.t3);
            text4=itemView.findViewById(R.id.t4);
            text5=itemView.findViewById(R.id.t5);
            text6=itemView.findViewById(R.id.t6);
            text7=itemView.findViewById(R.id.t7);
            text8=itemView.findViewById(R.id.t8);
            text9=itemView.findViewById(R.id.t9);

        }

        public void setData(String block, String no, String name, String no2, String name2, String no3, String name3, String no4, String name4) {
            text1.setText(block);
            text2.setText(no);
            text3.setText(name);
            text4.setText(no2);
            text5.setText(name2);
            text6.setText(no3);
            text7.setText(name3);
            text8.setText(no4);
            text9.setText(name4);
        }
    }
}
