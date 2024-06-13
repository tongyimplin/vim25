package com.vmware.vim25;

import com.vmware.vim25.ExtendedFault;
import com.vmware.vim25.KeyValue;
import com.vmware.vim25.VimFault;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedFault", propOrder = {"faultTypeId", "data"})
public class ExtendedFault extends VimFault {
  @XmlElement(required = true)
  protected String faultTypeId;
  
  protected List<KeyValue> data;
  
  public String getFaultTypeId() {
    return this.faultTypeId;
  }
  
  public void setFaultTypeId(String paramString) {
    this.faultTypeId = paramString;
  }
  
  public List<KeyValue> getData() {
    if (this.data == null)
      this.data = new ArrayList<>(); 
    return this.data;
  }
}
