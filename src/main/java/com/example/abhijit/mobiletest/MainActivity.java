package com.example.abhijit.mobiletest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);

        // Defined Array values to show in ListView
        String[] values = new String[] { "BT Test",
                "Call Test",
                "Camera Test",
                "Data Speed Test",
                "File Test",
                "Massage Test",
                "Sensor Test",
                "System Test",
                "UI Test",
                "Wifi Test",
                "Misc Test",
                "Report",
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
               // Toast.makeText(getApplicationContext(),
               //         "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
               //         .show();

                switch(itemValue)
                {
                    case "BT Test":
                       /* Toast.makeText(getApplicationContext(),
                                "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                                .show();*/
                        startActivity(new Intent(getApplicationContext(), BTActivity.class));
                        break;
                    case "Call Test":
                      /*  Toast.makeText(getApplicationContext(),
                                "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                                .show();*/
                        startActivity(new Intent(getApplicationContext(), CallTest.class));
                        break;
                    case "Camera Test":
                       /* Toast.makeText(getApplicationContext(),
                                "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                                .show();*/
                        startActivity(new Intent(getApplicationContext(), CameraTest.class));
                        break;
                    case "Data Speed Test":
                      /*  Toast.makeText(getApplicationContext(),
                                "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                                .show();*/
                        startActivity(new Intent(getApplicationContext(), DataSpeedActivity.class));
                        break;
                    case "File Test":
                      /*  Toast.makeText(getApplicationContext(),
                                "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                                .show();*/
                        startActivity(new Intent(getApplicationContext(), FileTest.class));
                        break;
                    case "Massage Test":
                       /* Toast.makeText(getApplicationContext(),
                                "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                                .show();*/
                        startActivity(new Intent(getApplicationContext(), Messagetest.class));
                        break;
                    case "Sensor Test":
                    /*    Toast.makeText(getApplicationContext(),
                                "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                                .show();*/
                        startActivity(new Intent(getApplicationContext(), SensorActivity.class));
                        break;
                    case "System Test":
                    /*    Toast.makeText(getApplicationContext(),
                                "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                                .show();*/
                        startActivity(new Intent(getApplicationContext(), SYSActivity.class));
                        break;
                    case "UI Test":
              /*          Toast.makeText(getApplicationContext(),
                                "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                                .show();*/
                        startActivity(new Intent(getApplicationContext(), UIActivity.class));
                        break;
                    case "Wifi Test":
              /*          Toast.makeText(getApplicationContext(),
                                "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                                .show();*/
                        startActivity(new Intent(getApplicationContext(), WIFIActivity.class));
                        break;
                    case "Misc Test":
            /*            Toast.makeText(getApplicationContext(),
                                "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                                .show();*/
                        startActivity(new Intent(getApplicationContext(), MISCActivity.class));
                        break;
                    case "Report":
             /*           Toast.makeText(getApplicationContext(),
                                "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                                .show();*/
                        startActivity(new Intent(getApplicationContext(), ReportActivity.class));
                        break;
                }

            }

        });
    }
}
