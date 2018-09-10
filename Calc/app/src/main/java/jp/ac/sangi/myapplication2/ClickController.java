package jp.ac.sangi.myapplication2;

import android.view.View;

public class ClickController implements View.OnClickListener{
    private MainActivity activity;  // メイン画面
    private int num1;               // 直近に入力した値
    private int num2;               // 先に入力した値
    private CALC_KIND calcKind;     // 計算の種類

    // コンストラクタ
    ClickController(MainActivity activity) {
        this.activity = activity;
    }

    // 計算の種類の定義
    private enum CALC_KIND{
        PLUS,   // +
        MINUS,  // -
        MUL,    // *
        DIV,    // /
        NONE,   // なし
    }

    // クリックイベント
    @Override
    public void onClick(View v) {
        try {
            switch (v.getId()) {
                case R.id.button0:  // 0ボタン
                    num1 = num1 * 10;
                    break;
                case R.id.button1:      // 1
                    num1 = num1 * 10 + 1;
                    break;
                case R.id.button2:      // 2
                    num1 = num1 * 10 + 2;
                    break;
                case R.id.button3:      // 3
                    num1 = num1 * 10 + 3;
                    break;
                case R.id.button4:      // 4
                    num1 = num1 * 10 + 4;
                    break;
                case R.id.button5:      // 5
                    num1 = num1 * 10 + 5;
                    break;
                case R.id.button6:      // 6
                    num1 = num1 * 10 + 6;
                    break;
                case R.id.button7:      // 7
                    num1 = num1 * 10 + 7;
                    break;
                case R.id.button8:      // 8
                    num1 = num1 * 10 + 8;
                    break;
                case R.id.button9:      // 9
                    num1 = num1 * 10 + 9;
                    break;
                case R.id.buttonClr:    // クリア
                    num1 = 0;
                    num2 = 0;
                    calcKind = CALC_KIND.NONE;
                    break;
                case R.id.buttonPlus:   // +
                    selectCalcKind(CALC_KIND.PLUS);
                    break;
                case R.id.buttonMinus:  // -
                    selectCalcKind(CALC_KIND.MINUS);
                    break;
                case R.id.buttonMul:    // *
                    selectCalcKind(CALC_KIND.MUL);
                    break;
                case R.id.buttonDiv:    // /
                    selectCalcKind(CALC_KIND.DIV);
                    break;
                case R.id.buttonEqual:  // =
                    num1 = calc(num1, num2);    // 計算
                    break;
                default:
                    break;
            }
            // 結果の表示
            activity.setNum(num1);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // 計算の種類の選択時の共通処理
    private void selectCalcKind(CALC_KIND calcKind) {
        num2 = num1;
        num1 = 0;
        this.calcKind = calcKind;
    }

    // 計算
    private int calc(int num1, int num2) {
        int ans;
        switch(calcKind) {
            case PLUS:
                ans = num1 + num2;
                break;
            case MINUS:
                ans = num2 - num1;
                break;
            case MUL:
                ans = num1 * num2;
                break;
            case DIV:
                if(num1 != 0) { // 0除算防止
                    ans = num2 / num1;
                } else {
                    ans = 0;
                }
                break;
            case NONE:
            default:
                ans = 0;
                break;
        }
        return ans;
    }
}
