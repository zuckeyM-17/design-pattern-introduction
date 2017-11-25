# Iteratorパターン

## 役割一覧

- Iterator
- ConcreteIterator
- Aggregate
- ConcreteAggregate

## その他重要だと思ったところメモ
- Iteratorパターンを取る理由
	- Aggregateの内部実装が変わってもwhileループでループを回すことができる
- 抽象クラスやインターフェースを使ってプログラミングするという考えを頭の隅においておく
- AggregateとIteratorは対になっている = IteratorがAggregateの内部実装を知っている
- next()はreturnCurrentElementAndAdvancToNextPosition()と同様のことをやっているので間違いやすい
	- hasNext()は次にnext()を読んでも大丈夫かどうかを調べるものと覚える 
	- ConcreteIteratorは一つのConcreteAggregateに対して複数作ることができる
- Iteratorは色々種類がある
	- 最後から逆方向へ進む
	- 順方向にも逆方向にも進む
	- 番号を指定してジャンプする


## Iteratorパターンに関連するパターン

- Visitorパターン
- Compositeパターン
- FactroyMethodパターン