 **
 * Interface on the phone for communication to/from the base station
 */
 
 interface BSClient implements ActionListener {
 
    /* configuration methods */
    void config(InetAddres ip, int port);
    int connect();
    int close();
    boolean isConnected();
    int ping(); // pings base station; returns time in ms
    
    /* send data to base station */
    void sendData(BSData d);
    
    /* receive data from base station */
    
    
 }
