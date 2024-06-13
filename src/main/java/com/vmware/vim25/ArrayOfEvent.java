package com.vmware.vim25;

import com.vmware.vim25.ArrayOfEvent;
import com.vmware.vim25.Event;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEvent", propOrder = {"event"})
public class ArrayOfEvent {
  @XmlElement(name = "Event")
  protected List<Event> event;
  
  public List<Event> getEvent() {
    if (this.event == null)
      this.event = new ArrayList<>(); 
    return this.event;
  }
}
