package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VASAStorageArray;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VASAStorageArray", propOrder = {"name", "uuid", "vendorId", "modelId"})
public class VASAStorageArray extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String uuid;
  
  @XmlElement(required = true)
  protected String vendorId;
  
  @XmlElement(required = true)
  protected String modelId;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public String getVendorId() {
    return this.vendorId;
  }
  
  public void setVendorId(String paramString) {
    this.vendorId = paramString;
  }
  
  public String getModelId() {
    return this.modelId;
  }
  
  public void setModelId(String paramString) {
    this.modelId = paramString;
  }
}
