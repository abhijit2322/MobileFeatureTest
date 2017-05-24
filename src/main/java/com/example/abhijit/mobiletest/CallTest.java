package com.example.abhijit.mobiletest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class CallTest extends AppCompatActivity {

    RelativeLayout  mainLayer;
    RelativeLayout.LayoutParams params;
    View layer1, layer2;
    CheckBox enableLayer1, enableLayer2;
    Button voiceButton;
    Button videoButton;
    ListView calllistView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.call_name);
        setContentView(R.layout.activity_call_test);
        String[] values = new String[] { "Make Full Call List",
                "Missed Call Notification ",
                "Call Statistic",
        };
        enableLayer1 = (CheckBox)findViewById(R.id.enlayer1);
        enableLayer2 = (CheckBox)findViewById(R.id.enlayer2);


        //mainLayer = (LinearLayout)findViewById(R.id.master);
        mainLayer = (RelativeLayout)findViewById(R.id.mainrel);
        params= new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
        params.leftMargin = 0;
        params.topMargin = 150;

        LayoutInflater inflater = getLayoutInflater();
        layer1 = inflater.inflate(R.layout.voicecall, null);
        layer2 = inflater.inflate(R.layout.videocall, null);
        enableLayer1.setOnCheckedChangeListener(enableLayer1ChangeListener);
        enableLayer2.setOnCheckedChangeListener(enableLayer2ChangeListener);
        calllistView = (ListView) findViewById(R.id.calllist);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);
        calllistView.setAdapter(adapter);

        calllistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                int itemPosition     = position;
                String  itemValue    = (String) calllistView.getItemAtPosition(position);
                switch(itemValue)
                {
                    case "Make Full Call List":
                         Toast.makeText(getApplicationContext(),
                                "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                                .show();
                        break;
                    case "Missed Call Notification ":
                         Toast.makeText(getApplicationContext(),
                                "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                                .show();
                        break;
                    case "Call Statistic":
                         Toast.makeText(getApplicationContext(),
                                "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                                .show();
                        break;

                }

            }

        });

    }
    public void addListenerOnVideoButton() {

        videoButton = (Button) findViewById(R.id.videocallbutton);

        videoButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "video Button Clicked", Toast.LENGTH_LONG)
                        .show();

            }

        });

    };
    public void addListenerOnVoiceButton() {

        voiceButton = (Button) findViewById(R.id.voicecallbutton);

        voiceButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "voice Button Clicked", Toast.LENGTH_LONG)
                        .show();

            }

        });

    };


    CheckBox.OnCheckedChangeListener enableLayer1ChangeListener
            = new CheckBox.OnCheckedChangeListener(){

        @Override
        public void onCheckedChanged(CompoundButton buttonView,
                                     boolean isChecked) {
            if(isChecked){
                mainLayer.addView(layer1,params);
                addListenerOnVoiceButton();
                layer1.setVisibility(View.VISIBLE);
                layer2.setVisibility(View.INVISIBLE);
                enableLayer2.setChecked(false);

            }else{

                mainLayer.removeViewInLayout(layer1);

            }
        }
    };

    CheckBox.OnCheckedChangeListener enableLayer2ChangeListener
            = new CheckBox.OnCheckedChangeListener(){

        @Override
        public void onCheckedChanged(CompoundButton buttonView,
                                     boolean isChecked) {
            if(isChecked){
                mainLayer.addView(layer2,params);
                addListenerOnVideoButton();
                layer2.setVisibility(View.VISIBLE);
                layer1.setVisibility(View.INVISIBLE);
                enableLayer1.setChecked(false);
               }else{
                     mainLayer.removeViewInLayout(layer2);
                }
        }
    };





public void MakeVoiceCall()
    {

    }
    public void MakeVideoCall()
    {

    }
    public void NotificationBarUpdateforMissedcall()
    {

    }
    public void MakeCallListFull()
    {

    }
    public void CallStatistics()
    {

    }

}
