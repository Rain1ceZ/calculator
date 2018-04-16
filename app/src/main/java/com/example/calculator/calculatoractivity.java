package com.example.calculator;

        import android.os.Bundle;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.widget.TextView;
        import android.app.Activity;

public class calculatoractivity extends Activity  implements OnClickListener{

    //声明一些控件
    Button sin=null;
    Button cos=null;
    Button tan=null;
    Button jinzhi=null;
    Button pingfang=null;
    Button kaifang=null;
    Button clr=null;
    Button del=null;
    Button bt_7=null;
    Button bt_8=null;
    Button bt_9=null;
    Button plus=null;
    Button bt_4=null;
    Button bt_5=null;
    Button bt_6=null;
    Button jian=null;
    Button bt_1=null;
    Button bt_2=null;
    Button bt_3=null;
    Button cheng=null;
    Button bt_0=null;
    Button dian=null;
    Button dengyu=null;
    Button chu=null;
    TextView input=null;
    //声明两个参数。接收show前后的值
    double num1=0,num2=0;
    double Result=0;//计算结果
    int op=0;//判断操作数，
    boolean isClickEqu=false;//判断是否按了“=”按钮

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatoractivity);
        //从布局文件中获取控件，
        sin=(Button)findViewById(R.id.sin);
        cos=(Button)findViewById(R.id.cos);
        tan=(Button)findViewById(R.id.tan);
        jinzhi=(Button)findViewById(R.id.jinzhi);
        pingfang=(Button)findViewById(R.id.pingfang);
        kaifang=(Button)findViewById(R.id.kaifang);
       clr=(Button)findViewById(R.id.clr);
        del=(Button)findViewById(R.id.del);
        bt_7=(Button)findViewById(R.id.bt_7);
        bt_8=(Button)findViewById(R.id.bt_8);
        bt_9=(Button)findViewById(R.id.bt_9);
        plus=(Button)findViewById(R.id.plus);
        bt_4=(Button)findViewById(R.id.bt_4);
        bt_5=(Button)findViewById(R.id.bt_5);
        bt_6=(Button)findViewById(R.id.bt_6);
        jian=(Button)findViewById(R.id.jian);
        bt_1=(Button)findViewById(R.id.bt_1);
        bt_2=(Button)findViewById(R.id.bt_2);
        bt_3=(Button)findViewById(R.id.bt_3);
        cheng=(Button)findViewById(R.id.cheng);
        bt_0=(Button)findViewById(R.id.bt_0);
        dian=(Button)findViewById(R.id.dian);
        dengyu=(Button)findViewById(R.id.dengyu);
        chu=(Button)findViewById(R.id.chu);
       input=(TextView)findViewById(R.id.input);

        //添加监听\
        del.setOnClickListener(this);
        clr.setOnClickListener(this);

        bt_0.setOnClickListener(this);
        bt_1.setOnClickListener(this);
        bt_2.setOnClickListener(this);
        bt_3.setOnClickListener(this);
        bt_4.setOnClickListener(this);
        bt_5.setOnClickListener(this);
        bt_6.setOnClickListener(this);
        bt_7.setOnClickListener(this);
        bt_8.setOnClickListener(this);
        bt_9.setOnClickListener(this);

        sin.setOnClickListener(this);
        cos.setOnClickListener(this);
        tan.setOnClickListener(this);
        jinzhi.setOnClickListener(this);
        pingfang.setOnClickListener(this);
        kaifang.setOnClickListener(this);
        clr.setOnClickListener(this);
        del.setOnClickListener(this);
        plus.setOnClickListener(this);
        jian.setOnClickListener(this);
        cheng.setOnClickListener(this);
        chu.setOnClickListener(this);
        dian.setOnClickListener(this);
        dengyu.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //back和AC--------------------
            case R.id.del:
                String myStr=input.getText().toString();
                try {
                    input.setText(myStr.substring(0, myStr.length() - 1));
                } catch (Exception e) {
                    input.setText("");
                }

                break;
            case R.id.clr:
                input.setText(null);
                break;

            //but0--9---------------------------
            case R.id.bt_0:
                if(isClickEqu)
                {
                    input.setText(null);
                    isClickEqu=false;
                }
                String myString=input.getText().toString();
                myString+="0";
                input.setText(myString);
                break;
            case R.id.bt_1:
                if(isClickEqu)
                {
                    input.setText(null);
                    isClickEqu=false;
                }
                String myString1=input.getText().toString();
                myString1+="1";
                input.setText(myString1);
                break;
            case R.id.bt_2:
                if(isClickEqu)
                {
                    input.setText(null);
                    isClickEqu=false;
                }
                String myString2=input.getText().toString();
                myString2+="2";
                input.setText(myString2);
                break;
            case R.id.bt_3:
                if(isClickEqu)
                {
                    input.setText(null);
                    isClickEqu=false;
                }
                String myString3=input.getText().toString();
                myString3+="3";
                input.setText(myString3);
                break;
            case R.id.bt_4:
                if(isClickEqu)
                {
                    input.setText(null);
                    isClickEqu=false;
                }
                String myString4=input.getText().toString();
                myString4+="4";
                input.setText(myString4);
                break;
            case R.id.bt_5:
                if(isClickEqu)
                {
                    bt_5.setText(null);
                    isClickEqu=false;
                }
                String myString5=input.getText().toString();
                myString5+="5";
                input.setText(myString5);
                break;
            case R.id.bt_6:
                if(isClickEqu)
                {
                    input.setText(null);
                    isClickEqu=false;
                }
                String myString6=input.getText().toString();
                myString6+="6";
                input.setText(myString6);
                break;
            case R.id.bt_7:
                if(isClickEqu)
                {
                    input.setText(null);
                    isClickEqu=false;
                }
                String myString7=input.getText().toString();
                myString7+="7";
                input.setText(myString7);
                break;
            case R.id.bt_8:
                if(isClickEqu)
                {
                    input.setText(null);
                    isClickEqu=false;
                }
                String myString8=input.getText().toString();
                myString8+="8";
                input.setText(myString8);
                break;
            case R.id.bt_9:
                if(isClickEqu)
                {
                    input.setText(null);
                    isClickEqu=false;
                }
                String myString9=input.getText().toString();
                myString9+="9";
                input.setText(myString9);
                break;
            case R.id.dian:
                if(isClickEqu)
                {
                    input.setText(null);
                    isClickEqu=false;
                }
                String myStringspot=input.getText().toString();
                myStringspot+=".";
                input.setText(myStringspot);
                break;

            //btn+-*/=--------------------------------
            case R.id.plus:
                String myStringAdd=input.getText().toString();
                if(myStringAdd.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(myStringAdd);
                input.setText(null);
                op=1;
                isClickEqu=false;
                break;

            case R.id.jian:
                String myStringSub=input.getText().toString();
                if(myStringSub.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(myStringSub);
                input.setText(null);
                op=2;
                isClickEqu=false;
                break;
            case R.id.cheng:
                String myStringMul=input.getText().toString();
                if(myStringMul.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(myStringMul);
                input.setText(null);
                op=3;
                isClickEqu=false;
                break;
            case R.id.chu:
                String myStringDiv=input.getText().toString();
                if(myStringDiv.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(myStringDiv);
                input.setText(null);
                op=4;
                isClickEqu=false;
                break;
            case R.id.kaifang:
                String myStringPer=input.getText().toString();
                num1=Double.valueOf(myStringPer);
                num1=Math.sqrt(num1);
                String show3=String.valueOf(num1);
                input.setText(show3);
                isClickEqu=true;
                break;
            case R.id.pingfang:
                String myStringsq=input.getText().toString();
                num1=Double.valueOf(myStringsq);
                double num2=num1*num1;
                String show1=String.valueOf(num2);
                input.setText(show1);
                isClickEqu=true;
                break;
            case R.id.tan:
                String myStringtan=input.getText().toString();
                num1=Double.valueOf(myStringtan);
                double numtan=Math.tan(num1);
                String showtan=String.valueOf(numtan);
                input.setText(showtan);
                isClickEqu=true;
                break;
            case R.id.sin:
                String myStringsin=input.getText().toString();
                num1=Double.valueOf(myStringsin);
                double numsin=Math.sin(num1);
                String showsin=String.valueOf(numsin);
                input.setText(showsin);
                isClickEqu=true;
                break;
            case R.id.cos:
                String myStringcos=input.getText().toString();
                num1=Double.valueOf(myStringcos);
                double numcos=Math.cos(num1);
                String showcos=String.valueOf(numcos);
                input.setText(showcos);
                isClickEqu=true;
                break;
            case R.id.jinzhi:
                String myStringjinzhi=input.getText().toString();
                num1= Double.valueOf(myStringjinzhi);
                String numjinzhi = Integer.toBinaryString((int) num1);
                String showjinzhi=String.valueOf(numjinzhi);
                input.setText(showjinzhi);
                isClickEqu=true;
                break;
            case R.id.dengyu:
                String myStringEqu=input.getText().toString();
                if(myStringEqu.equals(null))
                {
                    return;
                }
                num2=Double.valueOf(myStringEqu);
                input.setText(null);
                switch (op) {
                    case 0:
                        Result=num2;
                        break;
                    case 1:
                        Result=num1+num2;
                        break;
                    case 2:
                        Result=num1-num2;
                        break;
                    case 3:
                        Result=num1*num2;
                        break;
                    case 4:
                        Result=num1/num2;
                        break;
                    default:
                        Result=0;
                        break;
                }
                input.setText(String.valueOf(Result));
                isClickEqu=true;
                break;

            default:
                break;
        }
    }
}
