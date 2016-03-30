package enf.android.intenteventosactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    String USER="";
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent= getIntent();
        Bundle b=intent.getExtras();

        if(b!=null){
            USER = (String) b.get("USER");
        }


        tv= (TextView) findViewById(R.id.textoPrincipal);


        tv.append(" "+USER);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void login(View v){


        //Toast.makeText(getApplicationContext(),"Login cliked",Toast.LENGTH_LONG).show();
        Intent intent =new Intent(this, Login.class);
        startActivity(intent);



    }

    public void perfil(View v){
        Intent intent =new Intent(this, Perfil.class);
        intent.putExtra("USER", USER);
        startActivity(intent);
    }

    public void info(View v){
        Toast.makeText(getApplicationContext(),"Info cliked",Toast.LENGTH_LONG).show();
    }

    public void sair(View v){
        Toast.makeText(getApplicationContext(),"Sair cliked",Toast.LENGTH_LONG).show();
    }

}
