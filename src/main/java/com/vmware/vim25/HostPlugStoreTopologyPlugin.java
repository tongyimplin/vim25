package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostPlugStoreTopologyPlugin;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPlugStoreTopologyPlugin", propOrder = {"key", "name", "device", "claimedPath"})
public class HostPlugStoreTopologyPlugin extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String name;
  
  protected List<String> device;
  
  protected List<String> claimedPath;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public List<String> getDevice() {
    if (this.device == null)
      this.device = new ArrayList<>(); 
    return this.device;
  }
  
  public List<String> getClaimedPath() {
    if (this.claimedPath == null)
      this.claimedPath = new ArrayList<>(); 
    return this.claimedPath;
  }
}
