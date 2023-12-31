package kodlamaio.northwind.core.utilities.results;

public abstract class DataResult<T> extends Result {

	private T data;
	public DataResult(T data,boolean success,String messsage) {
		super(success,messsage);
		this.data= data;
	}
	
	public DataResult(T data,boolean success) {
		super(success);
		this.data= data;
	}
	
	public T getData() {
		return this.data;
	}
}
