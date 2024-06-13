package com.vmware.vim25;

import com.vmware.vim25.GuestAuthentication;
import com.vmware.vim25.GuestAuthenticationChallenge;
import com.vmware.vim25.GuestOperationsFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestAuthenticationChallenge", propOrder = {"serverChallenge", "sessionID"})
public class GuestAuthenticationChallenge extends GuestOperationsFault {
  @XmlElement(required = true)
  protected GuestAuthentication serverChallenge;
  
  protected long sessionID;
  
  public GuestAuthentication getServerChallenge() {
    return this.serverChallenge;
  }
  
  public void setServerChallenge(GuestAuthentication paramGuestAuthentication) {
    this.serverChallenge = paramGuestAuthentication;
  }
  
  public long getSessionID() {
    return this.sessionID;
  }
  
  public void setSessionID(long paramLong) {
    this.sessionID = paramLong;
  }
}
