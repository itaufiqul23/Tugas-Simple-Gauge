package com.example.tugassimplegauge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.github.anastr.speedviewlib.SpeedView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    SpeedView spdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editText);
        btn=findViewById(R.id.button);
        spdview=findViewById(R.id.speedView);

        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nilai = 80;
                editText.getText().toString();
                spdview.speedTo(nilai);
            }
        });
    }
}
