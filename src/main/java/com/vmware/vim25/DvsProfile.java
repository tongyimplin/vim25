package com.vmware.vim25;

import com.vmware.vim25.ApplyProfile;
import com.vmware.vim25.DvsProfile;
import com.vmware.vim25.PnicUplinkProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsProfile", propOrder = {"key", "name", "uplink"})
public class DvsProfile extends ApplyProfile {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String name;
  
  protected List<PnicUplinkProfile> uplink;
  
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
  
  public List<PnicUplinkProfile> getUplink() {
    if (this.uplink == null)
      this.uplink = new ArrayList<>(); 
    return this.uplink;
  }
}
