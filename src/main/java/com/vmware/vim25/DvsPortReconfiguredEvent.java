package com.vmware.vim25;

import com.vmware.vim25.ChangesInfoEventArgument;
import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.DvsPortReconfiguredEvent;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsPortReconfiguredEvent", propOrder = {"portKey", "configChanges"})
public class DvsPortReconfiguredEvent extends DvsEvent {
  @XmlElement(required = true)
  protected List<String> portKey;
  
  protected List<ChangesInfoEventArgument> configChanges;
  
  public List<String> getPortKey() {
    if (this.portKey == null)
      this.portKey = new ArrayList<>(); 
    return this.portKey;
  }
  
  public List<ChangesInfoEventArgument> getConfigChanges() {
    if (this.configChanges == null)
      this.configChanges = new ArrayList<>(); 
    return this.configChanges;
  }
}
