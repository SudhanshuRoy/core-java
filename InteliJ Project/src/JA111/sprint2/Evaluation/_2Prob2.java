
/*
What do you understand by “Java Strings are immutable”.
 Explain the advantages and disadvantages of immutability of Strings.

        Ans:

        Java Strings are immutable means you can neither recreate nor remove from the memory.
        Because whenever you create any string in string pool using string literals before
        creating it will search in the whole memory area of string pool
         if this content already exists in pool area your new variable is start pointing to
          that string only it will  not create duplicate content.
          If content is not present in the string pool  then only it will create a new content.
        If you are reassigning one variable i.e, Your variable is pointing to one content now if you reassign
        it will start pointing to another content of string now but your previous
        string is not deleted it is also inside the memory.

        Advantages:
        1.It will minimize the conflict because you can’t delete.
        2. It saves a lot of memory because it never allows duplicates of content.

        Disadvantages:
        1. You have to create a lot of variables to manage immutability
         for every new content you have to create new variables
        2. If you reassign variables again and again you may get conflicts.
*/



package JA111.sprint2.Evaluation;

public class _2Prob2 {
    public static void main(String[] args) {
String s1="Raja";
String s=s1+"Ram";
        System.out.println(s);
    }
}
