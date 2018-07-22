package com.khahani.app.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by dev on 7/22/2018.
 */

public class EathquakeAdapter extends ArrayAdapter<Earthquake> {
    public EathquakeAdapter(@NonNull Context context, @NonNull List<Earthquake> data) {
        super(context, 0, data);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Earthquake current = getItem(position);

        TextView cityTextView = view.findViewById(R.id.city);
        TextView magnitudeTextView = view.findViewById(R.id.mag);

        cityTextView.setText(current.getCity());
        magnitudeTextView.setText(String.valueOf(current.getMagnit()));

        return view;
    }
}
