package reservation;

import java.awt.Choice;

public class ChoiceHour extends Choice{

	ChoiceHour(){
        //‚Ì”ÍˆÍ‚Ì‰Šú’l‚Í 9-21‚Æ‚·‚é
        resetRange(9,21);
    }
    public void resetRange( int start, int end){
        // ”ÍˆÍ‚ÉŠÜ‚Ü‚ê‚é‚Ì”‚ğ‹‚ß‚é
        int number = end - start +1;
        
        removeAll();
        
        while (start<=end){
            String h = String.valueOf(start);
            //ˆêŒ…‚Ìê‡,‘O‚É0‚ğ•t‚¯‚é
            if ( h.length()==1){
                h = "0" + h;
            }
            add(h);
            // start‚ğ1‘‚â‚·
            start++;
        }
    }
    // ÅŒã‚Éİ’è‚³‚ê‚Ä‚¢‚é‚ğ•Ô‚·
    public String getLast(){
        return getItem( getItemCount()-1 );
    }
}
