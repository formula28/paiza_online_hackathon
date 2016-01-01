/**
POH vol.7 「めがね」ゲットチャレンジ.
2次元配列パターンマッチ.
素朴なコード(First Accept).
コードゴルフ 0.012sec 444byte.
*/
let N=Int(readLine()!)!
var q=[String](),p=[String]()
for i in 1...N {q+=(readLine()!.characters.split{$0==" "}.map(String.init))}
let M=Int(readLine()!)!
for i in 1...M {p+=(readLine()!.characters.split{$0==" "}.map(String.init))}
var f=false
var i=0,k=0
for i=0;i<N*N; {
    for k=0;k<M*M;k++ {
        if q[i+k/M*N+k%M] != p[k] {break}
    }
    if k==M*M {break}
    if i%N==N-M {i+=M}
    else {i++}
}
print("\(i/N) \(i%N)")
