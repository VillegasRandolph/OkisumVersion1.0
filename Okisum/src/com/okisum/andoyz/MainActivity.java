package com.okisum.andoyz;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.TextView;
import android.widget.Toast;

import com.okisum.andoyz.R;
import com.okisum.andoyz.view.CircleImageView;
import com.okisum.andoyz.view.CircleLayout;
import com.okisum.andoyz.view.CircleLayout.OnCenterClickListener;
import com.okisum.andoyz.view.CircleLayout.OnItemClickListener;
import com.okisum.andoyz.view.CircleLayout.OnItemSelectedListener;
import com.okisum.andoyz.view.CircleLayout.OnRotationFinishedListener;

public class MainActivity extends Activity implements OnItemSelectedListener,
		OnItemClickListener, OnRotationFinishedListener, OnCenterClickListener {
	TextView selectedTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		android.app.ActionBar ar = getActionBar();
		 ar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#cc93cc")));
		
		CircleLayout circleMenu = (CircleLayout) findViewById(R.id.main_circle_layout);
		circleMenu.setOnItemSelectedListener(this);
		circleMenu.setOnItemClickListener(this);
		circleMenu.setOnRotationFinishedListener(this);
		circleMenu.setOnCenterClickListener(this);

		selectedTextView = (TextView) findViewById(R.id.main_selected_textView);
		selectedTextView.setText(((CircleImageView) circleMenu
				.getSelectedItem()).getName());
	}

	@Override
	public void onItemSelected(View view, String name) {
		selectedTextView.setText(name);

		switch (view.getId()) {
			case R.id.main_songlib_image:
				// Handle songlib selection
				break;
			case R.id.main_nowplay_image:
				// Handle nowplay selection
				break;
			case R.id.main_chordvar_image:
				// Handle chordvar selection
				break;
			case R.id.main_tips_image:
				// Handle tips selection
				break;
				
			case R.id.main_credits_image:
				// Handle credits selection
				break;
			case R.id.main_exit_image:
				// Handle exit selection
				break;
		
		}
	}

	@Override
	public void onItemClick(View view, String name) {
		//Toast.makeText(getApplicationContext(),
			//	getResources().getString(R.string.start_app) + " " + name,
				//Toast.LENGTH_SHORT).show();

		switch (view.getId()) {
			case R.id.main_songlib_image:
				Intent intent = new Intent(this, MusicBrowserActivity.class);
				startActivity(intent);

				// Handle songlib click
				break;
			case R.id.main_nowplay_image:
				Intent intent1 = new Intent(this, MediaPlaybackActivity.class);
				startActivity(intent1);

				// Handle nowplay click
				break;
			case R.id.main_chordvar_image:
				Intent intent3 = new Intent(this, ChordVarActivity.class);
				startActivity(intent3);
				// Handle chordvar click
				break;
			case R.id.main_tips_image:
				// Handle tips click
				break;
				
			case R.id.main_credits_image:
				Intent intent2 = new Intent(this, CreditActivity.class);
				startActivity(intent2);
				// Handle credits click
				break;
			case R.id.main_exit_image:
				
				this.finish();
				// Handle exit click
				break;
			
		}
	}

	@Override
	public void onCenterClick() {
		Toast.makeText(getApplicationContext(), R.string.center_click,
				Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onRotationFinished(View view, String name) {
		Animation animation = new RotateAnimation(0, 360, view.getWidth() / 2,
				view.getHeight() / 2);
		animation.setDuration(250);
		view.startAnimation(animation);
	}

}

