package com.vmware.vim25;

import com.vmware.vim25.DVPortgroupSelection;
import com.vmware.vim25.SelectionSet;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVPortgroupSelection", propOrder = {"dvsUuid", "portgroupKey"})
public class DVPortgroupSelection extends SelectionSet {
  @XmlElement(required = true)
  protected String dvsUuid;
  
  @XmlElement(required = true)
  protected List<String> portgroupKey;
  
  public String getDvsUuid() {
    return this.dvsUuid;
  }
  
  public void setDvsUuid(String paramString) {
    this.dvsUuid = paramString;
  }
  
  public List<String> getPortgroupKey() {
    if (this.portgroupKey == null)
      this.portgroupKey = new ArrayList<>(); 
    return this.portgroupKey;
  }
}
