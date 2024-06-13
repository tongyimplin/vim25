package com.vmware.vim25;

import com.vmware.vim25.ArrayOfEventArgDesc;
import com.vmware.vim25.EventArgDesc;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEventArgDesc", propOrder = {"eventArgDesc"})
public class ArrayOfEventArgDesc {
  @XmlElement(name = "EventArgDesc")
  protected List<EventArgDesc> eventArgDesc;
  
  public List<EventArgDesc> getEventArgDesc() {
    if (this.eventArgDesc == null)
      this.eventArgDesc = new ArrayList<>(); 
    return this.eventArgDesc;
  }
}
