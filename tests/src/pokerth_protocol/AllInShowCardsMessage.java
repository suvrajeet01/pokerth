
package pokerth_protocol;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.*;
import org.bn.annotations.*;
import org.bn.annotations.constraints.*;
import org.bn.coders.*;
import org.bn.types.*;




    @ASN1PreparedElement
    @ASN1BoxedType ( name = "AllInShowCardsMessage" )
    public class AllInShowCardsMessage implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "AllInShowCardsMessage" , isSet = false )
       public static class AllInShowCardsMessageSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "gameId", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private NonZeroId gameId = null;
                
  
@ASN1SequenceOf( name = "playersAllIn", isSetOf = false ) 

    @ASN1ValueRangeConstraint ( 
		
		min = 1L, 
		
		max = 10L 
		
	   )
	   
        @ASN1Element ( name = "playersAllIn", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private java.util.Collection<PlayerAllIn>  playersAllIn = null;
                
  
        
        public NonZeroId getGameId () {
            return this.gameId;
        }

        

        public void setGameId (NonZeroId value) {
            this.gameId = value;
        }
        
  
        
        public java.util.Collection<PlayerAllIn>  getPlayersAllIn () {
            return this.playersAllIn;
        }

        

        public void setPlayersAllIn (java.util.Collection<PlayerAllIn>  value) {
            this.playersAllIn = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_AllInShowCardsMessageSequenceType;
        }

       private static IASN1PreparedElementData preparedData_AllInShowCardsMessageSequenceType = CoderFactory.getInstance().newPreparedElementData(AllInShowCardsMessageSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "AllInShowCardsMessage", isOptional =  false , hasTag =  true, tag = 31, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private AllInShowCardsMessageSequenceType  value;        

        
        
        public AllInShowCardsMessage () {
        }
        
        
        
        public void setValue(AllInShowCardsMessageSequenceType value) {
            this.value = value;
        }
        
        
        
        public AllInShowCardsMessageSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(AllInShowCardsMessage.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            