package com.bagicode.www.videotestapi.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.bagicode.www.videotestapi.Model.ModelData;
import com.bagicode.www.videotestapi.R;

import java.util.ArrayList;

/**
 * Created by JhonDev on 07/10/2016.
 */

public class ListArrayAdapter extends ArrayAdapter<ModelData> {

    private ArrayList<ModelData> list;
    private LayoutInflater inflater;
    private int res;

    public ListArrayAdapter(Context context, int resource, ArrayList<ModelData> list) {
        super(context, resource, list);
        this.list = list;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.res = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        MyHolder holder = null;


        if (convertView == null) {

            convertView = inflater.inflate(res, parent, false);

            holder = new MyHolder();

            holder.ID = (TextView) convertView.findViewById(R.id.listID);
            holder.Nama = (TextView) convertView.findViewById(R.id.listNamaMhs);
            holder.Jenis = (TextView) convertView.findViewById(R.id.listJenisMhs);

            convertView.setTag(holder);

        } else {

            holder = (MyHolder) convertView.getTag();
        }

        holder.ID.setText("Id Mahasiswa : "+list.get(position).getidMahasiswa());
        holder.Nama.setText("Nama Mahasiswa : "+list.get(position).getNama());
        holder.Jenis.setText("Kelas Mahasiswa : "+list.get(position).getKelas_mhs());

        return convertView;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public void remove(ModelData object) {
        super.remove(object);
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    static class MyHolder {

        TextView ID;
        TextView Nama;
        TextView Jenis;


    }
}
