
/* Author: Vaed Prasad and Evan Dickenstein
 * Date Written: 20 May 2014
 * Stage 4
 */

#define NOTE_E4 330
#define NOTE_C4 262
#define NOTE_B0 31


const int kLedYellow = 2;
const int kLedRed = 4;
/* This identifies the two LEDs that will be used in the project*/
const int kpinPiezo=5;
/* This identifies the Piezo that will be used in the project*/
/* This identifies the 2 Buttons that will be used in the project*/
const int kButtonYellow = 13;
const int kButtonRed = 12;
const int MaxLength=5;

int song [] = {
  NOTE_C4, NOTE_C4, NOTE_E4, NOTE_C4,NOTE_E4};
  
int SongLength=1; /* keeps track of the song*/

int quarterNOTE = 500;/* This identifies the length of each quarter note.  In this case it is 1/2 a second*/

boolean done = false;

void setup() {
  pinMode(kButtonYellow, INPUT);
  digitalWrite(kButtonYellow, HIGH);
  pinMode(kButtonRed, INPUT);
  digitalWrite(kButtonRed, HIGH);

  pinMode(kLedRed, OUTPUT);
  pinMode(kLedYellow, OUTPUT);
  pinMode(kpinPiezo, OUTPUT);

}
void loop() 
{
  if (!done)
  {
  for(int i=0; i<SongLength; i++)
  { 
    if(song [i]==NOTE_C4)
    {
      digitalWrite(kLedYellow, HIGH);
      tone(kpinPiezo, NOTE_C4, 500);
      delay(1000);
      digitalWrite(kLedYellow, LOW); 

    }
    else
    {
      digitalWrite(kLedRed, HIGH);
      tone(kpinPiezo, NOTE_E4, 500);
      delay (1000);
      digitalWrite(kLedRed, LOW); 
    }
  }
  //Play back by user
int expectedNote = 0;

while (true)
{
  //checks to see if the top button is pressed to activate the yellow LED with tone
  if (digitalRead (kButtonYellow) == LOW)
  {
    if (song [expectedNote] == NOTE_C4)
    {
      digitalWrite(kLedYellow, HIGH);
      tone(kpinPiezo, NOTE_C4, 500); // play C for a second
      delay(1000);
      digitalWrite(kLedYellow, LOW);
      expectedNote++;
    }
    else // error sound
    {
      tone(kpinPiezo, NOTE_B0, 1000);
      delay(1000);
      break;
    }
  }
  
  //checks to see if the bottom button is pressed to activate the red LED with tone
  if (digitalRead (kButtonRed) == LOW)
  {
    if (song[expectedNote] == NOTE_E4)
    {
      //red blink with different note
      digitalWrite(kLedRed, HIGH);
      tone(kpinPiezo, NOTE_E4, 500);
      delay(1000);
      digitalWrite(kLedRed, LOW);
      expectedNote++;
      
    }
    else // error sound
    {
      tone(kpinPiezo, NOTE_B0, 1000);
      delay(1000);
      break;
    }
  }
  
  //done so end
  if (expectedNote == SongLength)
  {
    SongLength++; // make song longer
    break;
  }
  delay(20); // short delay so human can catch up
}

if (SongLength > MaxLength){
  done = true; // end and do nothing else
}
}
}
