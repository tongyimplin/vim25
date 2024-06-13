package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VmConfigFileQueryFilter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmConfigFileQueryFilter", propOrder = {"matchConfigVersion", "encrypted"})
public class VmConfigFileQueryFilter extends DynamicData {
  @XmlElement(type = Integer.class)
  protected List<Integer> matchConfigVersion;
  
  protected Boolean encrypted;
  
  public List<Integer> getMatchConfigVersion() {
    if (this.matchConfigVersion == null)
      this.matchConfigVersion = new ArrayList<>(); 
    return this.matchConfigVersion;
  }
  
  public Boolean isEncrypted() {
    return this.encrypted;
  }
  
  public void setEncrypted(Boolean paramBoolean) {
    this.encrypted = paramBoolean;
  }
}
