package com.vmware.vim25;

import com.vmware.vim25.ArrayOfEventDescriptionEventDetail;
import com.vmware.vim25.EventDescriptionEventDetail;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEventDescriptionEventDetail", propOrder = {"eventDescriptionEventDetail"})
public class ArrayOfEventDescriptionEventDetail {
  @XmlElement(name = "EventDescriptionEventDetail")
  protected List<EventDescriptionEventDetail> eventDescriptionEventDetail;
  
  public List<EventDescriptionEventDetail> getEventDescriptionEventDetail() {
    if (this.eventDescriptionEventDetail == null)
      this.eventDescriptionEventDetail = new ArrayList<>(); 
    return this.eventDescriptionEventDetail;
  }
}
