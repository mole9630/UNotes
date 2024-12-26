#include <iostream>
using namespace std;

struct Element {
	int key;
};

struct SqList {
	Element* r;
	int length;
};

void BubbleSort(SqList &L) {
	int m;
	bool flag;
	Element temp;
	
	m = L.length - 1;
	flag = true;
	
	while((m>0)&&(flag)){
		flag = false;
		for(int i=0;i<=m;i++){
			if(L.r[i].key > L.r[i+1].key){
				flag = true;
				temp = L.r[i];
				L.r[i] = L.r[i+1];
				L.r[i+1] = temp;
			}
		}
		m--;
	}
}

void printData(SqList &L) {
	for(int i=0;i<L.length;i++){
		cout << L.r[i].key << " ";
	}
	cout << endl;
}

int main() {
	SqList L;
	L.length = 8;
	L.r = new Element[L.length];
	
	// 传入数据
	int keys[] = {25, 78, 16, 55, 42, 64, 7, 32};
	for(int i=0;i<=L.length;i++){
		L.r[i].key = keys[i];
	}
	
	cout << "原数据项为：";
	printData(L);
	
	BubbleSort(L);
	
	cout << "排序后数据项为：";
	printData(L);
	
}
