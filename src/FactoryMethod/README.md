# Factory Methodパターン

## 役割一覧

- Product
	- Factoryによって生成されるインスタンスのインターフェースを定める抽象クラス
- Creator
	- Productを生成する抽象クラス  
- ConcreateCreator
	- 具体的な製品を作る工程 
- ConcreteProduct
	- 具体的な製品

## メモ

- TemplateMethodをインスタンスの生成に適用
- newによる実際のインスタンス生成をインスタンス生成のためのメソッド呼び出しに変える
	- 具体的なクラス名に夜束縛からスーパークラスを解放

## 関連するパターン


## 練習問題

### 4-1