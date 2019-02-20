package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView BigN,N,ganaste;
    Button b1,b2,b3,b4,b5;
    int suma = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BigN = findViewById(R.id.BigNum);
        N = findViewById(R.id.Num);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        ganaste = findViewById(R.id.choose);
    }
    public void random(View v){
        Random rand = new Random();
        int n = rand.nextInt(10);
        suma = suma + n;
        BigN.setText(Integer.toString(suma));
        N.setText(Integer.toString(n));
        b1.setEnabled(false);
        if (suma == 21){
            ganaste.setText("Ganaste");
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
        }
        else if (suma > 21){
            ganaste.setText("Perdiste");
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
        }
    }
    public void random2(View v){
        Random rand = new Random();
        int n = rand.nextInt(10);
        suma = suma + n;
        BigN.setText(Integer.toString(suma));
        N.setText(Integer.toString(n));
        b2.setEnabled(false);

        if (suma == 21){
            ganaste.setText("Ganaste");
            b1.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
        }
        else if (suma > 21){
            ganaste.setText("Perdiste");
            b1.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
        }
    }
    public void random3(View v){
        Random rand = new Random();
        int n = rand.nextInt(10);
        suma = suma + n;
        BigN.setText(Integer.toString(suma));
        N.setText(Integer.toString(n));
        b3.setEnabled(false);

        if (suma == 21){
            ganaste.setText("Ganaste");
            b1.setEnabled(false);
            b2.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
        }
        else if (suma > 21){
            ganaste.setText("Perdiste");
            b1.setEnabled(false);
            b2.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
        }
    }
    public void random4(View v){
        Random rand = new Random();
        int n = rand.nextInt(10);
        suma = suma + n;
        BigN.setText(Integer.toString(suma));
        N.setText(Integer.toString(n));
        b4.setEnabled(false);

        if (suma == 21){
            ganaste.setText("Ganaste");
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b5.setEnabled(false);
        }
        else if (suma > 21){
            ganaste.setText("Perdiste");
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b5.setEnabled(false);
        }
    }
    public void random5(View v){
        Random rand = new Random();
        int n = rand.nextInt(10);
        suma = suma + n;
        BigN.setText(Integer.toString(suma));
        N.setText(Integer.toString(n));
        b5.setEnabled(false);

        if (suma == 21){
            ganaste.setText("Ganaste");
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
        }
        else if (suma > 21){
            ganaste.setText("Perdiste");
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
        }
    }
    public void reset(View V){
        suma = 0;
        BigN.setText(Integer.toString(suma));
        N.setText("0");
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        ganaste.setText("Elije un Boton");
    }
}
