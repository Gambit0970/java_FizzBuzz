package gamePackage;

public class Multiple implements MultipleI {
    private int num;
    public int getNum() {
        return this.num;
    }
    public void setNum(int val){
        this.num = val;
    }
    public void incNum() {
        this.num++;
    }
    public boolean multipleOf3(){
        return this.num%3==0;
    }
    public boolean multipleOf5(){
        return this.num%5==0;
    }
    public boolean multipleOf3And5(){
        return multipleOf3() && multipleOf5();
    }
    public String getMult(){
        if (multipleOf3And5()){
            return "FizzBuzz";
        }
        else if (multipleOf3()){
            return "Fizz";
        }
        else if (multipleOf5()){
            return "Buzz";
        }
        else {
            return Integer.toString(this.num);
        }
    }
}
