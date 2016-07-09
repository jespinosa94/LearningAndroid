package espinosa.jorge.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox pepBox, cheeseBox;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pepBox = (CheckBox) findViewById(R.id.checkBox);
        cheeseBox = (CheckBox) findViewById(R.id.checkBox2);
        textView = (TextView) findViewById(R.id.textView);
    }

    public void onButtonClick(View view) {
        StringBuilder str = new StringBuilder("");
        if (pepBox.isChecked()) {
            str.append("Pepperoni ");
        }
        if (cheeseBox.isChecked()) {
            str.append("Extra Cheese ");
        }
        if(str.length() == 0) {
            str.append("Plain");
        }
        textView.setText(str);
    }
}
