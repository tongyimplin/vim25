package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ElementDescription;
import com.vmware.vim25.EnumDescription;
import com.vmware.vim25.EventDescription;
import com.vmware.vim25.EventDescriptionEventDetail;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventDescription", propOrder = {"category", "eventInfo", "enumeratedTypes"})
public class EventDescription extends DynamicData {
  @XmlElement(required = true)
  protected List<ElementDescription> category;
  
  @XmlElement(required = true)
  protected List<EventDescriptionEventDetail> eventInfo;
  
  protected List<EnumDescription> enumeratedTypes;
  
  public List<ElementDescription> getCategory() {
    if (this.category == null)
      this.category = new ArrayList<>(); 
    return this.category;
  }
  
  public List<EventDescriptionEventDetail> getEventInfo() {
    if (this.eventInfo == null)
      this.eventInfo = new ArrayList<>(); 
    return this.eventInfo;
  }
  
  public List<EnumDescription> getEnumeratedTypes() {
    if (this.enumeratedTypes == null)
      this.enumeratedTypes = new ArrayList<>(); 
    return this.enumeratedTypes;
  }
}
