/**
POH vol.7 「めがね」ゲットチャレンジ.
2次元配列パターンマッチ.
インプット部分closure化.
コードゴルフ 0.012sec 228byte.
*/
var q=[String](),j=0,k=0,N=0,M=0,
F={M=Int(readLine()!)!;for i in 1...M{q+=readLine()!.characters.split(" ").map{String($0)}}};
F();N=M;F();
for ;k<M*M;j++ {for k=0;k<M*M&&q[j+k/M*N+k%M]==q[k+N*N];k++ {}};
j--;
print("\(j/N) \(j%N)")
