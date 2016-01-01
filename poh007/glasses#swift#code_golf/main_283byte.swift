/**
POH vol.7 「めがね」ゲットチャレンジ.
2次元配列パターンマッチ.
インプット部分短縮.
コードゴルフ 0.012sec 283byte.
*/
var q=[String](),j=0,k=0,A=[0,0]
for ;k<2;k++ {A[k]=Int(readLine()!)!;for i in 1...A[k]{q+=(readLine()!+" ").characters.map{String($0)}}}
let N=A[0],M=A[1]
for ;j<N*N&&k<M*M;j+=(j%N==N-M ?M:1) {for k=0;k<M*M&&q[2*(j+k/M*N+k%M)] == q[2*(k+N*N)];k++ {}}
j--
print("\(j/N) \(j%N)")
