package com.onecode.sistempakar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbdemam, cbnyeriteggorokan, cbtenggorokantampakmerah, cbpembengkakankelenjargetahbening, cbsakitkepala,
        cbhidungmeler, cbbatuk, cbnyeriotot, cbnyerisendi, cbkemerahankulit, cbmunculbintik,
        cbtubuhmenggigil;

    Button scan;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbdemam                             =  findViewById(R.id.cbdemam);
        cbnyeriteggorokan                   =  findViewById(R.id.cbnyeriteggorokan);
        cbtenggorokantampakmerah            =  findViewById(R.id.cbtenggorokantampakmerah);
        cbpembengkakankelenjargetahbening   =  findViewById(R.id.cbpembengkakankelenjargetahbening);
        cbsakitkepala                       =  findViewById(R.id.cbsakitkepala);
        cbhidungmeler                       =  findViewById(R.id.cbhidungmeler);
        cbbatuk                             =  findViewById(R.id.cbbatuk);
        cbnyeriotot                         =  findViewById(R.id.cbnyeriotot);
        cbnyerisendi                        =  findViewById(R.id.cbnyerisendi);
        cbkemerahankulit                    =  findViewById(R.id.cbkemerahankulit);
        cbmunculbintik                      =  findViewById(R.id.cbmunculbintik);
        cbtubuhmenggigil                    =  findViewById(R.id.cbtubuhmenggigil);

        scan = findViewById(R.id.scan);
        hasil = findViewById(R.id.hasil);

        hasil.setText("");

        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namapenyakit = "Penyakit Anda :";

                if (cbdemam.isChecked() && cbnyeriteggorokan.isChecked() && cbhidungmeler.isChecked()
                && cbbatuk.isChecked() && cbnyeriotot.isChecked()){
                    namapenyakit += "\nCampak";

                    Toast.makeText(getApplicationContext(), "Diagnosa" + namapenyakit, Toast.LENGTH_SHORT).show();
                }

                if (cbdemam.isChecked() && cbtenggorokantampakmerah.isChecked() && cbpembengkakankelenjargetahbening.isChecked()
                        && cbnyerisendi.isChecked() && cbkemerahankulit.isChecked()){
                    namapenyakit += "\nCampak Jerman";

                    Toast.makeText(getApplicationContext(), "Diagnosa" + namapenyakit, Toast.LENGTH_SHORT).show();
                }

                if (cbdemam.isChecked() && cbsakitkepala.isChecked() && cbmunculbintik.isChecked()
                        && cbtubuhmenggigil.isChecked()){
                    namapenyakit += "\nCacar Air";

                    Toast.makeText(getApplicationContext(), "Diagnosa" + namapenyakit, Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Diagnosa Tidak Ditemukan", Toast.LENGTH_SHORT).show();
                }

                hasil.setText(namapenyakit);
            }
        });

    }

    public void onCheckboxClicked(View view){

    }

}
