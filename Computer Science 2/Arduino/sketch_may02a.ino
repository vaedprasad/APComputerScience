/**

  Play tones
  
  
 **/
 
   #define NOTE_C4  262
   
   const int kSpeaker = 5; // adjust the pin if different from circuit
   
   
   void setup ()
   {
     pinMode (kSpeaker, OUTPUT);
   }
   
   void loop ()
   {
       tone (kSpeaker, NOTE_C4, 1000);
       delay(1000 * 1.3);
       /**
       Now You -- play a song or a scale, explore
       */
   }
