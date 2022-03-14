package com.example.lab5;
import android.content.Context;
import android.graphics.Color;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.List;

public class DonutAdapter extends  BaseAdapter {
    private Context context;
    private int layout;
    private List<Donut> donuts;
    private int positionSelected= -1;

    public DonutAdapter(Context context, int layout, List<Donut> donuts) {
        this.context = context;
        this.layout = layout;
        this.donuts = donuts;
    }

    @Override
    public int getCount() {
        return  donuts.size();

    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        TextView txtName = (TextView) view.findViewById(R.id.txtName);
        TextView txtDescrip = (TextView) view.findViewById(R.id.txtDescrip);
        TextView txtprice = (TextView) view.findViewById(R.id.txtprice);
        ImageView imgPicture = (ImageView) view.findViewById(R.id.imgPicture);


        Donut donut = donuts.get(i);
        txtName.setText(donut.getName());
        txtDescrip.setText(donut.getDescrip());
        txtprice.setText(donut.getPrice());
        imgPicture.setImageResource(donut.getPicture());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "" + donut.getName(), Toast.LENGTH_SHORT).show();
                positionSelected = i;
                notifyDataSetChanged();
            }
        });

        final ConstraintLayout layout01 = (ConstraintLayout) view.findViewById(R.id.a_donut);
        if(positionSelected == i){
            layout01.setBackgroundColor(Color.parseColor("#F4DDDD"));
        }
        else
            layout01.setBackgroundColor(Color.WHITE);

        return view;





    }
}



