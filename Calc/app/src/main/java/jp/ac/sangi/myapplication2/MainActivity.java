package jp.ac.sangi.myapplication2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ClickController clickController = new ClickController(this);

        // リソース取得
        textView = findViewById(R.id.textView);

        Button btn0     = findViewById(R.id.button0);
        Button btn1     = findViewById(R.id.button1);
        Button btn2     = findViewById(R.id.button2);
        Button btn3     = findViewById(R.id.button3);
        Button btn4     = findViewById(R.id.button4);
        Button btn5     = findViewById(R.id.button5);
        Button btn6     = findViewById(R.id.button6);
        Button btn7     = findViewById(R.id.button7);
        Button btn8     = findViewById(R.id.button8);
        Button btn9     = findViewById(R.id.button9);
        Button btnC     = findViewById(R.id.buttonClr);
        Button btnPlus  = findViewById(R.id.buttonPlus);
        Button btnMinus = findViewById(R.id.buttonMinus);
        Button btnMul   = findViewById(R.id.buttonMul);
        Button btnDiv   = findViewById(R.id.buttonDiv);
        Button btnEqual = findViewById(R.id.buttonEqual);

        // リスナーの登録
        btn0.setOnClickListener(clickController);
        btn1.setOnClickListener(clickController);
        btn2.setOnClickListener(clickController);
        btn3.setOnClickListener(clickController);
        btn4.setOnClickListener(clickController);
        btn5.setOnClickListener(clickController);
        btn6.setOnClickListener(clickController);
        btn7.setOnClickListener(clickController);
        btn8.setOnClickListener(clickController);
        btn9.setOnClickListener(clickController);
        btnC.setOnClickListener(clickController);
        btnPlus.setOnClickListener(clickController);
        btnMinus.setOnClickListener(clickController);
        btnMul.setOnClickListener(clickController);
        btnDiv.setOnClickListener(clickController);
        btnEqual.setOnClickListener(clickController);
    }

    // 画面に値を表示する
    public void setNum(int num) {
        textView.setText(getString(R.string.empty) + num);
    }

    // デバッグ用
    /*
    public void testFunc() {
        Toast.makeText(this, "test", Toast.LENGTH_LONG).show();
        Log.d("test", "button click");
    }
    */
}
