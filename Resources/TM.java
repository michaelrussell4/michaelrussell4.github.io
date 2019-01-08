// Turing Machine 
// Version: 1.0 
// ----------------------------------------------------------------- 
// This program simulates a Turing Machine 
// ----------------------------------------------------------------- 

public class TM { 

/* 
* Instance variables 
* 
* Code: state transition function as code 
* StateType: ='H'for halt and 'R' for reject 
* Tape: read/write tape (input string is data) 
* tapePos: tape head position 
* cstate: current state 
*/ 

String[] Code; 
char[] StateType; 
String Tape; 
int tapePos; 
int cstate; 

/* Constructor(s) */ 

// Initialize each of the instance variables 
TM(String[] C, char[] ST) { 
    Code = C; 
    StateType = ST; 
    setState(0); 
    setTape("#"); 
    tapePos = 0; 
} 

/* Methods */ 

int getState() { 
    urn cstate; 
} 

void setState(int x) { 
	cstate = x; 
} 

void setTape(String s) { 
	Tape = s + "#"; 
} 

// ---------------------------------------------------------- 
// This method searches the strings in Code to find if any 
// match the state and current tape character and react 
// according to the matched string, if found 
// 
// Version 1.1 
// ---------------------------------------------------------- 
void stateTransition(char c) { 
    for(int i=0; i<Code.length; i++){ 
        if(Integer.parseInt((""+Code[i].charAt(0)))==cstate && Code[i].charAt(2)==c){ 
            // replace the tapePos char with the new one from rule 
            setTape(Tape.substring(0,tapePos) + Code[i].charAt(5) + Tape.substring(tapePos+1)); 
            // set the tapePos according to directions in code 
            tapePos += Code[i].charAt(7)=='R'? 1:-1; 
            // check if tape head is within bounds of tape 
            if(tapePos<0||tapePos>Tape.length()){ 
                System.out.println("Error. tapePos out of bounds"); 
                break; 
            } 
            // set cstate 
            setState(Integer.parseInt(""+Code[i].charAt(9))); 
            //end for loop 
            return; 
        } 
    } 
    // no paths available -- simulate crash 
    StateType[cstate] = 'r'; 
} 

// ---------------------------------------------------------- 
// This method loops continually through the tape, calling 
// StateTransition to react to each state, giving the current 
// tape character as param 
// 
// Version 1.1 
// ---------------------------------------------------------- 
boolean processData(String s) { 
	// place input string on the tape 
	setTape(s); 
	
	// while in current state of 'R' call state transition 
	while(StateType[cstate] == 'R'){ 
	    stateTransition(Tape.charAt(tapePos)); 
	} 
	
	if(StateType[cstate] == 'H'){ 
        // halts 
        return true; 
    } 
    else { 
        // crashes 
        return false; 
	} 
} 
}