
public class List implements MinMax<Integer> {

    private ListNode firstNode;
    private ListNode lastNode;
    private String name;


    public List() {
        this("list");
    }

    public List(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    public void insertAtFront(Object insertItem) {
        if (isEmpty())
            firstNode = lastNode = new ListNode(insertItem);
        else
            firstNode = new ListNode(insertItem, firstNode);
    }

    public void insertAtBack(Object insertItem) {
        if (isEmpty())
            firstNode = lastNode = new ListNode(insertItem);
        else
            lastNode = lastNode.nextNode = new ListNode(insertItem);
    }

    public Object removeFromFront() throws EmptyListException {
        if (isEmpty())
            throw new EmptyListException(name);
        Object removedItem = firstNode.data;

        if (firstNode == lastNode)
            firstNode = lastNode = null;
        else
            firstNode = firstNode.nextNode;
        return removedItem;
    }

    public Object removeFromBack() throws EmptyListException {
        if (isEmpty())
            throw new EmptyListException(name);

        Object removedItem = lastNode.data;
        if (firstNode == lastNode)
            firstNode = lastNode = null;
        else {
            ListNode current = firstNode;

            while (current.nextNode != lastNode)
                current = current.nextNode;

            lastNode = current;
            current.nextNode = null;
        }
        return removedItem;
    }

    public Object removeAt(int k) throws ListIndexOutOfBound {
        Object obj = null;
        if (0 > k) {
            throw new ListIndexOutOfBound("Error");
        }
        ListNode currentNode = firstNode;
        int index = 0;
        boolean done = false;
        while (currentNode != null) {
            if (index == k) {
                done = true;
                obj = currentNode.getObject();
                currentNode.setNext(currentNode.getNext().getNext());
            }
            currentNode = currentNode.getNext();
            if (done) {
                currentNode = null;
            }
            index++;
        }
        if (done) {
            return obj;
        }
        throw new ListIndexOutOfBound("No index called..");
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    public String toString() {
        String returnedString = "(";
        ListNode currentNode = firstNode;
        while (currentNode != null) {
            returnedString += currentNode.getObject().toString() + ",";
            currentNode = currentNode.getNext();
        }
        if (returnedString != "(") {
            returnedString = returnedString.substring(0, returnedString.length() - 1);
        }
        returnedString += ")";
        return returnedString;
    }

    public void show() {
        if (firstNode == null)
            return;
        else
            firstNode.show();
    }

    public void showRev() {
        if (firstNode == null)
            return;
        else
            firstNode.showRev();
    }

    public void addAt(int k, Object insert) throws ListIndexOutOfBound {
        if (0 > k) {
            throw new ListIndexOutOfBound("Error");
        }
        ListNode currentNode = firstNode;
        int index = 0;
        while (currentNode != null) {
            if (index == k) {
                ListNode newNode = new ListNode(insert);
                newNode.setNext(currentNode.getNext());
                currentNode.setNext(newNode);
                return;
            }
            currentNode = currentNode.getNext();
            index++;
        }
        throw new ListIndexOutOfBound("No index called..");
    }

    public Object[] toArray() {
        ListNode currentNode = firstNode;
        int index = 0;
        while (currentNode != null) {
            index++;
            currentNode = currentNode.getNext();
        }
        Object[] objects = new Object[index];
        index = 0;
        currentNode = firstNode;
        while (currentNode != null) {
            objects[index] = currentNode.getObject();
            index++;
            currentNode = currentNode.getNext();
        }
        return objects;
    }

    public Integer min() {
        ListNode minValue = firstNode;
        ListNode currentNode = firstNode;
        while (currentNode != null) {

            if (currentNode.compareTo((int) minValue.data) < 0) {
                minValue = currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return (int) minValue.data;
    }

    public Integer max() {
        ListNode minValue = firstNode;
        ListNode currentNode = firstNode;
        while (currentNode != null) {

            if (currentNode.compareTo((int) minValue.data) > 0) {
                minValue = currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return (int) minValue.data;
    }
}


