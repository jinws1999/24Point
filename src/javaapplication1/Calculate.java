
package javaapplication1;
import java.util.*;
public class Calculate {
public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  System.out.println("WRITE first number");
    float a =s.nextFloat();
  s=new Scanner(System.in);
  System.out.println("WRITE second number");
   float b =s.nextFloat();
  s=new Scanner(System.in);
  System.out.println("WRITE third number");
  float  c =s.nextFloat();
  s=new Scanner(System.in);
  System.out.println("WRITE fourth number");
  float  d =s.nextFloat();
	System.out.println(a+" "+b+" "+c+" "+d);
  int first=1,second=1,third=1,stop=0,num=0;
  float x=0,y=0,z=0,m=0,n=0,answer=0;
  List<Integer>set;
    set = new ArrayList<>();
  while(stop==0){
   if(first==1){x=a+b;
               y=c;
               z=d;               
           }     
if(first==2){x=a+c;
               y=b;
               z=d; 
}
    if(first==3){x=a+d;
               y=b;
               z=c; }
    if(first==4){x=b+c;
               y=a;
               z=d; }
    if(first==5){x=b+d;
               y=a;
               z=c; }
    if(first==6){x=c+d;
               y=a;
               z=b; }
    if(first==7){x=a-b;
               y=c;
               z=d; }
    if(first==8){x=b-a;
               y=c;
               z=d; }
    if(first==9){x=a-c;
               y=b;
               z=d; }
    if(first==10){x=c-a;
               y=b;
               z=d; }
if(first==11){x=a-d;
               y=b;
               z=c; }
    if(first==12){x=d-a;
               y=b;
               z=c; }
    if(first==13){x=b-c;
               y=a;
               z=d; }
    if(first==14){x=c-b;
               y=a;
               z=d; }
    if(first==15){x=b-d;
               y=a;
               z=c; }
    if(first==16){x=d-b;
               y=a;
               z=c; }
    if(first==17){x=c-d;
               y=a;
               z=b; }
    if(first==18){x=d-c;
               y=b;
               z=a; }
    if(first==19){x=a*b;
               y=c;
               z=d; } 
    if(first==20){x=a*c;
               y=b;
               z=d; }
    if(first==21){x=a*d;
               y=b;
               z=c; }
    if(first==22){x=b*c;
               y=a;
               z=d; }
    if(first==23){x=b*d;
               y=a;
                 z=c;}
    if(first==24){x=c*d;
               y=a;
               z=b; }
    if(first==25){x=a/b;
               y=c;
               z=d; }
    if(first==26){x=b/a;
               y=c;
               z=d; }
    if(first==27){x=a/c;
               y=b;
               z=d; }
    if(first==28){x=c/a;
               y=b;
               z=d; }
    if(first==29){x=a/d;
               y=b;
               z=c; }
    if(first==30){x=d/a;
               y=b;
               z=c; }
if(first==31){x=b/c;
               y=a;
               z=d; }
    if(first==32){x=c/b;
               y=a;
               z=d; }
    if(first==33){x=b/d;
               y=a;
               z=c; }
    if(first==34){x=d/b;
               y=a;
               z=c; }
    if(first==35){x=c/d;
               y=a;
               z=b; }
    if(first==36){x=d/c;
               y=b;
               z=a; }    
    if(second==1){m=x+y;
               n=z;  } 
     if(second==2){m=x+z;
               n=y;  } 
     if(second==3){m=y+z;
               n=x;  } 
     if(second==4){m=x-y;
               n=z;  } 
     if(second==5){m=y-x;
               n=z;  } 
if(second==6){m=x-z;
               n=y;  } 
     if(second==7){m=z-x;
               n=y;  } 
     if(second==8){m=y-z;
               n=x;  } 
     if(second==9){m=z-y;
               n=x;  } 
    if(second==10){m=x*y;
               n=z;  } 
     if(second==11){m=x*z;
               n=y;  } 
     if(second==12){m=y*z;
               n=x;  } 
     if(second==13){m=x/y;
               n=z;  } 
     if(second==14){m=y/x;
               n=z;  } 
     if(second==15){m=x/z;
               n=y;  } 
if(second==16){m=z/x;
               n=y;  } 
     if(second==17){m=y/z;
               n=x;  } 
     if(second==18){m=z/y;
               n=x;  }
    if(third==1){answer=m+n; }
    if(third==2){answer=m-n; }
    if(third==3){answer=n-m; }
    if(third==4){answer=m*n; }
    if(third==5){answer=m/n; }
    if(third==6){answer=n/m; }
    if(answer==24){set.add(num,first);
                   set.add(num+1,second);
                   set.add(num+2,third);
      num+=3;
    }   
if(third==6){
      if(second==18){
        if(first==36){stop+=1;}
        else{first+=1; second=1;third=1;}
      }
      else{second+=1;third=1;}}
    else{third+=1;}}
  for(int i=0;i<num;i+=3){
   first=set.get(i);second=set.get(i+1);third=set.get(i+2);
    if(first==1){x=a+b;
               y=c;
               z=d; } 
    if(first==2){x=a+c;
               y=b;
               z=d; }
    if(first==3){x=a+d;
               y=b;
               z=c; }
    if(first==4){x=b+c;
               y=a;
               z=d; }
    if(first==5){x=b+d;
               y=a;
               z=c; }
 if(first==6){x=c+d;
               y=a;
               z=b; }
    if(first==7){x=a-b;
               y=c;
               z=d; }
    if(first==8){x=b-a;
               y=c;
               z=d; }
    if(first==9){x=a-c;
               y=b;
               z=d; }
    if(first==10){x=c-a;
               y=b;
               z=d; }
if(first==11){x=a-d;
               y=b;
               z=c; }
    if(first==12){x=d-a;
               y=b;
               z=c; }
    if(first==13){x=b-c;
               y=a;
               z=d; }
    if(first==14){x=c-b;
               y=a;
               z=d; }
    if(first==15){x=b-d;
               y=a;
               z=c; }
    if(first==16){x=d-b;
               y=a;
               z=c; }
    if(first==17){x=c-d;
               y=a;
               z=b; }
    if(first==18){x=d-c;
               y=b;
               z=a; }
    if(first==19){x=a*b;
               y=c;
               z=d; } 
    if(first==20){x=a*c;
               y=b;
               z=d; }
    if(first==21){x=a*d;
               y=b;
               z=c; }
    if(first==22){x=b*c;
               y=a;
               z=d; }
    if(first==23){x=b*d;
               y=a;
                 z=c;}
    if(first==24){x=c*d;
               y=a;
               z=b; }
    if(first==25){x=a/b;
               y=c;
               z=d; }
    if(first==26){x=b/a;
               y=c;
               z=d; }
    if(first==27){x=a/c;
               y=b;
               z=d; }
    if(first==28){x=c/a;
               y=b;
               z=d; }
    if(first==29){x=a/d;
               y=b;
               z=c; }
    if(first==30){x=d/a;
               y=b;
               z=c; }
if(first==31){x=b/c;
               y=a;
               z=d; }
    if(first==32){x=c/b;
               y=a;
               z=d; }
    if(first==33){x=b/d;
               y=a;
               z=c; }
    if(first==34){x=d/b;
               y=a;
               z=c; }
    if(first==35){x=c/d;
               y=a;
               z=b; }
    if(first==36){x=d/c;
               y=b;
               z=a; }
    if(second==1){m=x+y;
               n=z;  } 
     if(second==2){m=x+z;
               n=y;  } 
     if(second==3){m=y+z;
               n=x;  } 
     if(second==4){m=x-y;
               n=z;  } 
     if(second==5){m=y-x;
               n=z;  } 
if(second==6){m=x-z;
               n=y;  } 
     if(second==7){m=z-x;
               n=y;  } 
     if(second==8){m=y-z;
               n=x;  } 
     if(second==9){m=z-y;
               n=x;  } 
    if(second==10){m=x*y;
               n=z;  } 
     if(second==11){m=x*z;
               n=y;  } 
     if(second==12){m=y*z;
               n=x;  } 
     if(second==13){m=x/y;
               n=z;  } 
     if(second==14){m=y/x;
               n=z;  } 
     if(second==15){m=x/z;
               n=y;  } 
if(second==16){m=z/x;
               n=y;  } 
     if(second==17){m=y/z;
               n=x;  } 
     if(second==18){m=z/y;
               n=x;  }
   if(first==1){System.out.println(a+"+"+b+"="+(a+b));}
    if(first==2){System.out.println(a+"+"+c+"="+(a+c));}
    if(first==3){System.out.println(a+"+"+d+"="+(a+d));}
    if(first==4){System.out.println(b+"+"+c+"="+(b+c));}
    if(first==5){System.out.println(b+"+"+d+"="+(b+d));}
    if(first==6){System.out.println(c+"+"+d+"="+(c+d));}
    if(first==7){System.out.println(a+"-"+b+"="+(a-b));}
    if(first==8){System.out.println(b+"-"+a+"="+(b-a));}
    if(first==9){System.out.println(a+"-"+c+"="+(a-c));}
    if(first==10){System.out.println(c+"-"+a+"="+(c-a));}
    if(first==11){System.out.println(a+"-"+d+"="+(a-d));}
    if(first==12){System.out.println(d+"-"+a+"="+(d-a));}
    if(first==13){System.out.println(b+"-"+c+"="+(b-c));}
    if(first==14){System.out.println(c+"-"+b+"="+(c-b));}
    if(first==15){System.out.println(b+"-"+d+"="+(b-d));}
    if(first==16){System.out.println(d+"-"+b+"="+(d-b));}
    if(first==17){System.out.println(c+"-"+d+"="+(c-d));} 
    if(first==18){System.out.println(d+"-"+c+"="+(d-c));}
    if(first==19){System.out.println(a+"*"+b+"="+(a*b));}
    if(first==20){System.out.println(a+"*"+c+"="+(a*c));}
    if(first==21){System.out.println(a+"*"+d+"="+(a*d));}
    if(first==22){System.out.println(b+"*"+c+"="+(b*c));}
    if(first==23){System.out.println(b+"*"+d+"="+(b*d));}
    if(first==24){System.out.println(c+"*"+d+"="+(c*d));}
    if(first==25){System.out.println(a+"/"+b+"="+(a/b));}
    if(first==26){System.out.println(b+"/"+a+"="+(b/a));}
    if(first==27){System.out.println(a+"/"+c+"="+(a/c));}
    if(first==28){System.out.println(c+"/"+a+"="+(c/a));}
    if(first==29){System.out.println(a+"/"+d+"="+(a/d));}
    if(first==30){System.out.println(d+"/"+a+"="+(d/a));}
    if(first==31){System.out.println(b+"/"+c+"="+(b/c));}
    if(first==32){System.out.println(c+"/"+b+"="+(c/b));}
    if(first==33){System.out.println(b+"/"+d+"="+(b/d));}
    if(first==34){System.out.println(d+"/"+b+"="+(d/b));}
    if(first==35){System.out.println(c+"/"+d+"="+(c/d));}
    if(first==36){System.out.println(d+"/"+c+"="+(d/c));}
    if(second==1){System.out.println(x+"+"+y+"="+(x+y));}
    if(second==2){System.out.println(x+"+"+z+"="+(x+z));}
    if(second==3){System.out.println(y+"+"+z+"="+(y+z));}
    if(second==4){System.out.println(x+"-"+y+"="+(x-y));}
    if(second==5){System.out.println(y+"-"+x+"="+(y-x));}
    if(second==6){System.out.println(x+"-"+z+"="+(x-z));}
    if(second==7){System.out.println(z+"-"+x+"="+(z-x));}
    if(second==8){System.out.println(y+"-"+z+"="+(y-z));}
    if(second==9){System.out.println(z+"-"+y+"="+(z-y));}
    if(second==10){System.out.println(x+"*"+y+"="+(x*y));}
    if(second==11){System.out.println(x+"*"+z+"="+(x*z));}
    if(second==12){System.out.println(y+"*"+z+"="+(y*z));}
    if(second==13){System.out.println(x+"/"+y+"="+(x/y));}
    if(second==14){System.out.println(y+"/"+x+"="+(y/x));}
    if(second==15){System.out.println(x+"/"+z+"="+(x/z));}
    if(second==16){System.out.println(z+"/"+x+"="+(z/x));}
    if(second==17){System.out.println(y+"/"+z+"="+(y/z));}
    if(second==18){System.out.println(z+"/"+y+"="+(z/y));}
    if(third==1){System.out.println(m+"+"+n+"="+(m+n));}
    if(third==2){System.out.println(m+"-"+n+"="+(m-n));}
    if(third==3){System.out.println(n+"-"+m+"="+(n-m));}
    if(third==4){System.out.println(m+"*"+n+"="+(m*n));}
    if(third==5){System.out.println(m+"/"+n+"="+(m/n));}
    if(third==6){System.out.println(n+"/"+m+"="+(n/m));}
System.out.println();
  }
  System.out.println("end");


}
}
