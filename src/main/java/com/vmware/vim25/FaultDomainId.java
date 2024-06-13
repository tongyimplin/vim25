package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FaultDomainId;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultDomainId", propOrder = {"id"})
public class FaultDomainId extends DynamicData {
  @XmlElement(required = true)
  protected String id;
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
}
