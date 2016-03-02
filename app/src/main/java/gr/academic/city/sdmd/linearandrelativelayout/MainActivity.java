package gr.academic.city.sdmd.linearandrelativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ////// UNCOMMENT THE VARIOUS LAYOUTS TO OBSERVE THEIR END RESULTS //////

        // A cool layout done just with a LinearLayout
        setContentView(R.layout.activity_simple_linear_layout);

        // A complex layout done with nested LinearLayouts
//        setContentView(R.layout.activity_complex_linear_layout);

        // The same complex layout but with a flattened hierarchy and just a single RelativeLayout
//        setContentView(R.layout.activity_complex_relative_layout);
    }
}
