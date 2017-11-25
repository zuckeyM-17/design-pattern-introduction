package Iterator;

public interface Iterator {
	// 次の要素の存在チェック
	public abstract boolean hasNext();
	// 次の要素の取得
	// 内部状態を次に進める
	public abstract Object next();
}
