package problem03;

public class MyStack {
	
	private String[] buffer;
	private int idx = -1;
	private String[] backup;

	public MyStack( int size ) {
		buffer = new String[size];
	}
	
	public void push(String item) {
		if(buffer.length==(idx+1)) {
			backup = buffer;
			buffer = new String[buffer.length+1];
			for(int i=0; i<backup.length; i++) {
				buffer[i] = backup[i];
			}
		}
		idx++;
		buffer[idx] = item;
	}

	public String pop() {
		String result = "";
		if(idx==-1) return null;
		result = buffer[idx];
		buffer[idx]=null;
		idx--;
		return result;
	}

	public boolean isEmpty() {
		if(idx==-1)return true;
		return false;
	}
	
	public int size() {
		return idx;
	}
}