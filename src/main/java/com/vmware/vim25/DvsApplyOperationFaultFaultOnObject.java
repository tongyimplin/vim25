package com.vmware.vim25;

import com.vmware.vim25.DvsApplyOperationFaultFaultOnObject;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizedMethodFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsApplyOperationFaultFaultOnObject", propOrder = {"objectId", "type", "fault"})
public class DvsApplyOperationFaultFaultOnObject extends DynamicData {
  @XmlElement(required = true)
  protected String objectId;
  
  @XmlElement(required = true)
  protected String type;
  
  @XmlElement(required = true)
  protected LocalizedMethodFault fault;
  
  public String getObjectId() {
    return this.objectId;
  }
  
  public void setObjectId(String paramString) {
    this.objectId = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
