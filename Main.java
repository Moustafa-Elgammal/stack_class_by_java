package com.company;
class stack{
    private int max; // the maximum size to set in the stack array
    private int top; // the stack pointer
    private int [] array; // empty dynamic allocation array. /run time size

    /**
     *  this method used to prepair the
     * stack array maximum length
     * @param maximum
     */
    public void initStack(int maximum){
        this.max = maximum;
        this.initStack(); //sub method
        this.top = 0;
    }

    /**
     * sub method for the exact initialize the
     * stack array
     */
    private void initStack(){
        this.array = new int[this.max];
    }

    /**
     *p push method to add new element
     * @param elementValue
     * @return FALSE if there is no place
     */
    public boolean push(int elementValue){
        if(this.top != (this.max)) {
            this.array[this.top] = elementValue;
            System.out.println("Element "+elementValue+" has been pushed :). in "+this.top);
            this.top +=1;
            return true;
        }
        System.out.println("Sorry Stack Over Flow :(!, can't add "+ elementValue);
        return false;
    }

    /**
     *  pop the last element pushed
     *  if founded
     * @return true when it succeeded
     */
    public Boolean pop(){
        if (this.top == 0) {
            System.out.println("The stack is empty :( !");
            return false;
        }
        this.top -=1;
        System.out.println("Poped Element is: "+this.array[this.top]);
        return true;
    }

    /**
     * print the last element added
     * @return true when it on
     */
    public boolean front() {
        if (this.top != 0){
            System.out.println("Front element is: " + this.array[this.top - 1] + " in " + this.top);
            return true;
        }
        System.out.println("The stack is empty, There is no front element");
        return false;
    }

    /**
     * print the stack elements
     */
    public void  printStack() {
        if(this.top !=0) {
            int countDown = this.top; //init
            System.out.print("Stack elements: ");
            while (countDown > 0) { // check if it reach the first pushed
                System.out.print(this.array[this.top - countDown]+" ");
                countDown--;
            }
            System.out.println();
            return;
        }

        System.out.println("EMPTY.....");

    }
}
public class Main {

    public static void main(String[] args) {

        stack me = new stack(); // create new object from the stack class

        me.initStack(3); //init the stack array size

        me.push(10);
        me.printStack();
        me.push(20);
        me.push(30);
        me.push(40);
        me.printStack();
        me.push(50);
        me.push(60);
        me.pop();
        me.front();
        me.push(70);
        me.push(80);
        me.printStack();
        me.pop();
        me.pop();
        me.pop();
        me.front();
        me.printStack();



    }

}
