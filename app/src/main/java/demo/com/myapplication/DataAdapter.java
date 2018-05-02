package demo.com.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<Movie> countries;


    public DataAdapter(ArrayList<Movie> countries) {
        this.countries = countries;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        Movie ii=countries.get(i);

        viewHolder.img.setImageResource(ii.getImage());
        viewHolder.tv_country1.setText(""+ii.getTitle());
        viewHolder.tv_country2.setText(""+ii.getYear());
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_country1;
        private TextView tv_country2;
        private ImageView img;
        public ViewHolder(View view) {
            super(view);

            img = (ImageView)view.findViewById(R.id.img);
            tv_country1 = (TextView)view.findViewById(R.id.tv_country1);
            tv_country2 = (TextView)view.findViewById(R.id.tv_country2);
        }
    }

}
