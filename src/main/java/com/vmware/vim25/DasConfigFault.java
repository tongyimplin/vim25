package com.vmware.vim25;

import com.vmware.vim25.DasConfigFault;
import com.vmware.vim25.Event;
import com.vmware.vim25.VimFault;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DasConfigFault", propOrder = {"reason", "output", "event"})
public class DasConfigFault extends VimFault {
  protected String reason;
  
  protected String output;
  
  protected List<Event> event;
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
  
  public String getOutput() {
    return this.output;
  }
  
  public void setOutput(String paramString) {
    this.output = paramString;
  }
  
  public List<Event> getEvent() {
    if (this.event == null)
      this.event = new ArrayList<>(); 
    return this.event;
  }
}
