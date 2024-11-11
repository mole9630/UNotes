#include<iostream>
using namespace std;

struct Student {
	char sno[10];
	char sname[15];
	double chinese;
	double mathematics;
	double englist;
};

int main() {
	int sNum; // 学生数量
	cout<<"输入学生数量:";
	cin>>sNum;
	struct Student stu[sNum];
	
	// 输入学生信息
	for(int i=0; i<sNum; i++){
		cin>>stu[i].sno>>stu[i].sname>>stu[i].chinese>>stu[i].mathematics>>stu[i].englist;
	}
	
	// 输出学生成绩平均数
	for(int i=0; i<sNum; i++){
		int avg; // 平均数
		avg = (stu[i].chinese + stu[i].mathematics + stu[i].englist) / 3;
		cout<<"学号: " << stu[i].sno << " | 姓名: " << stu[i].sname << " | 平均成绩: "<< avg << endl;
	}
}
