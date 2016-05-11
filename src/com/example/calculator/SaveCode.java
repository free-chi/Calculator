package com.example.calculator;

public class SaveCode {

	/*switch (v.getId()) {
    //btnBackspace和CE--------------------
    case R.id.delete:
        String myStr=editText.getText().toString();
        try {
        	editText.setText(myStr.substring(0, myStr.length()-1));
        } catch (Exception e) {
        	editText.setText("");
        }

        break;
    case R.id.clear:
    	editText.setText(null);
        break;

        //btn0--9---------------------------
    case R.id.button0:
        if(isClickEqu)
        {
        	editText.setText(null);
            isClickEqu=false;
        }
        String myString=editText.getText().toString();
        myString+="0";
        editText.setText(myString);
        break;
    case R.id.button1:
        if(isClickEqu)
        {
        	editText.setText(null);
            isClickEqu=false;
        }
        String myString1=editText.getText().toString();
        myString1+="1";
        editText.setText(myString1);
        break;
    case R.id.button2:
        if(isClickEqu)
        {
        	editText.setText(null);
            isClickEqu=false;
        }
        String myString2=editText.getText().toString();
        myString2+="2";
        editText.setText(myString2);
        break;
    case R.id.button3:
        if(isClickEqu)
        {
        	editText.setText(null);
            isClickEqu=false;
        }
        String myString3=editText.getText().toString();
        myString3+="3";
        editText.setText(myString3);
        break;
    case R.id.button4:
        if(isClickEqu)
        {
        	editText.setText(null);
            isClickEqu=false;
        }
        String myString4=editText.getText().toString();
        myString4+="4";
        editText.setText(myString4);
        break;
    case R.id.button5:
        if(isClickEqu)
        {
        	editText.setText(null);
            isClickEqu=false;
        }
        String myString5=editText.getText().toString();
        myString5+="5";
        editText.setText(myString5);
        break;
    case R.id.button6:
        if(isClickEqu)
        {
        	editText.setText(null);
            isClickEqu=false;
        }
        String myString6=editText.getText().toString();
        myString6+="6";
        editText.setText(myString6);
        break;
    case R.id.button7:
        if(isClickEqu)
        {
        	editText.setText(null);
            isClickEqu=false;
        }
        String myString7=editText.getText().toString();
        myString7+="7";
        editText.setText(myString7);
        break;
    case R.id.button8:
        if(isClickEqu)
        {
        	editText.setText(null);
            isClickEqu=false;
        }
        String myString8=editText.getText().toString();
        myString8+="8";
        editText.setText(myString8);
        break;
    case R.id.button9:
        if(isClickEqu)
        {
        	editText.setText(null);
            isClickEqu=false;
        }
        String myString9=editText.getText().toString();
        myString9+="9";
        editText.setText(myString9);
        break;

        
    case R.id.add:            
        String myStringAdd=editText.getText().toString();
        if(myStringAdd.equals(null))
        {
            return;
        }
        number1=Double.valueOf(myStringAdd);
        editText.setText(null);
        op=1;
        isClickEqu=false;
        break;

    case R.id.minus:
        String myStringSub=editText.getText().toString();
        if(myStringSub.equals(null))
        {
            return;
        }
        number1=Double.valueOf(myStringSub);
        editText.setText(null);
        op=2;
        isClickEqu=false;
        break;
    case R.id.multiply:
        String myStringMul=editText.getText().toString();
        if(myStringMul.equals(null))
        {
            return;
        }
        number1=Double.valueOf(myStringMul);
        editText.setText(null);
        op=3;
        isClickEqu=false;
        break;
    case R.id.divide:
        String myStringDiv=editText.getText().toString();
        if(myStringDiv.equals(null))
        {
            return;
        }
        number1=Double.valueOf(myStringDiv);
        editText.setText(null);
        op=4;
        isClickEqu=false;
        break;
    case R.id.equality:
        String myStringEqu=editText.getText().toString();
        if(myStringEqu.equals(null))
        {
            return;
        }
        number2=Double.valueOf(myStringEqu);
        editText.setText(null);
        switch (op) {
        case 0:
            result=number2;
            break;
        case 1:
            result=number1+number2;
            break;
        case 2:
            result=number1-number2;
            break;
        case 3:
            result=number1*number2;
            break;
        case 4:
            result=number1/number2;
            break;
        default:
            result=(double) 0;
            break;
        }
        editText.setText(String.valueOf(result));
        isClickEqu=true;
        break;

    default:
        break;
    }*/
	/* 
	 * 问题代码使用Button btn = (Button) v  btn.getText().toString()方法
	 * 进行数据运算对十位运算来说可以，多位运算比较麻烦
	 * 
	 * 
	 * Button btn = (Button) v;	 
	 
	 LogUtil.e("null==\"\"  :"+ (null==""));
	 
	 if(result){
		 editText.setText("");
		 result = false;
	 }
	 
	 if(btn.getText().equals("+")
			 || btn.getText().equals("-")
			 || btn.getText().equals("x")
			 || btn.getText().equals("/")){
		 if(strNum1 == null){
			 editText.setText("");
			 return;
		 }else {
			 if(operational != true){//运算符标志为空时，添加运算符

				 savaOperational = btn.getText().toString();
				 String temp = editText.getText().toString();
				 editText.setText(temp+" "+savaOperational+" ");
				 operational = true;
				 return;
			 }else {
				 savaOperational = btn.getText().toString();//如果重新点击运算符，以最后一个为准
				 return;
			 }
		 }
		 
	 }else if(btn.getText().equals("0")
			 ||btn.getText().equals("1")
			 ||btn.getText().equals("2")
			 ||btn.getText().equals("3")
			 ||btn.getText().equals("4")
			 ||btn.getText().equals("5")
			 ||btn.getText().equals("6")
			 ||btn.getText().equals("7")
			 ||btn.getText().equals("8")
			 ||btn.getText().equals("9")){

		 if(strNum1 == null){//在editText为空时，给intnum1赋值
			 strNum1 = btn.getText().toString();
			 intNum1 = Integer.valueOf(strNum1);//将字符串的按钮text转换成integer数据
			 editText.setText(strNum1);
		 }else{//intNum1已经有值是，给intnum2赋值
			 strNum2 = btn.getText().toString();
			 intNum2 = Integer.valueOf(strNum2);
			 String temp = editText.getText().toString();
			 editText.setText(temp+strNum2);
		 }

	 }else if(btn.getText().equals("clear")){
		 
		 editText.setText("");
		 
	 }else if(btn.getText().equals("c")){
		 
		 String temp = editText.getText().toString();
		 editText.setText(temp.substring(0, temp.length()-1));
	 }
	 
	 if(btn.getText().equals("=") || (operational==true && (strNum1!=null && strNum2!=null))){

		 String temp = editText.getText().toString();
		 int intResult;
		 
		 switch(savaOperational){
		 case "+":
			 intResult = intNum1+intNum2;
			 editText.setText(temp+" = "+intResult);
			 editText.setSelection(editText.getText().toString().length());
			 savaOperational = null;
			 strNum1 = null;
			 strNum2 = null;
			 result = true;
			 break;
		 case "-":
			 intResult = intNum1-intNum2;
			 editText.setText(temp+" = "+intResult);
			 editText.setSelection(editText.getText().toString().length());
			 savaOperational = null;
			 strNum1 = null;
			 strNum2 = null;
			 result = true;
			 break;
		 case "x":
			 intResult = intNum1*intNum2;
			 editText.setText(temp+" = "+intResult);
			 editText.setSelection(editText.getText().toString().length());
			 savaOperational = null;
			 strNum1 = null;
			 strNum2 = null;
			 result = true;
			 break;
		 case "/":
			 intResult = intNum1/intNum2;
			 editText.setText(temp+" = "+intResult);
			 editText.setSelection(editText.getText().toString().length());
			 savaOperational = null;
			 strNum1 = null;
			 strNum2 = null;
			 result = true;
			 break;
		 default:
			 break;
		 }
	 }
	*/
}
