package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestRegKeyNameSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRegKeyNameSpec", propOrder = {"registryPath", "wowBitness"})
public class GuestRegKeyNameSpec extends DynamicData {
  @XmlElement(required = true)
  protected String registryPath;
  
  @XmlElement(required = true)
  protected String wowBitness;
  
  public String getRegistryPath() {
    return this.registryPath;
  }
  
  public void setRegistryPath(String paramString) {
    this.registryPath = paramString;
  }
  
  public String getWowBitness() {
    return this.wowBitness;
  }
  
  public void setWowBitness(String paramString) {
    this.wowBitness = paramString;
  }
}
