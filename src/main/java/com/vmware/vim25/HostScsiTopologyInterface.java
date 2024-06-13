package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostScsiTopologyInterface;
import com.vmware.vim25.HostScsiTopologyTarget;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostScsiTopologyInterface", propOrder = {"key", "adapter", "target"})
public class HostScsiTopologyInterface extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String adapter;
  
  protected List<HostScsiTopologyTarget> target;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getAdapter() {
    return this.adapter;
  }
  
  public void setAdapter(String paramString) {
    this.adapter = paramString;
  }
  
  public List<HostScsiTopologyTarget> getTarget() {
    if (this.target == null)
      this.target = new ArrayList<>(); 
    return this.target;
  }
}
