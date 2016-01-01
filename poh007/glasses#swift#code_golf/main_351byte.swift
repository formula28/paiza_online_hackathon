/**
POH vol.7 「めがね」ゲットチャレンジ.
2次元配列パターンマッチ.
探索部分短縮.
コードゴルフ 0.012sec 351byte.
*/
let N=Int(readLine()!)!
var q=[String]()
for i in 1...N{q+=(readLine()!.characters.split{$0==" "}.map(String.init))}
let M=Int(readLine()!)!
for i in 1...M{q+=(readLine()!.characters.split{$0==" "}.map(String.init))}
var i=0,k=0
for ;i<N*N&&k<M*M;i+=(i%N==N-M ?M:1) {for k=0;k<M*M&&q[i+k/M*N+k%M] == q[k+N*N];k++ {}}
i--
print("\(i/N) \(i%N)")
