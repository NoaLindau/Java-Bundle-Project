
public class ListNode implements Comparable<Integer> {

	Object data;
	ListNode nextNode;
	

	public ListNode(Object o){
		this(o,null);
	}
	public ListNode(Object o,ListNode node){
		data=o;
		nextNode=node;
	}
	public Object getObject(){
		return data;
	}
	public ListNode getNext(){
		return nextNode;
	}
	public void setNext(ListNode ln){
		nextNode = ln;
	}

	public void show(){
		ListNode trackingNode = this;
		while(trackingNode != null){
			System.out.println("showing - "+trackingNode.data.toString());
			trackingNode = trackingNode.nextNode;
		}
	}
	public void showRev(){
		ListNode trackingNode = this;
		int strIndex = 0;
		while(trackingNode != null){
			strIndex++;
			trackingNode = trackingNode.nextNode;
		}
		String[] str = new String[strIndex];
		trackingNode = this;
		int index = 0;
		while(trackingNode != null){
			str[index] = "showing - "+trackingNode.data.toString();
			index++;
			trackingNode = trackingNode.nextNode;
		}
		for(int i = strIndex - 1; i >= 0;i = i - 1){
			System.out.println(str[i]);
		}

	}
	public int compareTo(Integer o){

		return ((int) data) - o;
	}
}