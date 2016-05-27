/**
 *
 * Example playing a C major scale WITH arrays
 *
 * April 2014
 * For CS1
 */
#define NOTE_BO 31
#define NOTE_C1 33
#define NOTE_CS1 35
#define NOTE_A1 55
#define NOTE_F3 175
#define NOTE_A7 3520
#define NOTE_FS4 370
#define NOTE_FS4 370
#define NOTE_G4 392
#define NOTE_GS4 415
#define NOTE_A4 440
#define NOTE_AS4 466
#define NOTE_B4 494
#define NOTE_C5 523  /* Notes we are defining
                      */

const int kPinSpeaker = 5;

int scale [] = {
  NOTE_BO, NOTE_C1, NOTE_CS1, NOTE_A1, NOTE_F3, NOTE_A7, NOTE_B4, NOTE_C5};
  /* Order of notes
  */
void setup ()
{
  pinMode(kPinSpeaker, OUTPUT);
}

int quarterNOTE = 500;
void loop ()
{
  for (int note=0; note < 8; note ++)
  {
    tone(kPinSpeaker, scale[note], 500);
    delay(quarterNOTE * 1.3);
  }
  
  delay(2000); // wait 2 seconds before repeating
}
