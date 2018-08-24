package co.unir.oscardo.ccwunir;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.barteksc.pdfviewer.PDFView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Temario4Fragment extends Fragment {


    public Temario4Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_temario4, container, false);
		PDFView pdfview = (PDFView)view.findViewById(R.id.pdfView);
        pdfview.fromAsset("unir/temario/tema4.pdf").load();
        return view;
    }

}
