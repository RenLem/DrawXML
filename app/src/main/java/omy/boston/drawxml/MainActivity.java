package omy.boston.drawxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**FRAGMENTS*/
        // Za dodavanje iz .class
        // View rootView = new SimpleShape(getActivity());

        // Za dodavanje .xml
        // View rootView = inflater.inflate(R.layout.fragment_layout, conteiner, false);
    }
}
