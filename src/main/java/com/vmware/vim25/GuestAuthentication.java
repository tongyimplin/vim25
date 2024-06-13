package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestAuthentication;
import com.vmware.vim25.NamePasswordAuthentication;
import com.vmware.vim25.SAMLTokenAuthentication;
import com.vmware.vim25.SSPIAuthentication;
import com.vmware.vim25.TicketedSessionAuthentication;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestAuthentication", propOrder = {"interactiveSession"})
@XmlSeeAlso({NamePasswordAuthentication.class, SSPIAuthentication.class, SAMLTokenAuthentication.class, TicketedSessionAuthentication.class})
public class GuestAuthentication extends DynamicData {
  protected boolean interactiveSession;
  
  public boolean isInteractiveSession() {
    return this.interactiveSession;
  }
  
  public void setInteractiveSession(boolean paramBoolean) {
    this.interactiveSession = paramBoolean;
  }
}
