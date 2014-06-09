package com.example.rbutton_ckbox;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class MainActivity extends Activity  {

	private CheckBox chBox1,chBox2,chBox3;
    private TextView txtV_Check,txtV_seekbar;
    private SeekBar seekBar1;
   
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        levantarXML();
        //  setup();
        pepe();
        seekBar1.setProgress(0);
          barra();      
    }

 
    
    
    
	





	private void barra() {
		
		
		seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				
				txtV_seekbar.setText("Señal: "+progress+" dbm");
				
			}
		});
	}











	private void pepe() {
		// TODO Auto-generated method stub
		
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
		seekBar1=(SeekBar) findViewById(R.id.seekBar1);
		txtV_seekbar=(TextView) findViewById(R.id.txtV_Seek);
		txtV_seekbar.setText("Señal: 0 dbm");
	}


   

}
