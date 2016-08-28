package com.afpa.SondageApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Songage extends Activity {
    /**
     * Called when the activity is first created.
     */

    private ImageView image;
    private RadioButton radioGenre;
    private CheckBox check1, check2, check3, check4;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        check1 = (CheckBox) findViewById(R.id.check1);
        check2 = (CheckBox) findViewById(R.id.check2);
        check3 = (CheckBox) findViewById(R.id.check3);
        check4 = (CheckBox) findViewById(R.id.check4);
        RadioGenre = (RadioButton) findViewById(R.id.RadioGenre);
        image = (ImageView) findViewById(R.id.imageview);

    }

    public void clickBouton(View view) {
      /*  int id;
        if(radioGenre.isChecked()){
            id = R.drawable.icon_male;
        }else{
            id = R.drawable.icon_female;
        }
        */

        /*l'expression ternaire ci-dessous est
        strictement equivalente à celle commentee ci-dessus*/
        int imageId =
                (RadioGenre.isChecked())? R.drawable.icon_male : R.drawable.icon_female;
        image.setImageResource(imageId);

        String lineSeparator = System.getProperty("line.separator");
        String chaine = getResources().getString(R.string.dialogLanguages)
                +lineSeparator;

        List<String> listeChoix = new ArrayList<String>();

        if(check1.isChecked()){
            listeChoix.add(getString(R.string.language1));
        }
        if(check2.isChecked()){
            listeChoix.add(getString(R.string.language2));
        }
        if(check3.isChecked()){
            listeChoix.add(getString(R.string.language3));
        }
        if(check4.isChecked()){
            listeChoix.add(getString(R.string.language4));
        }

        for(String choix: listeChoix){
            chaine += (choix + lineSeparator);
        }

        Toast.makeText(this, chaine, Toast.LENGTH_LONG).show();

    }
}
