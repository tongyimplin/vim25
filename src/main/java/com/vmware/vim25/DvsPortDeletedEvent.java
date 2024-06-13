package com.vmware.vim25;

import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.DvsPortDeletedEvent;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsPortDeletedEvent", propOrder = {"portKey"})
public class DvsPortDeletedEvent extends DvsEvent {
  @XmlElement(required = true)
  protected List<String> portKey;
  
  public List<String> getPortKey() {
    if (this.portKey == null)
      this.portKey = new ArrayList<>(); 
    return this.portKey;
  }
}
