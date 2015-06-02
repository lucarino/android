package com.carino.luis.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by Luis Carino on 01/06/2015
 */

public class MainActivity extends Activity implements View.OnClickListener{


    private Button[] buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.container);
        int numberOfButtons = relativeLayout.getChildCount();

        buttons = new Button[numberOfButtons];

        for(int i = 1; i < numberOfButtons; i++){
            if(relativeLayout.getChildAt(i) instanceof  Button){
                buttons[i] = (Button)relativeLayout.getChildAt(i);
                buttons[i].setOnClickListener(this);
            }
        }



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View view) {

        String text = ((Button) view).getText().toString();
        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT).show();

    }
}
