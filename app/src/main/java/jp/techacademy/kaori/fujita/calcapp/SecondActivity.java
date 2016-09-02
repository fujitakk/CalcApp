package jp.techacademy.kaori.fujita.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
	double result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		Intent intent = getIntent();
		double value1 = intent.getDoubleExtra("VALUE1", 0.0);
		double value2 = intent.getDoubleExtra("VALUE2", 0.0);
		int value3 = intent.getIntExtra("VALUE3", 0);

		if (value3 == 1) {
			//加算
			result = value1 + value2;
		} else if (value3 == 2) {
			//減算
			result = value1 - value2;
		} else if (value3 == 3) {
			//乗算
			result = value1 * value2;
		} else if (value3 == 4) {
			//除算
			result = value1 / value2;
		} else {
			result = 0;
		}

		TextView textView = (TextView) findViewById(R.id.text10);
		textView.setText(String.valueOf(result));
	}
}
