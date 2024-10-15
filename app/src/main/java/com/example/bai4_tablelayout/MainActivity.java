package com.example.bai4_tablelayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //khai bao cac bien giao dien
    EditText edtduonglich;
    Button btnchuyen;
    TextView txt_amlich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), this::onApplyWindowInsets);

        btnchuyen = findViewById(R.id.btnchuyen);
        txt_amlich = findViewById(R.id.txt_amlich);
        edtduonglich = findViewById(R.id.edtduonglich);
        btnchuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String can = "", chi = "";
                int namduong = Integer.parseInt(edtduonglich.getText().toString());
                switch (namduong%10)
                {
                    case 0: can = "Canh"; break;
                    case 1: can = "Tan"; break;
                    case 2: can = "Nham"; break;
                    case 3: can = "Quy"; break;
                    case 4: can = "Giap"; break;
                    case 5: can = "At"; break;
                    case 6: can = "Binh"; break;
                    case 7: can = "Dinh"; break;
                    case 8: can = "Mau"; break;
                    case 9: can = "Ky"; break;
                }
                switch (namduong%12){
                    case 0: chi = "Than"; break;
                    case 1: chi = "Dau"; break;
                    case 2: chi = "Tuat"; break;
                    case 3: chi = "Hoi"; break;
                    case 4: chi = "Ti"; break;
                    case 5: chi = "Suu"; break;
                    case 6: chi = "Dan"; break;
                    case 7: chi = "Mao"; break;
                    case 8: chi = "Thin"; break;
                    case 9: chi = "Ti"; break;
                    case 10: chi = "Ngo"; break;
                    case 11: chi = "Mui"; break;
                }
                txt_amlich.setText(can + " " + chi);
            }
        });
    }

    private WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
        Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
        return insets;

    }

}