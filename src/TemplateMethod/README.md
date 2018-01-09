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
	
