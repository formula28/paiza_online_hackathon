/**
POH vol.7 「めがね」ゲットチャレンジ.
2次元配列パターンマッチ.
インプットを上手く圧縮.
コードゴルフ 0.01sec 182byte.
*/
var i=0,j=0,n=0,m=0,p=[UInt8](),
r={readLine()!},
R={m=Int(r())!;i=m;for;0<i;--i{p+=r().utf8+[0]}};
R();n=m;R();
for;j<m*m;{if(p[2*(i+j/m*n+j%m)]^p[2*(n*n+j++)]>0){i++;j=0}};
print(i/n,i%n)
