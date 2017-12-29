
package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Random;

@Named(value = "guessNumberBean")
@SessionScoped
public class GuessNumberBean implements Serializable {
    
        private int RANDOMNUMBER = 0;
        private int max = 10;
        private int min = 1;
        private int userguess;
        private String image;
        
        private String response ;
       
    public GuessNumberBean() {
        Random random = new Random();
        RANDOMNUMBER = random.nextInt(max)+1;
        
    }
    
    public String getResponse(){
        if(userguess == RANDOMNUMBER){
            return "You guessed right";
        }
            else if (userguess < RANDOMNUMBER){
                    return "You guessed is to low!";
                    }
            else 
                return "You guessed is to high!";
        
        }
    
    public String getImage(){
        
        if(userguess == RANDOMNUMBER){
            return "resources/img/right.gif";
        }
            else if (userguess < RANDOMNUMBER){
                    return "resources/img/wrong1.gif";
           }
            else 
                return "resources/img/giphy.gif";
        }
    
    public String reset(){
    userguess = 0;
    Random random = new Random();
    RANDOMNUMBER = random.nextInt(max)+1;
    return "index";
    
    }
    
    public String back(){
    userguess = 0;
    Random random = new Random();
    return "index";
    
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getUserguess() {
        return userguess;
    }

    public void setUserguess(int userguess) {
        this.userguess = userguess;
    }

    public int getRANDOMNUMBER() {
        return RANDOMNUMBER;
    }

    public void setResponse(String response) {
        this.response = response;
    }
 }
    


