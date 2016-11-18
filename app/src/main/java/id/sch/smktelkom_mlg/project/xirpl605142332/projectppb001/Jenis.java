package id.sch.smktelkom_mlg.project.xirpl605142332.projectppb001;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * Created by -asus- on 11/17/2016.
 */
public class Jenis extends Fragment {

    RelativeLayout view;

    public Jenis() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.jenis, container, false);

        getActivity().setTitle("Jenis Wayang");

        return view;
    }
}