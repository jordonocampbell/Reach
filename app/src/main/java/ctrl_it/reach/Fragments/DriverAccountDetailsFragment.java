package ctrl_it.reach.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ctrl_it.reach.R;

public class DriverAccountDetailsFragment extends Fragment {

    public DriverAccountDetailsFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_driver_account_details, container, false);
    }

}
