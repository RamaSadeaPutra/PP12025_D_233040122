package TugasPertemuan3;

public class StrukturListTest {

	  public static void main(String[] args) {
		  
          StrukturList list = new StrukturList();
          list.addTail(4.5);
          list.addMid(3.4,1);
          list.addHead(2.1);
          
          StrukturList list2 = new StrukturList();
          list2.addTail(4.5);
          list2.addTail(5.5);
          list2.addMid(1.1,1);
          list2.addMid(2.1,1);
          list2.addHead(3.4);
        

   
         
          System.out.print("Elemen: ");
          list.displayElement();
          System.out.println();      
          System.out.print("Elemen: ");
          list2.displayElement();
          
	  }	
	
}
