package TugasPertemuan3;

public class StrukturList {
    Node HEAD;
    public void addTail (double data) 
    {
            Node newNode = new Node(data);
            if (HEAD==null) 
            {
                    HEAD = newNode;
            }
            else
            {
                    Node posNode = null;
                    Node curNode = HEAD;
                    while (curNode != null)
                    {
                            posNode = curNode;
                            curNode = curNode.getNext();
                    }
                    posNode.setNext(newNode);
      }
}


    public void addHead(double data) {
            Node newNode = new Node(data);
            if (HEAD==null) {
                    HEAD = newNode;
            }
            else {
                    newNode.setNext(HEAD);
                    HEAD = newNode;
            }
    }


   
public void addMid(double data, int position) {
	
Node posNode = null,curNode;
int i;

Node newNode = new Node(data);
if (HEAD == null) {
	HEAD = newNode; 
    	} else {
    		curNode = HEAD;
    		 if (position == 1) {
    			newNode.next = curNode;
    			HEAD = newNode;
    		 }	else {
    			i =1;
    			 while(curNode != null && i < position ) {
    				 posNode = curNode;
    				 curNode = curNode.next;
    				 i++;
    			 }
    			posNode.next =newNode;
    			newNode.next = curNode;
    		}
    	}
    }
   	
    	
    
    
    
    public void displayElement() {
            Node curNode = HEAD;
            while (curNode != null) {
                    System.out.print(curNode.getData()+ "  ");
                    curNode = curNode.getNext();
            }
    }



}

