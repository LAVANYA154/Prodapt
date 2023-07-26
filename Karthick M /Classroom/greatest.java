
class demo{
public static void main(string args[]){
int a=4,b=5,c=3,d=8,e=7;
int f=great(a,b);
int g=great(c,d);
int h=great(f,g);
int num=great(h,e);
System.out.println(num);
}

int great(int x,int y){
if(x<y){
return y;
}
else
return x;
}
}

