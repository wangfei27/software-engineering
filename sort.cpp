
#include<bits/stdc++.h> //C++����ͷ�ļ�<bits/stdc++.h>�ò��˵ģ�����<iostream>
#include<unistd.h>
using namespace std;

int main()
{
   sleep (3);
   cout << "��ӭ���������Զ��������" << endl;
   sleep (2);
   cout << "���ڿ�����ʾ���Ⱥ�����5�����֣�����int������ȡֵ��Χ���ޣ�����ȡֵ��ΧӦ��-999999999��999999999֮�䣬���������ظ�" << endl;
   sleep (2);

   int a;
   cout << "��������a��" ;
   cin >> a;
   if (a<-999999999||a>999999999)
   {
       cout << "������ַ�������ַ���С����int��������ȷȡֵ��Χ��" << endl;
       cout << "������ֹ��" << endl;
       return 0;
   }

   int b;
   cout << "��������b��" ;
   cin >> b;
   if (b<-999999999||b>999999999)
   {
       cout << "������ַ�������ַ���С����int��������ȷȡֵ��Χ��" << endl;
       cout << "������ֹ��" << endl;
       return 0;
   }

   int c;
   cout << "��������c��" ;
   cin >> c;
   if (c<-999999999||c>999999999)
   {
       cout << "������ַ�������ַ���С����int��������ȷȡֵ��Χ��" << endl;
       cout << "������ֹ��" << endl;
       return 0;
   }

   int d;
   cout << "��������d��" ;
   cin >> d;
   if (d<-999999999||d>999999999)
   {
       cout << "������ַ�������ַ���С����int��������ȷȡֵ��Χ��" << endl;
       cout << "������ֹ��" << endl;
       return 0;
   }

   int e;
   cout << "��������e��" ;
   cin >> e;
   if (e<-999999999||e>999999999)
   {
       cout << "������ַ�������ַ���С����int��������ȷȡֵ��Χ��" << endl;
       cout << "������ֹ��" << endl;
       return 0;
   }

   cout << "�������ڹ����������ĵȴ�" << endl;
   for (int h=-999999999;h<=999999999;h++)
   {
       if (h==a||h==b||h==c||h==d||h==e)
       {
           cout << h << endl;
       }
   }
   cout << "��������ɣ�" << endl;
   return 0;
} 
