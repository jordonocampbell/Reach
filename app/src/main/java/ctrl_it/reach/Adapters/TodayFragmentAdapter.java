package ctrl_it.reach.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ctrl_it.reach.Models.Ride;
import ctrl_it.reach.R;

public class TodayFragmentAdapter extends RecyclerView.Adapter<TodayFragmentAdapter.ViewHolder> {
    private List<Ride> rideList;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView label, description, date;
        public ViewHolder(View v) {
            super(v);
            label = (TextView) itemView.findViewById(R.id.label);
            description = (TextView) itemView.findViewById(R.id.description);
            date = (TextView) itemView.findViewById(R.id.date);
        }
    }

    public TodayFragmentAdapter(List<Ride> rideList) {
       this.rideList = rideList;
    }


    @NonNull
    @Override
    public TodayFragmentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.ride_list_record, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull TodayFragmentAdapter.ViewHolder holder, int position) {
        Ride ride = rideList.get(position);
        holder.label.setText(ride.getLabel());
        holder.date.setText(ride.getDate());
        holder.description.setText(ride.getDescription());
    }

    @Override
    public int getItemCount() {
        return rideList.size();
    }
}
