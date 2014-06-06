package com.example.rbutton_ckbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;
public class MainActivity extends Activity {

	private CheckBox chBox1,chBox2,chBox3;
    private TextView txtV_Check;
   
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        levantarXML();
        //  setup();
  pepe();
    }

 
    
    
    
	private void setup() {
		chBox1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		
				if (isChecked){
					txtV_Check.setText("check 1 tildado");
					
				}else txtV_Check.setText("check 1 destildado");
		
			}
		});
	}

	private void levantarXML() {
		chBox1=(CheckBox) findViewById(R.id.checkBox1);
		chBox2=(CheckBox) findViewById(R.id.checkBox2);
		chBox3=(CheckBox) findViewById(R.id.checkBox3);
		txtV_Check=(TextView) findViewById(R.id.txtV_Check);
	}


   

}
