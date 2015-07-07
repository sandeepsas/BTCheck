package com.example.btcheck;

import java.util.List;
import java.util.Set;

import android.R.bool;
import android.app.Activity;
import android.app.AlertDialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
	
	private final static int REQUEST_ENABLE_BT = 1;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //sandeep

        
        //sandeep
        
        Button bt_show = (Button)findViewById(R.id.bt_show);
        bt_show.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				start_activity();
				
			}
		});
    }


    protected void start_activity() {
       
        TextView tv_device_name = (TextView) findViewById(R.id.bt_devname);
        TextView tv_device_status = (TextView) findViewById(R.id.bt_status);
        
        Intent enableBtIntent ;
    	BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    	if (!mBluetoothAdapter.isEnabled()) {
    	    enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
    	    startActivityForResult(enableBtIntent,REQUEST_ENABLE_BT);
    	}
    	
    	Set<BluetoothDevice> pairedDevices = mBluetoothAdapter.getBondedDevices();
    	   	
 	
    	
    	// If there are paired devices
    	String tv_text = "";
    	
    	if (pairedDevices.size() > 0) {
    		
    		
 		
    		tv_device_status.setText("Paired Device Found = "+pairedDevices.size());
   		
    	    // Loop through paired devices
    		tv_device_name.setText(Html.fromHtml("") );
    		
    		
    	    for (BluetoothDevice device : pairedDevices) {
    	    	
    	    	
    	    	int device_class = device.getBluetoothClass().getDeviceClass();
    	    	String str_device_class = BTClassResolver.resolveDeviceClass(device_class);
   	    	
    	    	tv_text += "<b><u>" + "PAIRED DEVICE INFO:" + "</u></b>" +  "<br />" 
    	        		+ "DEVICE TYPE = "+str_device_class+ "<br />" + "DEVICE ADDRESS = "+device.getAddress()
    	        		+ "<br />" + "DEVICE NAME = "+device.getName()+ "<br />";
    	    	
    	        
     	    }
    	    tv_device_name.setText(Html.fromHtml(tv_text));
    	} 
    	else
    	{
    		tv_device_status.setText("Paired Device Not Found");
    	}
    	
    	
	}
    

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
    	final Context context = this;
    	int id = item.getItemId();
        if (id == R.id.action_settings) {

        	AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
    				context);
        	alertDialogBuilder.setTitle("CREDITS");
        	alertDialogBuilder.setMessage("Sandeep Sasidharan")
        					  .setPositiveButton("OK", new DialogInterface.OnClickListener() {
        							public void onClick(DialogInterface dialog,int id) {
   
        								dialog.cancel();
        							}
        						  });
        	AlertDialog alertDialog = alertDialogBuilder.create();
			alertDialog.show();
        	
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
