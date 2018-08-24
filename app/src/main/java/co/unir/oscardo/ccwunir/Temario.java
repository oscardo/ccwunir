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
public class Temario extends Fragment {


    public Temario() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_temario, container, false);
        // Inflate the layout for this fragment
        PDFView pdfview = (PDFView)view.findViewById(R.id.pdfView);
        pdfview.fromAsset("unir/temario/tema1.pdf").load();
        return view;
    }

}
