# Adapterパターン
すでに提供されているものと必要なもののズレを埋めるようなもの
wrapperパターンと呼ばれることもある

## 2種類の実装

- クラスによるAdapterパターン（継承）
- インスタンスによるAdapterパターン（委譲）

## 役割一覧
 
- Target: 必要なインターフェースを定めているもの
- Client: Adapterを使うもの(Main)
- Adaptee: すでに用意されているがTargetとはインターフェースが異なるもの
- Adapter: Adapteeを使いTargetのインターフェースを満たすようにするもの

## その他重要だと思ったところメモ
- インターフェースでプログラミングする
	- Mainクラスでは、PrintBannerのインスタンスをPrintインターフェース型の変数に代入する
	- あくまでPrintというインターフェースを使ってプログラミングしているということになる
- Javaは単一継承


## Adapterパターンに関連するパターン

- Visitorパターン
- Compositeパターン
- FactroyMethodパターン