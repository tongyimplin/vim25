package com.vmware.vim25;

import com.vmware.vim25.Event;
import com.vmware.vim25.ExtendedEvent;
import com.vmware.vim25.GeneralEvent;
import com.vmware.vim25.GeneralHostErrorEvent;
import com.vmware.vim25.GeneralHostInfoEvent;
import com.vmware.vim25.GeneralHostWarningEvent;
import com.vmware.vim25.GeneralUserEvent;
import com.vmware.vim25.GeneralVmErrorEvent;
import com.vmware.vim25.GeneralVmInfoEvent;
import com.vmware.vim25.GeneralVmWarningEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralEvent", propOrder = {"message"})
@XmlSeeAlso({ExtendedEvent.class, GeneralHostInfoEvent.class, GeneralVmErrorEvent.class, GeneralUserEvent.class, GeneralVmWarningEvent.class, GeneralHostWarningEvent.class, GeneralHostErrorEvent.class, GeneralVmInfoEvent.class})
public class GeneralEvent extends Event {
  @XmlElement(required = true)
  protected String message;
  
  public String getMessage() {
    return this.message;
  }
  
  public void setMessage(String paramString) {
    this.message = paramString;
  }
}
