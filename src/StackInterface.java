public interface StackInterface<T> {

    public void push(T newEntry);
     /* add a new entry to the top of the stack
        @param (T) newEntry - the entry to be added
      */


    public T pop();
    /* remove an entry from the top of the stack
    throw EmptyStackException if called on an empty stack
    @return (T) - the value that was on top of the stack
     */


    public T peek();
    /* return but don't remove the entry on top of the stack
    throw EmptyStackException if called on an empty stack
    @return (T) - the value at the top of the stack
     */

    public boolean isEmpty();
    /* return true if the stack is empty, false otherwise
     */

    public void clear();
    /* remove all entries from the stack
     */

}



