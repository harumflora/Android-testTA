package dekz.id.tensorflowandroid;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Aplikasi extends AppCompatActivity {

    ImageButton scan,petunjuk,info,keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplikasi);
        scan = (ImageButton) findViewById(R.id.btnscan);
        petunjuk = (ImageButton) findViewById(R.id.btnpetunjuk);
        info = (ImageButton) findViewById(R.id.btninfo);
        keluar = (ImageButton) findViewById(R.id.btnkeluar);

        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aplikasi.this, MainActivity.class);
                startActivity(intent);
            }
        });
        petunjuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aplikasi.this, Petunjuk.class);
                startActivity(intent);
            }
        });
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aplikasi.this, Informasi.class);
                startActivity(intent);
            }
        });
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(Aplikasi.this);
                View mView = getLayoutInflater().inflate(R.layout.keluar_dialog,null);
                Button btn_cancel = (Button) mView.findViewById(R.id.cancelbtn);
                Button btn_ok = (Button) mView.findViewById(R.id.okbtn);
                builder.setView(mView);
                final AlertDialog alertDialog = builder.create();
                alertDialog.setCanceledOnTouchOutside(false);
                btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                btn_ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Aplikasi.super.onBackPressed();
                        finish();
                        moveTaskToBack(true);
                    }
                });
                alertDialog.show();
            }
        });
    }
    public void onBackPressed(){
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View mView = getLayoutInflater().inflate(R.layout.keluar_dialog,null);
        Button btn_cancel = (Button) mView.findViewById(R.id.cancelbtn);
        Button btn_ok = (Button) mView.findViewById(R.id.okbtn);
        builder.setView(mView);
        final AlertDialog alertDialog = builder.create();
        alertDialog.setCanceledOnTouchOutside(false);
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Aplikasi.super.onBackPressed();
                finish();
                moveTaskToBack(true);
            }
        });
        alertDialog.show();

    }
}