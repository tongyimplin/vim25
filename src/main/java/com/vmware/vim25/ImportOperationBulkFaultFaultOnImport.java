package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ImportOperationBulkFaultFaultOnImport;
import com.vmware.vim25.LocalizedMethodFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportOperationBulkFaultFaultOnImport", propOrder = {"entityType", "key", "fault"})
public class ImportOperationBulkFaultFaultOnImport extends DynamicData {
  protected String entityType;
  
  protected String key;
  
  @XmlElement(required = true)
  protected LocalizedMethodFault fault;
  
  public String getEntityType() {
    return this.entityType;
  }
  
  public void setEntityType(String paramString) {
    this.entityType = paramString;
  }
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
