package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VmDiskFileQueryFilter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmDiskFileQueryFilter", propOrder = {"diskType", "matchHardwareVersion", "controllerType", "thin", "encrypted"})
public class VmDiskFileQueryFilter extends DynamicData {
  protected List<String> diskType;
  
  @XmlElement(type = Integer.class)
  protected List<Integer> matchHardwareVersion;
  
  protected List<String> controllerType;
  
  protected Boolean thin;
  
  protected Boolean encrypted;
  
  public List<String> getDiskType() {
    if (this.diskType == null)
      this.diskType = new ArrayList<>(); 
    return this.diskType;
  }
  
  public List<Integer> getMatchHardwareVersion() {
    if (this.matchHardwareVersion == null)
      this.matchHardwareVersion = new ArrayList<>(); 
    return this.matchHardwareVersion;
  }
  
  public List<String> getControllerType() {
    if (this.controllerType == null)
      this.controllerType = new ArrayList<>(); 
    return this.controllerType;
  }
  
  public Boolean isThin() {
    return this.thin;
  }
  
  public void setThin(Boolean paramBoolean) {
    this.thin = paramBoolean;
  }
  
  public Boolean isEncrypted() {
    return this.encrypted;
  }
  
  public void setEncrypted(Boolean paramBoolean) {
    this.encrypted = paramBoolean;
  }
}
