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
	cout<<"请输入总顶点数、总边数"<<endl;
	cin>>G.vexnum>>G.arcnum;
	int i,j,k;
	char v1,v2;
	cout<<"请依次输入点的信息"<<endl;
	for(i=0;i<G.vexnum;i++){//输入点的信息
		cin>>G.vexs[i];
	}
	for(i=0;i<G.vexnum;i++){//初始化邻接矩阵
		for(j=0;j<G.vexnum;j++){
			G.arcs[i][j]=0;
		}
	}
	for(k=0;k<G.arcnum;k++){
		cout<<"请输入一条边依附的顶点"<<endl;
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
	cout<<"请输入开始顶点"<<endl;
	cin>>a;
	int i=Location(G,a);
	DFS_AM(G,i);
	cout<<endl;
	return 0;
}
