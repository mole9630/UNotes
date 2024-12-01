#include<iostream>
using namespace std;
#define MVNum 100

typedef struct{
	char vexs[MVNum];
	int arcs[MVNum][MVNum];
	int vexnum,arcnum;
}AMGraph;

int Location(AMGraph G,char v1){
	int i;
	for(i=0;i<G.vexnum;i++){
		if(G.vexs[i]==v1)
			return i;
	}
}

void CreateUDG(AMGraph &G){
	cout<<"�������ܶ��������ܱ���"<<endl;
	cin>>G.vexnum>>G.arcnum;
	int i,j,k;
	char v1,v2;
	cout<<"��������������Ϣ"<<endl;
	for(i=0;i<G.vexnum;i++){//��������Ϣ
		cin>>G.vexs[i];
	}
	for(i=0;i<G.vexnum;i++){//��ʼ���ڽӾ���
		for(j=0;j<G.vexnum;j++){
			G.arcs[i][j]=0;
		}
	}
	for(k=0;k<G.arcnum;k++){
		cout<<"������һ���������Ķ���"<<endl;
		cin>>v1>>v2;
		i=Location(G,v1);
		j=Location(G,v2);
		G.arcs[i][j]=1;
	}
}

bool visited[MVNum];

void DFS_AM(AMGraph G,int v){
	cout<<G.vexs[v]<<" ";
	visited[v]=true;
	for(int w=0;w<G.vexnum;w++){
		if((G.arcs[v][w]!=0)&&(!visited[w]))
			DFS_AM(G,w);
	}
}

int main(){
	AMGraph G;
	CreateUDG(G);
	int v;
	for(v=0;v<G.vexnum;v++)
		visited[v]=false;
	char a;
	cout<<"�����뿪ʼ����"<<endl;
	cin>>a;
	int i=Location(G,a);
	DFS_AM(G,i);
	cout<<endl;
	return 0;
}
