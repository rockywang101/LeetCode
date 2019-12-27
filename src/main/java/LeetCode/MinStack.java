package LeetCode;

/**
 * Stack support getMin
 * 
 * @author rocky
 */
public class MinStack {
    
    Integer[] data;
    Integer min = null;
    int idx = -1;
    
    public MinStack() {
        data = new Integer[100];
    }
    
    public void push(int x) {
        data[++idx] = x;
        
        if (min == null)
            min = x;
        else if (x < min)
            min = x;
    }
    
    public void pop() {
        if (min != null && data[idx].intValue() == min.intValue())
            min = null;
        
        data[idx] = null;
        idx--;
    }
    
    public Integer top() {
        if (idx < 0)
            return null;
        return data[idx];
    }
    
    public Integer getMin() {
        
        if (min != null)
            return min;
        
        if (idx < 0)
            return null;
        
        for (int i=0; i<data.length; i++) {
            Integer item = data[i];
            if (item == null)
                break;
            if (min == null) {
                min = item;
            }
            else if (min > item) {
                min = item;
            }
        }
        
        return min;
    }
}
