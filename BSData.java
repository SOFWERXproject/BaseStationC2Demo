/**
 * Container for all data being sent to/from the base stations
 **/
 
public class BSData implements Serializable {
    
    /* data fields (will include get()/set() for each) */
    String source; // message origin; phone ID or base station
    Enum type;     // identifies if this is a command, type of alert, etc.
    String additionalNotes;
    GPSDataType gpsCoord;    // type TBD
    TimeStamp time;          // type TBD
    ImageDataType imageFile; // type TBD
    SoundDataType audioFile; // type TBD
    VideoDataType videoFile; // type TBD
 
    // ... what other fields might we possibly need???????
    
    /* serializer methods
     *   if all of the above field are serializable, then we get these for "free" from the Serializable interface,
     *   otherwise we'll need to manually implement them.
     */
    public final void writeObject(Object obj) throws IOException;
    public final Object readObject() throws IOException, ClassNotFoundException;
    
}
