/**
POH vol.7 「めがね」ゲットチャレンジ.
2次元配列パターンマッチ.
String.utf8の利用.
コードゴルフ 0.01sec 204byte.
*/
var j=0,k=0,N=0,M=0,
R={readLine()!.utf8.filter{$0>32}},
q=R(),p=q,
F={p=R();M=p.count;for i in 1..<M{p+=R()}};
F();R();q=p;N=M;F();
for(;k<M*M;j++){for(k=0;k<M*M&&q[j+k/M*N+k%M]==p[k];k++){}};print(--j/N,j%N)