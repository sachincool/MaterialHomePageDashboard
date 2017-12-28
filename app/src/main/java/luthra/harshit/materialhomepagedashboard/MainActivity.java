package luthra.harshit.materialhomepagedashboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView bankcard, ideacard, addcard, settingCard, wificard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bankcard = findViewById(R.id.bank_card);
        ideacard = findViewById(R.id.ideas_card);
        addcard = findViewById(R.id.add_card);
        settingCard = findViewById(R.id.links_card);
        wificard = findViewById(R.id.wifi_card);

        bankcard.setOnClickListener(this);
        ideacard.setOnClickListener(this);
        wificard.setOnClickListener(this);
        settingCard.setOnClickListener(this);
        addcard.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent i=null;
        switch (view.getId()) {
            case R.id.bank_card:
                i = new Intent(this,BankActivity.class); break;

            case R.id.add_card:

                i = new Intent(this,AddActivity.class); break;

            case R.id.links_card:

                i = new Intent(this,LinksActivity.class); break;

            case R.id.wifi_card:

                i = new Intent(this,WifiActivity.class); break;

            case R.id.ideas_card:

                i = new Intent(this,IdeasActivity.class); break;
            default: break;


        }
        startActivity(i);
    }
}
