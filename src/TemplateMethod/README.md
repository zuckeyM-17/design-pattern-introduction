# Template Methodパターン

## 役割一覧

- AbstractClass => 抽象
- ConcreteClass => 具象

## メモ

- スーパークラスで処理の枠組みを定め、サブクラスでその具体的内容を定める
- ロジックの共通化
	- スーパークラスの `display()`のようなメソッドを使うことでロジックを共通化できる
- サブクラスをスーパークラスと同一視する
	- スーパークラス型の変数にサブクラス型のインスタンスを代入して使う。
	- The Liskov Sbustitution Principleという
- サブクラスがそのメソッドを実装することを期待する
	- subclass responsibility
	- 抽象クラスで処理の流れを作る
	- サブクラスとスーパークラスは強調し合う

## 関連するパターン

- FactoryMethod 
	- Template Methodをインスタンス生成に応用
- Strategy
	- Templateは継承、Strategyは委譲

## 練習問題

### 3-1
https://docs.oracle.com/javase/jp/7/api/
サブクラスを定義する必要のあるアプリケーションは、必ず入力の次のバイトを返すメソッドを提供しなければなりません。
abstract int	read()
入力ストリームからデータの次のバイトを読み込みます。

### 3-2
finalの意味
これ以上overrideされない

### 3-3
publicではなく、protectedをつける

### 3-4
インターフェースには、display()のような共通ロジックを書くことができないため。

