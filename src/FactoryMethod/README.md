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
- もし外の製品、工場の組み合わせを実装しようとしても、frameworkのパッケージは変更する必要はない
- サブクラスで実装してほしいメソッドをスーパークラスでメソッドを定義しておく
	- 抽象メソッド
	- デフォルト実装（Productクラスを抽象クラスにできない）
	- 実装してデフォルトを使うとエラーにする
- どのパターンを使っているか、開発者間で共有する
- インターフェースの相互関係

## 関連するパターン
- TemplateMethod
	- 応用している
- Sigleton
	- Creator役はSingletonで作ることが多い（本章のパターンは違う）
- Iterator
	- Iteratorインスタンスを作るときにFactoryMethodを使うことが多い
	
## 練習問題

### 4-1

IDCardクラスのコンストラクタにpublicがついていない理由
idcardパッケージ以外ではnewすることができない

### 4-2

カードに通し番号をつけ、IDCardFactoryクラスが通し番号と所持者の対応表を持つように修正

https://github.com/zuckeyM-17/design-pattern-introduction/commit/0e6e25623afbd6186846244dd9b6eab7fa7a7496

### 4-3

コンストラクタに製品の名前を引数として与えることを強制しようとしたらエラーになった
```java
public abstract class Product {
	public abstract Product(String name); // Javaではコンストラクタは抽象メソッドにできない。
	public abstract void use();
}
```