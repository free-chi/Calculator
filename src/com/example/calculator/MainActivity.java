package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	
	/*
	 * 标记符
	 * */
	StringBuffer stringBuffer = new StringBuffer();//用来存放从按钮得到的数据
	String [] a;//将stringBuffer中的字符串分割存放在数组中
	char c;//作为运算符和数字之间的判断桥梁 ‘ ’
	Double result = 0.0;
	Double temp;//中间变量
	int len;//存放stringBuffer的长度
	Boolean getResult = false;//是否得到结果
	
	private TextView textView;
	
	private Button btnPoint;
	private Button btnEquality;
	private Button btnClear;
	private Button btnDelete;
	
	private Button btnAdd;
	private Button btnMinus;
	private Button btnMultiply;
	private Button btnDivide;

	
	private Button num0;
	private Button num1;
	private Button num2;
	private Button num3;
	private Button num4;
	private Button num5;
	private Button num6;
	private Button num7;
	private Button num8;
	private Button num9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_layout);
        /*
         * 初始化
         * */
        textView = (TextView) findViewById(R.id.text_view);
        btnPoint = (Button) findViewById(R.id.point);
        btnEquality = (Button) findViewById(R.id.equality);
        btnClear = (Button) findViewById(R.id.clear);
        btnDelete = (Button) findViewById(R.id.delete);
        
        btnAdd = (Button) findViewById(R.id.add);
        btnMinus = (Button) findViewById(R.id.minus);
        btnMultiply = (Button) findViewById(R.id.multiply);
        btnDivide = (Button) findViewById(R.id.divide);
        
        num0 = (Button) findViewById(R.id.button0);
        num1 = (Button) findViewById(R.id.button1);
        num2 = (Button) findViewById(R.id.button2);
        num3 = (Button) findViewById(R.id.button3);
        num4 = (Button) findViewById(R.id.button4);
        num5 = (Button) findViewById(R.id.button5);
        num6 = (Button) findViewById(R.id.button6);
        num7 = (Button) findViewById(R.id.button7);
        num8 = (Button) findViewById(R.id.button8);
        num9 = (Button) findViewById(R.id.button9);
        
        /*
         * 设置监听器
         * */
//      textView.setOnClickListener(this);
        btnPoint.setOnClickListener(this);
        btnEquality.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
        
        btnAdd.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        
        num0.setOnClickListener(this);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		
		if(getResult){
			stringBuffer.delete(0, stringBuffer.toString().length());
			textView.setText("");
			getResult = false;
			result = 0.0;
		}
		
		switch(v.getId()){
		case R.id.button0:
			stringBuffer.append(num0.getText().toString());
			textView.setText(textView.getText().toString() + num0.getText().toString());
			break;
		case R.id.button1:
			stringBuffer.append(num1.getText().toString());
			textView.setText(textView.getText().toString() + num1.getText().toString());
			break;
		case R.id.button2:
			stringBuffer.append(num2.getText().toString());
			textView.setText(textView.getText().toString() + num2.getText().toString());
			break;
		case R.id.button3:
			stringBuffer.append(num3.getText().toString());
			textView.setText(textView.getText().toString() + num3.getText().toString());
			break;
		case R.id.button4:
			stringBuffer.append(num4.getText().toString());
			textView.setText(textView.getText().toString() + num4.getText().toString());
			break;
		case R.id.button5:
			stringBuffer.append(num5.getText().toString());
			textView.setText(textView.getText().toString() + num5.getText().toString());
			break;
		case R.id.button6:
			stringBuffer.append(num6.getText().toString());
			textView.setText(textView.getText().toString() + num6.getText().toString());
			break;
		case R.id.button7:
			stringBuffer.append(num7.getText().toString());
			textView.setText(textView.getText().toString() + num7.getText().toString());
			break;
		case R.id.button8:
			stringBuffer.append(num8.getText().toString());
			textView.setText(textView.getText().toString() + num8.getText().toString());
			break;
		case R.id.button9:
			stringBuffer.append(num9.getText().toString());
			textView.setText(textView.getText().toString() + num9.getText().toString());
			break;
		case R.id.delete://退一个格
			len = stringBuffer.length();
			if(len == 0){
				break;
			}else{
				stringBuffer.delete(len-1, len);//和stringBuffer.substring(0, len-1);是一样的
				textView.setText(textView.getText().toString().substring(0, textView.getText().toString().length()-1));
				break;
			}
		case R.id.clear:
			len = stringBuffer.length();
			if(len == 0){
				break;
			}else{
				stringBuffer.delete(0, len);
				textView.setText("");
				break;
			}
		case R.id.point://两种情况，数字后加 . ，不是数字的 添加 0.
			len = stringBuffer.toString().length();
			if(len == 0){// textView为空的时候，自动添加 0.
				stringBuffer.append("0.");
				textView.setText("0.");
				break;
			}
			c = stringBuffer.charAt(len-1);//未下面判断 . 前面是否存在空格，为空格即前面存在着运算符，添加0. 否则添加 .
			if(c == ' '){
				stringBuffer.append("0.");
				textView.setText(textView.getText().toString() + "0.");
				break;
			}else if(c == '.'){
				break;
			}else if(c != ' '){
				stringBuffer.append(".");
				textView.setText(textView.getText().toString() + ".");
				break;
			}
		case R.id.add:
			 len = stringBuffer.length();
			 if(len != 0 && stringBuffer.charAt(len-1) != ' '){//缓冲区不为空和字符串最后一个字节不为空（不存在重复的运算符）时添加运算符到缓冲区
				 stringBuffer.append(" " + btnAdd.getText().toString() + " ");
				 textView.setText(textView.getText().toString() + btnAdd.getText().toString());
			 } 
			break;
		case R.id.minus:
			 len = stringBuffer.length();
			 if(len != 0 && stringBuffer.charAt(len-1) != ' '){
				 stringBuffer.append(" " + btnMinus.getText().toString() + " ");
				 textView.setText(textView.getText().toString() + btnMinus.getText().toString());
			 } 
			break;
		case R.id.multiply:
			len = stringBuffer.length();
			 if(len != 0 && stringBuffer.charAt(len-1) != ' '){
				 stringBuffer.append(" " + btnMultiply.getText().toString() + " ");
				 textView.setText(textView.getText().toString() + btnMultiply.getText().toString());
			 } 
			break;
		case R.id.divide:
			len = stringBuffer.length();
			 if(len != 0 && stringBuffer.charAt(len-1) != ' '){
				 stringBuffer.append(" " + btnDivide.getText().toString() + " ");
				 textView.setText(textView.getText().toString() + btnDivide.getText().toString());
			 } 
			break;
		case R.id.equality:
			getResult = true;
			len = stringBuffer.length();
			if(len == 0){
				textView.setText("");
				break;
			}
			
//			LogUtil.e("len-1 的值： " + stringBuffer.charAt(len-2));
			
			//判断缓冲区倒数第二字符是否为运算符，如果为运算符把他从缓冲区剔除，继续计算结果
			if(stringBuffer.charAt(len-2) == '+' 
					|| stringBuffer.charAt(len-2) == '-' 
					|| stringBuffer.charAt(len-2) == 'x' 
					|| stringBuffer.charAt(len-2) == '/'){
				stringBuffer.delete(len-3, len);
				textView.setText(textView.getText().toString().substring(0, textView.getText().toString().length()-1));
//				LogUtil.e("剔除最后多余的运算符");
			}
			String tempAll = stringBuffer.toString();
			a = tempAll.split(" ");
			stringBuffer.append(btnEquality.getText().toString());
			/*
			 * 乘法处理
			 * */
			for(int i=0;i<a.length;i++){
				if(a[i].equals("x")){
					temp = Double.parseDouble(a[i-1]) * Double.parseDouble(a[i+1]);//对运算符左右两边的数字进行运算
					a[i+1] = ""+temp;//""把a[i+1]重新转换成字符串
					a[i-1] = "0";
					if (i == 1){
						a[i] = "+";
					}
					else{
						a[i] = a[i-2];
					}
				}
			}
			/*
			 * 除法处理
			 * */
			for(int i=0;i<a.length;i++){
				if(a[i].equals("/")){
					temp = Double.parseDouble(a[i-1])*1.0 / Double.parseDouble(a[i+1]);
					a[i+1] = ""+temp;
					a[i-1] = "0";
					if (i == 1){
						a[i] = "+";
					}
					else{
						a[i] = a[i-2];
					}
				}
			}
			/*
			 * 减法处理
			 * */
			for(int i=0;i<a.length;i++){
				if(a[i].equals("-")){
					temp = Double.parseDouble(a[i-1]) - Double.parseDouble(a[i+1]);
					a[i+1] = ""+temp;
					a[i-1] = "0";
					if (i == 1){
						a[i] = "+";
					}
					else{
						a[i] = a[i-2];
					}
				}
			}
			/*
			 * 加法处理
			 * */
			for (int i = 0;i < (a.length+1)/2;i++){
				result += Double.parseDouble(a[2*i]);//对偶数角标的数进行相加
			}
			textView.setText(textView.getText().toString() + " = " + result);
			break;
		default:
			break;
		}
/*		if(result==0.0){
			textView.setText(stringBuffer.toString());
		}else{
			textView.setText(stringBuffer.toString() + result);
		}*/
		
	}

 
}
