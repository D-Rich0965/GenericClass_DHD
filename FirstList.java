
public class FirstList<T>
{    

	private final int DEFAULT_SIZE=10;
       	private int currentItem=0;
       	private T arList[];
  	@SuppressWarnings("unchecked")
    	public FirstList()
    	{        
		// arList=new T[DEFAULT_SIZE];   //causes a compile error                                        				   		// because T is cast to object                                        				  	 // later if we cast object to whatever T is,
				   // say a string,
                                                                    	    	// we have a runtime error                                        				 		 // We could use a java collection like ArrayList for this.                                                                                             		
		arList=(T[]) new Object[DEFAULT_SIZE];
          	  } 

	  @SuppressWarnings("unchecked")
	    public FirstList(int length)
	    {
		       // arList=new T[length]; //causes a compile error
		       arList=(T[]) new Object[length];
}	  
	  public void addItem(T item) {
	        if (currentItem >= this.size()) {
	            System.out.println("list is full");
	            return;
	        }
	        arList[currentItem] = item;
	        currentItem++;
	    }

	    public T getItem(int index){

	        if(index >= this.size()){
	            System.out.println("List index out of bounds "+index+" for size "+this.size());
	            return null;
	        }

	        return arList[index];
	    }

	    public int size(){
	        return arList.length;
	    }
	}

