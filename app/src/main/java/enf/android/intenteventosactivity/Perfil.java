package enf.android.intenteventosactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by enfonseca on 3/30/16.
 */
public class Perfil extends AppCompatActivity {

    TextView nome;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil);

        nome = (TextView) findViewById(R.id.nome);
        iv = (ImageView) findViewById(R.id.imageView);

        Intent intent= getIntent();
        Bundle b=intent.getExtras();


        String USER = (String) b.get("USER");
        nome.setText(USER);



    }

}
