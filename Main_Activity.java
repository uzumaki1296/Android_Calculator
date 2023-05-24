package com.comp.ccoew.cal6;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import static java.lang.Math.log;
import static java.lang.Math.log10;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
//import org.apache.commons.math.util.MathUtils;

public class MainActivity extends AppCompatActivity {
 Button
b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,
b25,b26,b27,b28,b29;
 EditText num,disp;
 float num1,num2;
 boolean add,sub,mul,div,power,sqr;
 int fact=1,i;
 File newfile=new File("/storage/sdcard/myfile.txt");
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 b1=(Button)findViewById(R.id.button);
 b2=(Button)findViewById(R.id.button2);
 b3=(Button)findViewById(R.id.button3);
 b4=(Button)findViewById(R.id.button4);
 b5=(Button)findViewById(R.id.button5);
 b6=(Button)findViewById(R.id.button6);
 b7=(Button)findViewById(R.id.button7);
 b8=(Button)findViewById(R.id.button8);
 b9=(Button)findViewById(R.id.button9);
 b10=(Button)findViewById(R.id.button10);
 b11=(Button)findViewById(R.id.button11);
 b12=(Button)findViewById(R.id.button12);
 b13=(Button)findViewById(R.id.button13);
 b14=(Button)findViewById(R.id.button14);
 b15=(Button)findViewById(R.id.button15);
 b16=(Button)findViewById(R.id.button16);
 b17=(Button)findViewById(R.id.button17); 
 b18=(Button)findViewById(R.id.button18);
 b19=(Button)findViewById(R.id.button19);
 b20=(Button)findViewById(R.id.button20);
 b21=(Button)findViewById(R.id.button21);
 b22=(Button)findViewById(R.id.button22);
 b23=(Button)findViewById(R.id.button23);
 b24=(Button)findViewById(R.id.button24);
 b26=(Button)findViewById(R.id.button26);
 b27=(Button)findViewById(R.id.button27);
 b28=(Button)findViewById(R.id.button28);
 num=(EditText)findViewById(R.id.editText);
 disp=(EditText)findViewById(R.id.editText3);
 b1.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v)
 {
    num.setText(num.getText()+"1");
 }
 }
 );
 b2.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v)
 {
 num.setText(num.getText()+"2");
 }
 }
 );
 b3.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v)
 {
 num.setText(num.getText()+"3");
 }
 }
 );
 b4.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v)
 {
 num.setText(num.getText()+"4");
 }
 }
 );
 b5.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v)
 {
 num.setText(num.getText()+"5");
 }
 }
 );
 b6.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v)
 {
 num.setText(num.getText()+"6"); 
 }
 }
 );
 b7.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v)
 {
 num.setText(num.getText()+"7");
 }
 }
 );
 b8.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v)
 {
 num.setText(num.getText()+"8");
 }
 }
 );
 b9.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v)
 {
 num.setText(num.getText()+"9");
 }
 }
 );
 b10.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v)
 {
 num.setText(num.getText()+"0");
 }
 }
 );
 b11.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v)
 {
 if(num==null)
 num.setText("");
 else {
 disp.setText(num.getText()+"+");
 num1 = Float.parseFloat(num.getText() + "");
 num.setText("");
 add = true;
 }
 }
 }
 );
 b14.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v)
 {
 if(num==null)
 num.setText("");
 else {
 disp.setText(num.getText()+"/");
 num1 = Float.parseFloat(num.getText() + "");
 num.setText("");
 div = true; 
 }
 }
 }
 );
 b12.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v)
 {
 if(num==null)
 num.setText("");
 else {
 disp.setText(num.getText()+"-");
 num1 = Float.parseFloat(num.getText() + "");
 num.setText("");
 sub = true;
 }
 }
 }
 );
 b13.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v)
 {
 if(num==null)
 num.setText("");
 else {
 disp.setText(num.getText()+"*");
 num1 = Float.parseFloat(num.getText() + "");
 num.setText("");
 mul = true;
 }
 }
 }
 );
 b15.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v)
 {
 if(num==null)
 num.setText("");
 else {
 disp.setText(disp.getText());
 disp.append(num.getText()+"=");
 num2 = Float.parseFloat(num.getText() + "");
 num.setText("");
 if(add==true) {
 disp.append(num1 + num2 + "");
 num.append(num1 + num2 + "");
 add = false;
 }
 if(sub==true) {
 disp.append(num1 - num2 + "");
 num.append(num1 - num2 + "");
 sub = false;
 }
 if(mul==true) {
 disp.append(num1 * num2 + "");
 num.append(num1 * num2 + "");
 mul = false;
 }
 if(div==true) { 
 disp.append(num1 / num2 + "");
 num.append(num1 / num2 + "");
 div = false;
 }
 if(power==true) {
 disp.append(Math.pow(num1,num2) + "");
 num.append(Math.pow(num1,num2) + "");
 power = false;
 }
 }
 }
 }
 );
 b16.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v)
 {
 num.setText("");
 disp.setText("");
 }
 });
 b17.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v) {
 if(num==null)
 num.setText("");
 else {
 disp.setText("sin("+num.getText()+")");
 num1 = Float.parseFloat(num.getText() + "");
 //num.setText(sin(Math.toRadians(num1))+"");
 disp.append("="+sin(Math.toRadians(num1))+"");
 //sine = true;
 }
 }
 }
 );
 b18.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v) {
 if(num==null)
 num.setText("");
 else {
 disp.setText("cos("+num.getText()+")");
 num1 = Float.parseFloat(num.getText() + "");
 //num.setText(sin(Math.toRadians(num1))+"");

disp.append("="+Math.cos(Math.toRadians(num1))+"");
 //cosine = true;
 }
 }
 }
 ); 
 b19.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v) {
 if(num==null)
 num.setText("");
 else {
 disp.setText("tan("+num.getText()+")");
 num1 = Float.parseFloat(num.getText() + "");
 //num.setText(sin(Math.toRadians(num1))+"");

disp.append("="+Math.tan(Math.toRadians(num1))+"");
 //cosine = true;
 }
 }
 }
 );
 b20.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v) {
 if(num==null)
 num.setText("");
 else {
 disp.setText("sqrt("+num.getText()+")");
 num1 = Float.parseFloat(num.getText() + "");
 disp.append("="+sqrt((num1))+"");
 }
 }
 }
 );
 b21.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v) {
 if(num==null)
 num.setText("");
 else {
 disp.setText(num.getText()+"^");
 num1 = Float.parseFloat(num.getText() + "");
 num.setText("");
 power=true;
 }
 }
 }
 );
 b22.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v) {
 if(num==null)
 num.setText("");
 else { 
 disp.setText("log("+num.getText()+")");
 num1 = Float.parseFloat(num.getText() + "");
 disp.append("="+log10((num1))+"");
 }
 }
 }
 );
 b23.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v) {
 if(num==null)
 num.setText("");
 else {
 disp.setText("ln("+num.getText()+")");
 num1 = Float.parseFloat(num.getText() + "");
 disp.append("="+log((num1))+"");
 }
 }
 }
 );
 b24.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v)
 {
 if(num==null)
 num.setText("");
 else {
 disp.setText(num.getText()
+"*"+num.getText());
 num1 = Float.parseFloat(num.getText() + "");
 disp.append("="+num1*num1);
 }
 }
 }
 );
 b26.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View v)
 {
 try {
 FileOutputStream fOut=new FileOutputStream(newfile,true);
 OutputStreamWriter out=new OutputStreamWriter(fOut);
 out.append(disp.getText());
 out.append("\n");
 out.close();
 fOut.close();
 Toast.makeText(getBaseContext(),"Saved in file",
Toast.LENGTH_SHORT).show(); 
 } catch (FileNotFoundException e) {
 e.printStackTrace();
 } catch (IOException e) {
 e.printStackTrace();
 }
 }
 });
 b27.setOnClickListener(new View.OnClickListener(){
 public void onClick(View v) {
 try {
 FileInputStream fin=new FileInputStream(newfile);
 BufferedReader br=new BufferedReader(new InputStreamReader(fin));
 String data="";
 String buffer="";
 while((data=br.readLine())!=null){
 buffer+=data+"\n";
 }
 Toast.makeText(getBaseContext(),buffer, Toast.LENGTH_LONG).show();
 //disp.setText(buffer);
 br.close();
 } catch (FileNotFoundException e) {
 e.printStackTrace();
 } catch (IOException e) {
 e.printStackTrace();
 }
 }
 });
 b28.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 newfile.delete();
 Toast.makeText(getBaseContext(),"History cleared",
Toast.LENGTH_SHORT).show();
 }
 });
 }
}
