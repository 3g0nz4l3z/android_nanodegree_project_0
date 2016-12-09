package appportfolio.exequiel.org.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button_pm;
    private Button button_sh;
    private Button button_bb;
    private Button button_myam;
    private Button button_gu;
    private Button button_cs;

    private class OnClickDoToast implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Button bThis = (Button) v;
            String text ="This button will launch my "+ bThis.getText().toString()+" project";
            Toast.makeText(MainActivity.this, text, Toast.LENGTH_LONG).show();
        }
    };

    private void init(){
        button_pm = (Button) findViewById(R.id.button_pm);
        button_sh = (Button) findViewById(R.id.button_sh);
        button_bb = (Button) findViewById(R.id.button_bb);
        button_myam = (Button) findViewById(R.id.button_myam);
        button_gu = (Button) findViewById(R.id.button_gu);
        button_cs = (Button) findViewById(R.id.button_cs);

        button_pm.setOnClickListener(new OnClickDoToast());
        button_sh.setOnClickListener(new OnClickDoToast());
        button_bb.setOnClickListener(new OnClickDoToast());
        button_myam.setOnClickListener(new OnClickDoToast());
        button_gu.setOnClickListener(new OnClickDoToast());
        button_cs.setOnClickListener(new OnClickDoToast());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}
