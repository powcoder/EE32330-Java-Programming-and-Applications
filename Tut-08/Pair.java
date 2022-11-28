https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
// DO NOT modify this class.
// No need to upload this file.

public class Pair<S, T>
{
    private S first;
    private T second;
    
    public Pair(S n1, T n2)
    {
        first = n1;
        second = n2;
    }
    
    public S getFirst()
    {
        return first;
    }
    
    public T getSecond()
    {
        return second;
    }    
    
    public void setFirst(S v)
    {
        first = v;
    }
    
    public void setSecond(T v)
    {
        second = v;
    }
    
    @Override
    public String toString()
    {
        return first + "\t" + second;
    }
}
