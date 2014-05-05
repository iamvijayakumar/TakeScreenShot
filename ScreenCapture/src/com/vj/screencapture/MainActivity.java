package com.vj.screencapture;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import android.support.v4.app.FragmentActivity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class MainActivity extends FragmentActivity {
	 ImageView im;
	  LinearLayout linerlay;
	  GoogleMap gMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        SupportMapFragment mapFrag = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
          gMap = mapFrag.getMap();
          gMap.setMyLocationEnabled(true);
          gMap.getUiSettings().setZoomControlsEnabled(true);
          gMap.getUiSettings().setCompassEnabled(true);
          linerlay = (LinearLayout)findViewById(R.id.linearLayout);
        
          im = (ImageView)findViewById(R.id.imageView1);
        Button btn = (Button)findViewById(R.id.button1);
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 View v1 = im.getRootView().findViewById(R.id.map);
                 v1.setDrawingCacheEnabled(true);
                 Bitmap bm = v1.getDrawingCache();
                 BitmapDrawable bitmapDrawable = new BitmapDrawable(bm);
				im.setImageBitmap(bm);
			}
		});
       
    }


   
}
