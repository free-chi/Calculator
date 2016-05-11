package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	
	/*
	 * ��Ƿ�
	 * */
	StringBuffer stringBuffer = new StringBuffer();//������ŴӰ�ť�õ�������
	String [] a;//��stringBuffer�е��ַ����ָ�����������
	char c;//��Ϊ�����������֮����ж����� �� ��
	Double result = 0.0;
	Double temp;//�м����
	int len;//���stringBuffer�ĳ���
	Boolean getResult = false;//�Ƿ�õ����
	
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
         * ��ʼ��
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
         * ���ü�����
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
		case R.id.delete://��һ����
			len = stringBuffer.length();
			if(len == 0){
				break;
			}else{
				stringBuffer.delete(len-1, len);//��stringBuffer.substring(0, len-1);��һ����
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
		case R.id.point://������������ֺ�� . ���������ֵ� ��� 0.
			len = stringBuffer.toString().length();
			if(len == 0){// textViewΪ�յ�ʱ���Զ���� 0.
				stringBuffer.append("0.");
				textView.setText("0.");
				break;
			}
			c = stringBuffer.charAt(len-1);//δ�����ж� . ǰ���Ƿ���ڿո�Ϊ�ո�ǰ�����������������0. ������� .
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
			 if(len != 0 && stringBuffer.charAt(len-1) != ' '){//��������Ϊ�պ��ַ������һ���ֽڲ�Ϊ�գ��������ظ����������ʱ����������������
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
			
//			LogUtil.e("len-1 ��ֵ�� " + stringBuffer.charAt(len-2));
			
			//�жϻ����������ڶ��ַ��Ƿ�Ϊ����������Ϊ����������ӻ������޳�������������
			if(stringBuffer.charAt(len-2) == '+' 
					|| stringBuffer.charAt(len-2) == '-' 
					|| stringBuffer.charAt(len-2) == 'x' 
					|| stringBuffer.charAt(len-2) == '/'){
				stringBuffer.delete(len-3, len);
				textView.setText(textView.getText().toString().substring(0, textView.getText().toString().length()-1));
//				LogUtil.e("�޳�������������");
			}
			String tempAll = stringBuffer.toString();
			a = tempAll.split(" ");
			stringBuffer.append(btnEquality.getText().toString());
			/*
			 * �˷�����
			 * */
			for(int i=0;i<a.length;i++){
				if(a[i].equals("x")){
					temp = Double.parseDouble(a[i-1]) * Double.parseDouble(a[i+1]);//��������������ߵ����ֽ�������
					a[i+1] = ""+temp;//""��a[i+1]����ת�����ַ���
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
			 * ��������
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
			 * ��������
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
			 * �ӷ�����
			 * */
			for (int i = 0;i < (a.length+1)/2;i++){
				result += Double.parseDouble(a[2*i]);//��ż���Ǳ�����������
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
