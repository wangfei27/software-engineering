
#include<bits/stdc++.h> //C++万能头文件<bits/stdc++.h>用不了的，改用<iostream>
#include<unistd.h>
using namespace std;

int main()
{
   sleep (3);
   cout << "欢迎来到数字自动排序程序" << endl;
   sleep (2);
   cout << "请在看到提示后先后输入5个数字，由于int函数的取值范围有限，数字取值范围应在-999999999至999999999之间，数字请勿重复" << endl;
   sleep (2);

   int a;
   cout << "输入数字a：" ;
   cin >> a;
   if (a<-999999999||a>999999999)
   {
       cout << "输入的字符有误或字符大小不在int函数的正确取值范围内" << endl;
       cout << "程序终止！" << endl;
       return 0;
   }

   int b;
   cout << "输入数字b：" ;
   cin >> b;
   if (b<-999999999||b>999999999)
   {
       cout << "输入的字符有误或字符大小不在int函数的正确取值范围内" << endl;
       cout << "程序终止！" << endl;
       return 0;
   }

   int c;
   cout << "输入数字c：" ;
   cin >> c;
   if (c<-999999999||c>999999999)
   {
       cout << "输入的字符有误或字符大小不在int函数的正确取值范围内" << endl;
       cout << "程序终止！" << endl;
       return 0;
   }

   int d;
   cout << "输入数字d：" ;
   cin >> d;
   if (d<-999999999||d>999999999)
   {
       cout << "输入的字符有误或字符大小不在int函数的正确取值范围内" << endl;
       cout << "程序终止！" << endl;
       return 0;
   }

   int e;
   cout << "输入数字e：" ;
   cin >> e;
   if (e<-999999999||e>999999999)
   {
       cout << "输入的字符有误或字符大小不在int函数的正确取值范围内" << endl;
       cout << "程序终止！" << endl;
       return 0;
   }

   cout << "程序正在工作，请耐心等待" << endl;
   for (int h=-999999999;h<=999999999;h++)
   {
       if (h==a||h==b||h==c||h==d||h==e)
       {
           cout << h << endl;
       }
   }
   cout << "程序工作完成！" << endl;
   return 0;
} 
