/**
POH vol.7 「めがね」ゲットチャレンジ.
2次元配列パターンマッチ.
インプットをfilter,mapを使わずに配列化.
コードゴルフ 0.01sec 188byte.
*/
var j=0,k=0,N=0,M=0,R={readLine()!.utf8+[0]},q=R(),p=q,
F={p=R();M=p.count/2;for i in 1..<M{p+=R()}};
F();R();q=p;N=M;F();
for;k<M*M;{if q[2*(j+k/M*N+k%M)]^p[2*k++]>0{j++;k=0}};
print(j/N,j%N)
