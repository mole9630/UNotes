#include<iostream>
using namespace std;
#define MVNum 100

typedef struct ArcNode {
    int adjvex;
    struct ArcNode *nextarc;
} ArcNode;

typedef struct VNode {
    char data;
    ArcNode *firstarc;
} VNode;

typedef struct {
    struct VNode vertices[MVNum];
    int vexnum, arcnum;
} ALGraph;

int LocateVex(ALGraph &G, char vex) {
    for (int i = 0; i < G.vexnum; i++) {
        if (G.vertices[i].data == vex)
            return i;
    }
    return -1;
}

void CreateUDG(ALGraph &G) {
    cout << "输入图的总顶点数，总边数：";
    cin >> G.vexnum >> G.arcnum;
    int i, k, j;
    cout << "输入顶点信息：";
    for (i = 0; i < G.vexnum; i++) {
        cin >> G.vertices[i].data;
        G.vertices[i].firstarc = NULL;
    }
    char v1, v2;
    for (k = 0; k < G.arcnum; k++) {
        cout << "输入边依附的两个顶点：";
        cin >> v1 >> v2;
        i = LocateVex(G, v1);
        j = LocateVex(G, v2);
        ArcNode *p1 = new ArcNode;
        p1->adjvex = j;
        p1->nextarc = G.vertices[i].firstarc;
        G.vertices[i].firstarc = p1;
    }
}

bool visited[MVNum];

void DFS_AL(ALGraph G, int v) {
    cout << G.vertices[v].data << " ";
    visited[v] = true;
    ArcNode *p = G.vertices[v].firstarc;
    while (p != NULL) {
        char w = p->adjvex;
        if (!visited[w])
            DFS_AL(G, w);
        p = p->nextarc;
    }
}

int main() {
    ALGraph G;
    CreateUDG(G);
    for (int v = 0; v < G.vexnum; v++)
        visited[v] = false;
    char a;
    cout << "输入开始顶点：";
    cin >> a;
    int i = LocateVex(G, a);
    DFS_AL(G, i);
    return 0;
}
