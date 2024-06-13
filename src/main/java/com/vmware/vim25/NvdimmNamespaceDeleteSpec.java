package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NvdimmNamespaceDeleteSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NvdimmNamespaceDeleteSpec", propOrder = {"uuid"})
public class NvdimmNamespaceDeleteSpec extends DynamicData {
  @XmlElement(required = true)
  protected String uuid;
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
}
