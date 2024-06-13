package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostSystemResourceInfo;
import com.vmware.vim25.ResourceConfigSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSystemResourceInfo", propOrder = {"key", "config", "child"})
public class HostSystemResourceInfo extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  protected ResourceConfigSpec config;
  
  protected List<HostSystemResourceInfo> child;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public ResourceConfigSpec getConfig() {
    return this.config;
  }
  
  public void setConfig(ResourceConfigSpec paramResourceConfigSpec) {
    this.config = paramResourceConfigSpec;
  }
  
  public List<HostSystemResourceInfo> getChild() {
    if (this.child == null)
      this.child = new ArrayList<>(); 
    return this.child;
  }
}
