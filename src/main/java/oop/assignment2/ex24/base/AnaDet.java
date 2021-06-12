package oop.assignment2.ex24.base;
//refactoring is not the same as find+replace. The difference is related to scope.
//renamed throughout that method, not throughout the program
public class AnaDet {
    private String temp;
    private String temp2;

    public boolean isAna(String temp, String temp2){
        this.temp = temp;
        this.temp2 = temp2;

        if(temp.equals(temp2)){
            return true; //why
        }

        else{
            return false;
        }
    }
}
