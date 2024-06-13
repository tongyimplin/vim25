package com.vmware.vim25;

import com.vmware.vim25.DVSSelection;
import com.vmware.vim25.SelectionSet;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSSelection", propOrder = {"dvsUuid"})
public class DVSSelection extends SelectionSet {
  @XmlElement(required = true)
  protected String dvsUuid;
  
  public String getDvsUuid() {
    return this.dvsUuid;
  }
  
  public void setDvsUuid(String paramString) {
    this.dvsUuid = paramString;
  }
}
