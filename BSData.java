/**
 * Container for data being sent to/from the base stations
 **/
 
public class BSData implements Serializable {
    
    /* data fields (will include get()/set() for each) */
    String source; // message origin; phone ID or base station
    Enum type;     // identifies if this is a command, type of alert, etc.
    GPSDataType gpsCoord;
    TimeStamp time;
    String Note; // additional notes
    ImageDataType image;
    Sound??
    
    /* serializer methods */
    public final void writeObject(Object obj) throws IOException;
    public final Object readObject() throws IOException, ClassNotFoundException;
    
}
