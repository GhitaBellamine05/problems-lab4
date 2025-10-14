package problem2;

public class IntegerList
{
    int[] list;                 //values in the list
    int numberOfElements;   // current number of integers in the list
    int size;               // size of the list

    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        this.size = size;
        this.numberOfElements = 0;  // the list is not initiliazed yet, all elemnts are 0s
    }
    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
        numberOfElements = size;
    }
    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    //-------------------------------------------------------
    // increaseSize method
    //-------------------------------------------------------
    public void increaseSize(){
        int[] doubledSizeList = new int[size*2];
        for (int i = 0; i< size; i++){
            doubledSizeList[i] = list[i];
        }
        this.list =  doubledSizeList;
        this.size = doubledSizeList.length;
    }
    //-------------------------------------------------------
    // add Element to the integer list
    //-------------------------------------------------------
    void addElement(int value){
        // check first if the list is already full or not
        if (numberOfElements == size){
            increaseSize();
        }
        list[numberOfElements] = value;
        numberOfElements++;
    }
    //-------------------------------------------------------
    // remove first occurence of an element from the integer list
    //-------------------------------------------------------
    void removeFirst(int value){
        for(int i =0;i<numberOfElements;i++){
            if(list[i]== value){
                // shift to left
                for (int j = i; j<numberOfElements;j++){
                    list[j] = list[j+1];
                }
                numberOfElements--;
            }
            break;
        }
    }
    //-------------------------------------------------------
    // Remove all the occurences of an element from the integer list
    //-------------------------------------------------------
    void removeAll(int value){
        for(int i =0;i<numberOfElements;i++){
            if(list[i]== value){
                // shift to left
                for (int j = i; j<numberOfElements;j++){
                    list[j] = list[j+1];
                }
                numberOfElements--;
                i--; // here we must stay at current index to check the new shifted element
            }

        }
    }
}