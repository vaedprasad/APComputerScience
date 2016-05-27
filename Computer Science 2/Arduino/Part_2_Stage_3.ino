
/* Author: Vaed Prasad and Evan Dickenstein
 * Date Written: 8 May 2014
 */

#define NOTE_E4 330
#define NOTE_C4 262

const int red = 4;
const int yellow = 2;
/* This identifies the two LEDs that will be used in the project*/
const int kPinSpeaker = 5;
/* This identifies the Piezo that will be used in the project*/
/* This identifies the 2 Buttons that will be used in the project*/
const int MaxLength=5;
int SongLength=1; /* keeps track of the song*/
int scale [] = {
  NOTE_C4, NOTE_C4, NOTE_E4, NOTE_C4,NOTE_E4};
int quarterNOTE = 500;/* This identifies the length of each quarter note.  In this case it is 1/2 a second*/

void setup() {
  pinMode(red, OUTPUT);
  pinMode(yellow, OUTPUT);
  pinMode(kPinSpeaker, OUTPUT);

}

void loop() 
{
for(int note=0; note<SongLength; note++)
{ 
  if(scale [note]==NOTE_C4);
  digitalWrite(yellow, HIGH);
  tone(kPinSpeaker, scale [note], 500);
  delay(quarterNOTE*1.0);
  digitalWrite(yellow, LOW); 
  delay (1000);

}
else
{
  digitalWrite(red, HIGH);
  tone(kPinSpeaker, scale [note], 500);
  delay(quarterNOTE*1.0);
  digitalWrite(red, LOW); 
  delay (1000);
}
}
SongLength ++;
if (SongLength)
{
  SongLength=1;
}
delay (2000)






