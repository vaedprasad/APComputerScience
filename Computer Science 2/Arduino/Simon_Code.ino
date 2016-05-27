
/* Author: Vaed Prasad and Evan Dickenstein
 * Date Written: 8 May 2014
 */

#define NOTE_BO 31
#define NOTE_C1 33

const int red = 4;
const int yellow = 2;
/* This identifies the two LEDs that will be used in the project*/
const int kPinSpeaker = 5;
/* This identifies the Piezo that will be used in the project*/
void setup() {
  pinMode(red, OUTPUT);
   pinMode(yellow, OUTPUT);
  pinMode(kPinSpeaker, OUTPUT);
}

int quarterNOTE = 500;/* This identifies the two LEDs that will be used in the project*/

void loop() {

  digitalWrite(red, HIGH);
  delay(1000);
  tone(kPinSpeaker, NOTE_BO, 1000);
  delay (1000);
  digitalWrite(red, LOW);
  delay(1000);

  digitalWrite(yellow, HIGH);
  delay(1000);
  tone(kPinSpeaker, NOTE_C1, 1000);
  delay (1000);
  digitalWrite(yellow, LOW);
  delay(1000);

  }


